MACHINE Context

/* BE didn't work */

SETS
    TRACKSTATUS = {occ,empty};
    ASPECT = {red,green};
    ALLTRACK = {
       /*TC1, TC2, */
       TC3, 
       /*TC4, TC5,*/
       TC6, TC7, TC8, TC9, TC10, 
       /*TC11, TC12,*/
       TC13, TC14, 
       /*TC15, TC16,*/ 
       TC17, TC18, TC19, TC20, TC21, nullTrack };

    ALLCONNECTOR = { C0,
                  C1, C2, C3, C4, C5, C6, C7, C8, C9, 
                  C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20, C21, C22, C23, C24, C25, C26, C27
                   };
    ALLSIGNAL = {
       /*S1, */
       S2,  S3, 
       /*S4, */
       S5, 
       /*S6, */
       S7, S8
       /*S9*/
       };
    TRAIN = {albert, bertie};
    ALLPOINT = {
        /*P1,*/
        P2,P3,
        /*P4, */
        P5, P6};
    POINTPOSITION = {normal,reverse};
    POINTSTATUS = {locked, unlocked};
    ROUTE = {
       /*R1, */
       R2, R3, 
       /*R4, */
       /*R5A,*/ 
       R5B, R5C
       /*, R5D*/
       }
/*
Throw away:
points : p1, p4
routes : r1, r4, r5a, r5d
tracks : tc1, tc2, tc4, tc5, tc11, tc12, tc15, tc16
signals: s1, s4, s6, s9
*/

/* kept buffer as a constant, tracks still include buffers,
signals don't include those used for buffers because they are not associated with routes not included the BUFFER signals for now
    BUFFERSIGNAL,

*/
CONSTANTS
    SIGNALSTATUS, 
    CONNECTOR,
    TRACK,
    ENTRY,
    EXIT,
    POINT,
    BUFFER,
    SIGNAL,
    CROSSING
  

/*removed the buffer signal for not since not reading the value of the signals in the CSP
   &
    BUFFERSIGNAL = {S3} &
    SIGNAL = ALLSIGNAL - BUFFERSIGNAL
*/
/*let's make the AF a buffer track so no longer and exit, but also CA is also a crossing, doesn't need to have a special name that's why a constant and its value is an element of ALLTRACK */

PROPERTIES
    SIGNALSTATUS = ASPECT &
    CONNECTOR = ALLCONNECTOR &
    POINT <: ALLPOINT & POINT = ALLPOINT &
    ENTRY = { TC10 } &
    EXIT = { TC21 } &
    BUFFER = { 
       TC3, TC13
       /*TC1, TC4, TC11, TC15*/
       } &
    BUFFER /\ ENTRY = {} &
    BUFFER /\ EXIT = {} & 
    CROSSING = {TC17} &
    TRACK = ALLTRACK - {nullTrack} &
    SIGNAL = ALLSIGNAL 
END


