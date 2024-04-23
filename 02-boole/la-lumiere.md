2.. La lumière d'un véhicule s'éclaire si une des deux portes avant est ouverte (capteurs pd et pg à coupure de circuit) ou si l'interrupteur du plafonnier est appuyé.

Présentez:
•	Les propositions
•	La table de vérité
•	L'expression booléenne simplifiée


-La lumiere s'allume si la porte a gauche est ouverte. P2
-La lumiere s'allume si la porte droite est ouverte. P3
-La lumiere s'allume si le l'interrupteur est appuyé. P4
-La lumiere ne s'allume pas si la porte droite est fermé.
-La lumiere ne s'allume pas si la porte gauche est fermé.
-La lumiere ne s'allume pas l'interrupteur n'est pas appuyé.
-La lumiere s'allume si la porte gauche est ouverte et l'interrupteur appuyé.
-La lumiere s'allume si la porte droite est ouverte et l'interrupteur appuyé.

P2  |  P3  |  P4  |  P1  |
 0      0      0      0
 1      0      0      1
 0      1      0      1
 0      0      1      1
 1      1      0      1
 0      1      1      1
 1      0      1      1
 1      1      1      1


P1 = (p2.p3.p4)+(p2.p3.p4)+(p2.p3.p4)+(p2.p3.p4)+(p2.p3.p4)

### Expression Boolèenne

``P1 est VRAI si P2 est VRAI ou P3 est VRAI ou P4 est VRAI``

 ``P1 = P2 + P3 + P4``
