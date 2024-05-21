# Exercice 3.6 : Et le plus grand est…
Érire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui inqique ensuite quel est le plus grand parmi ces 20 nombres.

Exemple de fonctionnement du programme :

```
Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
etc...
Entrez le nombre numéro 20: 6

Résultat : 
Le plus grand des nombres saisis est : 14.
14 était le nombre numéro 2.
```

```
VARIABLES

nombreUtilisateur

plusGrand

```

```
TRAITEMENT

POUR i = 1 | i<= 20 | i++
	ECRIRE "Saisissez un nombre ", i , " : "
		LIRE nombreUtilisateur
		
SI nombreUtilisateur > plusGrand
	ALORS plusGrand = nombreUtilisateur

	FIN SI
FIN POUR

		ECRIRE "Le plus grand des nombres saisis est : ", plusGrand"
