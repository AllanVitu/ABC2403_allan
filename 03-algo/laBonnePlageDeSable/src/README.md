# Exercice 3.1 : La bonne plage de sable
Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.



```
VARIABLES

nombreUtilisateur
```

```
TRAITEMENT


FAIRE
	ECRIRE "Saisissez un chriffre entre 1 et 3"
TANT QUE
	nombreUtilisateur < 1 || nombreUtilisateur > 3
		ECRIRE "Bravo vous avez réussi ! ", nombreUtilisateur
		
FIN TANT QUE