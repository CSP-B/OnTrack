MACHINE ReleaseTable

SEES Context, ControlTable

CONSTANTS
    releaseTable

/* put them on the track after the point in the direction after the point
4/4/2014 - not sure whether the release should happen on the crossing or afterwards */
PROPERTIES
/*
Throw away:
points : p1, p4
routes : r1, r4, r5a, r5d
tracks : tc1, tc2, tc4, tc5, tc11, tc12, tc15, tc16
signals: s1, s4, s6, s9
*/
    releaseTable :  TRACK <-> (ROUTE*POINT) &
    releaseTable = { 
        /*  TC6 |->   (R1 |-> P1), */
        /*  TC6 |->   (R2 |-> P1), */
        /*  TC2 |->   (R5A |-> P1), */
        /*  TC5 |->   (R5B |-> P1), */

        /*  TC19 |->   (R1 |-> P2), */
          TC19 |->   (R2 |-> P2),
        /*  TC6 |->   (R5A |-> P2), */
          TC6 |->   (R5B |-> P2),

        /*  TC7 |->   (R5A |-> P3), */
          TC7 |->   (R5B |-> P3),
          TC18 |->   (R5C |-> P3),
         /* TC18 |->   (R5D |-> P3),  */        

          /*TC14 |->   (R3 |-> P4),*/
          /*TC14 |->   (R4 |-> P4),*/
          /*TC12 |->   (R5C |-> P4),*/
          /*TC16 |->   (R5D |-> P4),*/

          TC8 |->   (R3 |-> P5),
          /*TC8 |->   (R4 |-> P5),*/
          TC14 |->   (R5C |-> P5),
         /* TC14 |->   (R5D |-> P5),*/

         /* TC20 |->   (R1 |-> P6), */
          TC20 |->   (R2 |-> P6),
          TC20 |->   (R3 |-> P6) /*,*/
         /* TC20 |->   (R4 |-> P6) */
} &

    ran(releaseTable) = lockTable


END


