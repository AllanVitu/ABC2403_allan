# Exercice 3.2 : La bonne plage de galets

Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.


```
VARIABLES

nombreUtilisateur


```




```
TRAITEMENT

FAIRE
	ECRIRE "Saisissez un nombre entre 10 et 20"


SI nombreUtilisateur est > 20
	ECRIRE "Plus petit !"

SI nombreUtilisateur est < 10
	ECRIRE "Plus grand !
	
TANT QUE	
	nombreUtilisateur < 20 || nombreUtilisateur > 10
		ECRIRE "Yes, you did it ! ", nombreUtilisateur

```