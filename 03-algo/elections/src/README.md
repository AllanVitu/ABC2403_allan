#Exercie 2.6 : Élections
	
	Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.

En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.

Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.


Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second 

tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).


```
	**CONSTANTES**
	
	P1 est un REEL <-- 50%
	P2 est un REEL <-- 12.5%

```






```
	**VARIABLES**
	 
	 scoreCandidat1 est un NOMBRE ENTIER
	 scoreCandidat2 est un NOMBRE ENTIER
	 scoreCandidat3 est un NOMBRE ENTIER
	 scoreCandidat4 est un NOMBRE ENTIER
	 nombreTotalDeVotes est un NOMBRE REEL

```



```
	**TRAITEMENT**
	
	ECRIRE "Veuillez saisir le nombre de candidats"
		LIRE "nombreCandidats"
		
	SI nombreCandidats >= 50
		ALORS premierTour <-- nombreCandidats * P1
		
	SINON SI nombreCandidats >= 12.5
		ALORS secondTours <-- 12.5 * P1 + (nombreCandidats - 50) * P2
	


``` 