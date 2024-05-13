## Algorithme  FootBall


```
VARIABLES

age est un ENTIER

categorie est une CHAINE DE CARACTERE

```

```
TRAITEMENT


ECRIRE "Saisissez votre age"
	LIRE age
	
	SI age < 5
		ALORS
			categorie := "trop jeune"
			
	
	SINON SI age < 7
		ALORS
			categorie := "Débutant" 
	
	
	SINON SI age < 9
		ALORS
			categorie := "Poussin"
			
			
	SINON SI age < 11
		ALORS
			categorie := "Benjamin"
			
	
	SINON SI age < 13
		ALORS
			categorie := "Pupille"
			
			
	SINON SI age < 15
		ALORS
			categorie := "Minime"
			
			
	SINON SI age < 17
		ALORS
			categorie := "Cadet"
			
	
	SINON SI age < 19 
		ALORS
			categorie := "Junior"
			
			
	SINON SI age < 35
		ALORS
			categorie := "Senior"
			
			
	SINON
		ALORS
			categorie := "Veterant"
			
	```
	
	
	
	***AFFICHAGE***