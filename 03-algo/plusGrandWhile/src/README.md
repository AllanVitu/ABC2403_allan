# Exercice 3.7 : Et le plus grand est… encore.

Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.

```
VARIABLES

nombreUtilisateur

plusGrand = Integer.MIN_VALUE

i = 1 est un ENTIER

```

```
TRAITEMENT

TANT QUE i <= 20
	ECRIRE "Saisissez un nombre ", i , " : "
		LIRE nombreUtilisateur
 i++
 
 SI nombreUtilisateur > plusGrand
	ALORS plusGrand = nombreUtilisateur

	FIN SI
FIN TANT QUE

		ECRIRE "Le plus grand des nombres saisis est : ", plusGrand"