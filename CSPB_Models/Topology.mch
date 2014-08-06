MACHINE Topology

SEES  Context

CONSTANTS
    signal, homeSignal, homePoint, 
    directedTrack, staticDirection, dynamicDirection,
    entryDirection,
    lastTopologicalTrack, topologicalUnits


/* Note that routes are not associated with buffers, so the signal for the buffer will never be set to green because interlocking always using signal(route) to identify the signal. At the moment taken the buffer signal out of homeSignal 		   S3 |-> (AF, (C5, C6))
 */
PROPERTIES
    signal : ROUTE --> SIGNAL &
    signal = { /*-- (R1 |-> S1),*/
               (R2 |-> S2),
               (R3 |-> S3),
               /*-- (R4 |-> S4),*/
               /*-- (R5A |-> S5),*/
               (R5B |-> S5),
               (R5C |-> S5) /*--,
               -- (R5D |-> S5)*/ 
               } &
homeSignal : ALLSIGNAL >-> TRACK * (CONNECTOR*CONNECTOR) &   
    homeSignal = { /*-- S1 |-> (TC1,(C0,C1)) ,*/
                   S2 |-> (TC3, (C11, C3)),
                   S3 |-> (TC13, (C18,C19)),
                   /*-- S4 |-> (TC15, (C25,C26)),*/
                   S5 |-> (TC10,(C8,C7)),
                   /*-- S6 |-> (TC1,(C1,C0)),*/
                   S7 |-> (TC3,(C3,C11)),
                   S8 |-> (TC13,(C19,C18)) /*-- ,
                   -- S9 |-> (TC15,(C26,C25))*/
                 } &
 
    homePoint : POINT --> TRACK &
    homePoint = { /*-- P1 |-> TC3, */
                  P2 |-> TC7, 
                  P3 |-> TC8,  
                  /*-- P4 |-> TC13,  */
                  P5 |-> TC18,  
                  P6 |-> TC19 } &

/* 4.4.2014 added that points can't be crossings can't say that in Context because the association of which point goes with which track isn't done until topology */
    ran(homePoint) /\ CROSSING  = {} &

    entryDirection : ENTRY --> CONNECTOR*CONNECTOR &
    entryDirection = { TC10 |-> (C8,C7)} &
               
   directedTrack : TRACK <-> CONNECTOR * CONNECTOR &
   directedTrack =  {  
        /*-- TC1 |-> (C0,C1), */
        /*-- TC1 |-> (C1,C0), */
        /*-- TC2 |-> (C1,C2), */
        /*-- TC2 |-> (C2,C1), */
        /*TC3 |-> (C2,C3),*/
        /*TC3 |-> (C3,C2),*/
        TC3 |-> (C11,C3),
        TC3 |-> (C3,C11),
        /*-- TC4 |-> (C9,C10), */
        /*-- TC4 |-> (C10,C9), */
        /*-- TC5 |-> (C10,C11), */
        /*-- TC5 |-> (C11,C10), */
        TC6 |-> (C3,C4),
        TC6 |-> (C4,C3),
        TC7 |-> (C5,C4),
        TC7 |-> (C4,C12),
        TC8 |-> (C6,C5),
        TC8 |-> (C6,C13),
        TC9 |-> (C7,C6),
        TC10 |-> (C8,C7),
        /*-- TC11 |-> (C16,C17), */
        /*-- TC11 |-> (C17,C16), */
        /*-- TC12 |-> (C17,C18), */
        /*-- TC12 |-> (C18,C17), */
        TC13 |-> (C19,C18),
        TC13 |-> (C18,C19),
        /*TC13 |-> (C19,C27),*/
        /*TC13 |-> (C27,C19),*/
        TC14 |-> (C19,C20),
        TC14 |-> (C20,C19),
        /*-- TC15 |-> (C25,C26), */
        /*-- TC15 |-> (C26,C25), */
        /*-- TC16 |-> (C26,C27), */
        /*-- TC16 |-> (C27,C26), */
        TC17 |-> (C13,C14),
        TC17 |-> (C12,C15),
        TC18 |-> (C14,C20),
        TC18 |-> (C20,C21),
        TC19 |-> (C15,C22),
        TC19 |-> (C21,C22),
        TC20 |-> (C22,C23),
        TC21 |-> (C23,C24)
    } &



         
/*   !(x . (x : CROSSING => card(directedTrack(x)) >=2 )) & card(directedTrack(x)) <=4)) &
*/
/* determined for those tracks that are not points */
    staticDirection : CONNECTOR <-> CONNECTOR &
    staticDirection = ran({TC7, TC8, TC18, TC19} <<| directedTrack) &

/*reverse direction not being used in the model at all but there just to put in a point */

    dynamicDirection : POINT * POINTPOSITION <-> CONNECTOR * CONNECTOR &
    dynamicDirection = {
       /*-- (P1,normal)  |-> (C3, C11), */
       /*-- (P1,normal)  |-> (C11,C3),  */
       /*-- (P1,reverse)  |-> (C3,C2), */
       /*-- (P1,reverse)  |-> (C2,C3), */
       (P2,normal)  |-> (C5,C4),   
       (P2,reverse)  |-> (C4,C12), 
       (P3, normal) |-> (C6, C5),
       (P3, reverse) |-> (C6, C13), 
       /*-- (P4, normal) |-> (C19, C18), */
       /*-- (P4, normal) |-> (C18, C19), */
       /*-- (P4, reverse) |-> (C19, C27), */
       /*-- (P4, reverse) |-> (C27, C19), */
       (P5, normal) |-> (C20, C21), 
       (P5, reverse) |-> (C14, C20), 
       (P6, normal) |-> (C21, C22),       
       (P6, reverse) |-> (C15, C22)
    } 
    
    &
    
    lastTopologicalTrack : ROUTE --> (directedTrack) &
    lastTopologicalTrack = {
                 R2 |-> (TC20, (C22, C23)),
                 R3 |-> (TC20, (C22,C23)),
                 R5B |-> (TC3, (C3, C11)),
                 R5C |-> (TC13, (C19, C18))
        }  &  
       
    topologicalUnits : ROUTE --> POW(directedTrack) &
    topologicalUnits = { 
                 R2  |-> {
                          (TC6 |-> (C3, C4)), (TC7 |-> (C4, C12)), 
                          (TC17 |-> (C12, C15)), (TC19 |-> (C15, C22)), 
                          (TC20 |-> (C22, C23))},
                 R3 |-> {
                          (TC14 |-> (C19, C20)), (TC18 |-> (C20, C21)), 
                          (TC19 |-> (C21, C22)), (TC20 |-> (C22,C23))},
                 R5B |-> {(TC9 |-> (C7, C6)), (TC8 |-> (C6, C5)), (TC7 |-> (C5, C4)), 
                          (TC6 |-> (C4, C3)), (TC3 |-> (C3, C11))
                          },
                 R5C |-> {(TC9 |-> (C7, C6)), (TC8 |-> (C6, C13)), 
                          (TC17 |-> (C13, C14)), (TC18 |-> (C14, C20)), 
                          (TC14 |-> (C20, C19)) , (TC13 |-> (C19, C18))
                          } /*,*/

               }  

END


