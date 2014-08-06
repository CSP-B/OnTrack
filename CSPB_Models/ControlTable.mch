MACHINE ControlTable

SEES Context, Topology

CONSTANTS
  entryTable,
  normalTable, 
  reverseTable, 
  clearTable, 
  directedClearTable,
  lockTable


PROPERTIES
  entryTable: ENTRY --> POW(TRACK) &
  normalTable :  ROUTE <-> POINT &
  reverseTable : ROUTE <-> POINT & 
  clearTable :   ROUTE --> POW(TRACK) &
  directedClearTable : ROUTE --> POW (directedTrack) &
  lockTable :    ROUTE <-> POINT &
  ! r. (r : ROUTE & r : dom(clearTable) => (clearTable(r) - BUFFER) = dom(directedClearTable(r))) &
/* we are assuming that the track a train is to be placed upon needs to be entry and the first one on the route in the direction of travel */

  entryTable = { 
    TC10 |-> {TC10,TC9}
    } &

/* point needs to be set in normal for the two directional routes through it */
  normalTable  = { 
           /* -- (R2 |-> P1), */
           /* -- (R3 |-> P4), */
            (R3 |-> P5), 
            (R3 |-> P6), 
           /* -- (R4 |-> P5), */
           /* -- (R4 |-> P6), */
           /* -- (R5A |-> P2), */
           /* -- (R5A |-> P3), */
           /* -- (R5B |-> P1), */
            (R5B |-> P2), 
            (R5B |-> P3) /* --,  */
           /* -- (R5C |-> P4)  */
            } &
/* the reverse setting is only being used for one direction through the point */
  reverseTable = { 
           /* --(R1 |-> P1),  */ 
           /* --(R1 |-> P2),   */
           /* --(R1 |-> P6),  */
            (R2 |-> P2), 
            (R2 |-> P6), 
           /* --(R4 |-> P4),  */
           /* --(R5A |-> P1),  */
            (R5C |-> P3), 
            (R5C |-> P5) /* --,  */
           /* --(R5D |-> P3),  */
           /* --(R5D |-> P4),  */
           /* --(R5D |-> P5)  */
            } &

/* removed R2 in this example in order to deal with the buffer */
  clearTable = {/* -- R1  |-> {TC2, TC3, TC6, TC7, TC17, TC19, TC20}, */
                 R2  |-> {
                          /* -- TC5, TC3,  */
                           TC6, TC7, TC17, TC19, TC20},
                 R3 |-> {
                           /*-- TC12, TC13,  */
                           TC14, TC18, TC19, TC20},
                /* -- R4 |-> {TC16, TC13, TC14, TC18, TC19, TC20},  */
                /* -- R5A |-> {TC9, TC8, TC7, TC6, TC3, TC2, TC1},   */
                 R5B |-> {TC9, TC8, TC7, TC6 , TC3 
                          /* --, TC5, TC4  */
                          },
                 R5C |-> {TC9, TC8, TC17, TC18, TC14 , TC13 
                          /* --, TC12, TC11  */
                          } /*,*/
                /* -- R5D |-> {TC9, TC8, TC17, TC18, TC14, TC13, TC16, TC15}  */
               }  &
  directedClearTable = { 
                /* -- R1  |-> {(TC2 |-> (C1, C2)), (TC3 |-> (C2, C3)), (TC6 |-> (C3, C4)), (TC7 |-> (C4, C12)), (TC17 |-> (C12, C15)), (TC19 |-> (C15, C22)), (TC20 |-> (C22, C23))},  */
                 R2  |-> {
                         /* -- (TC5 |-> (C10, C11)), (TC3 |-> (C11, C3)),  */
                          (TC6 |-> (C3, C4)), (TC7 |-> (C4, C12)), (TC17 |-> (C12, C15)), (TC19 |-> (C15, C22)), (TC20 |-> (C22, C23))},
                 R3 |-> {
                         /* -- (TC12 |-> (C17, C18)), (TC13 |-> (C18, C19)),  */
                          (TC14 |-> (C19, C20)), (TC18 |-> (C20, C21)), (TC19 |-> (C21, C22)), (TC20 |-> (C22,C23))},
                /* -- R4 |-> {(TC16 |-> (C26, C27)), (TC13 |-> (C27, C19)), (TC14 |-> (C19, C20)), (TC18 |-> (C20, C21)), (TC19 |-> (C21, C22)), (TC20 |-> (C22,C23))},  */
                /* -- R5A |-> {(TC9 |-> (C7, C6)), (TC8 |-> (C6, C5)), (TC7 |-> (C5, C4)), (TC6 |-> (C4, C3)), (TC3 |-> (C3, C2)), (TC2 |-> (C2, C1)), (TC1 |-> (C1, C0))},  */  
                 R5B |-> {(TC9 |-> (C7, C6)), (TC8 |-> (C6, C5)), (TC7 |-> (C5, C4)), (TC6 |-> (C4, C3)) /*, (TC3 |-> (C3, C11))*/
                         /* -- , (TC5 |-> (C11, C10)), (TC4 |-> (C10, C9))  */
                          },
                 R5C |-> {(TC9 |-> (C7, C6)), (TC8 |-> (C6, C13)), (TC17 |-> (C13, C14)), (TC18 |-> (C14, C20)), (TC14 |-> (C20, C19)) /*, (TC13 |-> (C19, C18))*/
                          /*--, (TC12 |-> (C18, C17)), (TC11 |-> (C17, C16))  */
                          } /*,*/
                /* -- R5D |-> {(TC9 |-> (C7, C6)), (TC8 |-> (C6, C13)), (TC17 |-> (C13, C14)), (TC18 |-> (C14, C20)), (TC14 |-> (C20, C19)),(TC13 |-> (C19, C27)), (TC16 |-> (C27, C26)), (TC15 |-> (C26, C25))}  */

               }  &

  lockTable = normalTable \/ reverseTable

END


