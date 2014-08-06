MACHINE Interlocking
SEES  
  Context, Topology, ControlTable, ReleaseTable
SETS
  ANSWERS = {yes,no}


VARIABLES
  pos, nextd, signalStatus,
  normalPoints, reversePoints,
  movedPoints, currentPointLocks, currentRouteLocks 

/* 
********************************
MR: currentRouteLocks goes
       unitLocks: directedTrack -> {locked, unlocked}
*/


/* all signals have a status but buffered signals always show red, put as invariant to make sure that the operations don't set them to green by mistake 
removed the need for buffer signal at the moment
  signalStatus[BUFFERSIGNAL] = {red} &

*/
INVARIANT
/*  pos : TRAIN 
    +-> ALLTRACK*(ALLCONNECTOR*ALLCONNECTOR) &
*/
/* include the null track for the position, and what connectors, shall we have dummy connectors*/
  pos : TRAIN 
    +-> directedTrack &

  nextd : 
    ALLTRACK*(ALLCONNECTOR*ALLCONNECTOR) 
    +-> ALLTRACK*(ALLCONNECTOR*ALLCONNECTOR) &
  signalStatus : ALLSIGNAL --> SIGNALSTATUS &
  normalPoints <: POINT & 
  reversePoints <: POINT & 
  normalPoints /\ reversePoints = {} &
  normalPoints \/ reversePoints = POINT &
  movedPoints <: POINT &
  currentPointLocks  : ROUTE <-> POINT &
  currentPointLocks <: lockTable &
/* new function to lock all the tracks in their direction when a route has been set 
  currentRouteLocks : ROUTE <-> ALLTRACK*(ALLCONNECTOR*ALLCONNECTOR) 
   */
 currentRouteLocks : ROUTE <-> directedTrack
 


/* set all signals to red including the buffered ones but since ALLSIGNALS does not include buffers at the moment no need to worry about this */

INITIALISATION
  BEGIN
  pos := {} ||
  signalStatus := ALLSIGNAL * {red} ||
  normalPoints := POINT ||
  reversePoints := {} ||
  movedPoints := {} || 
  currentPointLocks := {} ||

/* 
********************************
MR: currentRouteLocks goes
       unitLocks := {}
*/

  currentRouteLocks := {} ||
  nextd := { 
    (p1 |-> p2) | 
      #(t1,d1,t2,d2).
        (
         p1 = (t1,d1) & p2 = (t2,d2) & 
         t1 /= t2 &
         ran({d1}) = dom({d2}) &
         d1 : directedTrack[{t1}] &
         d1 : staticDirection \/
              dynamicDirection[POINT*{normal}] &
         d2 : directedTrack[{t2}] & 
         d2 : staticDirection \/
              dynamicDirection[POINT*{normal}]
        ) 
  }
END
OPERATIONS
collision =
SELECT #(t1,t2).(t1 : TRAIN & t2 : TRAIN & 
  t1:dom(pos) & t2:dom(pos) & t1 /= t2 &
  (dom({pos(t1)}) - (EXIT \/ ENTRY \/ {nullTrack})) /\ 
  (dom({pos(t2)})-  (EXIT \/ ENTRY \/ {nullTrack})) /= {})
THEN skip
END;

derailment =
SELECT dom(ran(pos)) /\ homePoint[movedPoints] /= {}
THEN skip
END;

runthrough =
SELECT nullTrack : dom(ran(pos))
THEN skip
END;


/* 2/4/2014 added route lock in the if clause to check that the track is not locked by an exisiting route request*/
bb <-- enter(t,entryPos) =
PRE
  t : TRAIN & entryPos : ENTRY 
THEN
  IF (t /: dom(pos) & 
      entryTable(entryPos) /\ dom(ran(pos)) = {}) &
     entryPos /: dom(ran(currentRouteLocks))

/* 
********************************
MR: currentRouteLocks goes
    entryPos can't be locked
*/

  THEN 
    bb := yes || 
    movedPoints := {} || 
    pos(t) := (entryPos,entryDirection(entryPos))
  ELSE 
    bb := no
  END
END;

/* 
enter(t, entryPos) =
PRE t : TRAIN & t /: dom(pos) & 
  entryPos : ENTRY &
  entryPos /: dom(ran(pos)) &
  entryTable(entryPos) /\ dom(ran(pos)) = {}
THEN
  movedPoints := {} ||
  pos(t) := (entryPos,entryDirection(entryPos))
END; 
*/

/* need to make sure we released the track lock on the exit track too */
exit(t,exitPos) =
PRE t : TRAIN & 
  dom({pos(t)}) = {exitPos} & exitPos : EXIT
THEN
  movedPoints := {} ||
  pos := {t} <<| pos ||
  currentRouteLocks :=  currentRouteLocks |>> {pos(t)} 

/* 
********************************
MR: currentRouteLocks goes
    exitPos can't be locked
*/

END;

/* make it robust because the direction of the signal is not captured in CSP */
s,b <-- nextSignal(t) = 
PRE t : TRAIN & t : dom(pos) 
THEN 
  IF pos(t) : ran(homeSignal) 
  THEN
    movedPoints := {} ||
    s := signalStatus(homeSignal~(pos(t))) || b:= TRUE
  ELSE
    s := red || b:= FALSE || movedPoints := {}
  END
END;

bb <-- request(route) = 
PRE route : ROUTE THEN
  LET occTracks,emptyTracks BE 
    occTracks =  dom(ran(pos)) &
    emptyTracks = TRACK - occTracks IN
    /* are the tracks for a route empty  and 2/4/2014 added the tracks from the requested route have not locks on them*/
    IF  ((signalStatus(signal(route)) = red)  & 
        (clearTable(route) <: emptyTracks )) &
        ( (clearTable(route) <| ran(currentRouteLocks)) <: directedClearTable(route))

