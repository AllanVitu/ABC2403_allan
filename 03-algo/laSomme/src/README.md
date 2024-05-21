# Exercice 3.4 : La somme

Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

La somme des nombres jusque 5 est: 15

NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.

```
VARIABLES

nombreDeDepart est un ENTIER

sommeDesEntiers est un ENTIER

```


```
TRAITEMENT

ECRIRE "Saisisssez un nombre de départ"
	LIRE nombreDeDepart
	
	POUR i = 0 | i <= nombreDeDepart | i++
		ALORS sommeDesEntiers += i
		
ECRIRE "La somme des nombres jusque " + nombreDeDepart + " est " + sommeDesEntiers

FIN POUR