/* 
********************************
MR: currentRouteLocks goes

directedClearTable(route) -- these are the locks that we want

either these tracks are unlocked or locked in the right position

 (x,c1,c2) \in directedClearTable(route)
 =>
 unitLocks(x,c1,c2) = empty /\ unitLocks(x,c2,c1) = empty /\


\/ unitlock(x) 

*/




    THEN
      LET unlockedPoints BE 
          unlockedPoints = POINT - ran(currentPointLocks) IN
        /* all points in right position or unlocked */ 
        IF ((normalTable[{route}] <: 
            normalPoints \/ unlockedPoints ) & 
           (reverseTable[{route}] <: 
            reversePoints \/ unlockedPoints))
        THEN
          LET np, rp BE
            np = (normalPoints \/ normalTable[{route}]) - 
                  reverseTable[{route}] &
            rp = (reversePoints \/ reverseTable[{route}]) - 
                  normalTable[{route}]
          IN
            /* move points on the route 
               that need to be moved */
            movedPoints := (normalPoints - np) \/ 
                           (reversePoints - rp) ||
            normalPoints := np  ||
            reversePoints := rp ||
            /* for each point p of route, lock p */
            currentPointLocks := 
              currentPointLocks\/({route} <| lockTable) ||

           /* add the locks for the new tracks to the route locks, this adds the duplicate ones for tracks which are also points */
            currentRouteLocks :=
                   currentRouteLocks \/ ({route} * directedClearTable(route) ) ||

            /* set signal of route to greeen */
            signalStatus(signal(route)) := green||
            /* grant the request */ 
            bb := yes ||
            nextd := { 
              (p1 |-> p2) | 
                #(t1,d1,t2,d2).
                  (
                    p1 = (t1,d1) & 
                    p2 = (t2,d2) & t1 /= t2 &
                    ran({d1}) = dom({d2}) &
                    d1 : directedTrack[{t1}] &
                    d1 : staticDirection \/
                      dynamicDirection[np*{normal} \/ 
                                       rp*{reverse}] &
                    d2 : directedTrack[{t2}] & 
                    d2 : staticDirection \/
                      dynamicDirection[np*{normal} \/ 
                                       rp*{reverse}]
                  ) 
            }
           
          END /* end let */
        ELSE
          /* refuse request */
          movedPoints := {} ||
          bb:= no
        END /* end if */
      END /* end let */
    ELSE
      /* refuse request */
      movedPoints := {} ||
      bb:= no
    END /* end if */
  END /* let */
END; /* end pre */


/* 2/4/2014 added a track release when a move happens but we have lost the concept of which route we are moving along inorder to release the track. */
newp <-- move(t,currp) =
PRE t : TRAIN & t : dom(pos) & 
  {currp} = dom({pos(t)}) 
THEN
  movedPoints := {} ||
    IF (pos(t) /: dom(nextd)) THEN
      pos(t) := (nullTrack,(C0,C0)) ||
      newp := nullTrack 
    ELSE
      LET (track,d) BE (track,d) = nextd(pos(t)) IN
        pos(t) := (track,d) ||
        newp := track ||
        IF (pos(t) : ran(homeSignal)) THEN
            signalStatus(homeSignal~(pos(t))) := red
        END ||
        currentPointLocks := 
          currentPointLocks - releaseTable[{track}] 
      END ||
/* now release the track just moved over, pos(t) gives track and direction */
        currentRouteLocks :=  currentRouteLocks |>> {pos(t)}
      
    END
END;


/* commented out 2/4/2014 since don't have a buffer in the model at the moment.
 change the connectors round for the track that the train is on, check that the train is on a buffer track and that there is a buffer signal which is red & (homeSignal~(pos(t)) : BUFFERSIGNAL)&  (signalStatus(homeSignal~pos(t)) = red)  
*/
changeDirection(t,currp) =
PRE t : TRAIN & t : dom(pos) & 
  {currp} = dom({pos(t)}) & currp : BUFFER
THEN
        movedPoints := {} ||
   
      LET (track,d) BE (track,d) = pos(t) IN 
       LET (d1,d2) BE (d1,d2) = d IN
        pos(t) := (track,(d2,d1)) ||
      /*  no need to remove the lock on the track because it is there
        */
      currentRouteLocks := (currentRouteLocks |>> {pos(t)}) \/ 
                           (currentRouteLocks~[{pos(t)}] * {(track,(d2,d1))})
      END
     END
  

END;



/* release the route locks too, don't have anything to get in the if clause because don't have a lock table for the route lock only the point locks */
bb <-- release(route) =
PRE route : ROUTE THEN 
  movedPoints := {} ||
  LET emptyTracks BE 
  emptyTracks = TRACK - dom(ran(pos)) IN
    IF 
      /* the signal of the route is green */
      (signalStatus(signal(route)) = green)  & 
      /* points locked for the route */
      currentPointLocks[{route}] = lockTable[{route}] &
      /* no train is in the track preceding the route 
         (i.e. nothing close enough to go 
          through the red light ) */ 
      dom({homeSignal(signal(route))}) <: emptyTracks 

    THEN 
      signalStatus(signal(route)) := red ||
      currentPointLocks := {route} <<| currentPointLocks ||
      currentRouteLocks := {route} <<| currentRouteLocks ||
      bb := yes
    ELSE
      bb := no
    END
  END /* let */
END    
END
