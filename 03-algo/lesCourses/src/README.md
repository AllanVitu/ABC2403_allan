# Exercice 3.9 : Les courses

Écrire un algorithme qui permet de connaître ses chances de gagner au tiercé, quarté, quinté et autres impôts volontaires.

On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués. Les deux messages affichés devront être :

Dans l’ordre : une chance sur X de gagner 
Dans le désordre : une chance sur Y de gagner 
X et Y nous sont donnés par la formule suivante, si n est le nombre de chevaux partants et p le nombre de chevaux joués, le signe ! signifie « factorielle » :

X = n! / (n - p)! 
Y = n! / (p! * (n – p)!)
Cet algorithme peut être écrit d’une manière simple, mais relativement peu performante. Ses performances peuvent être singulièrement augmentées par une petite astuce. Vous commencerez par écrire la manière la plus simple, puis vous identifierez le problème, et écrirez une deuxième version permettant de d’améliorer les performances de l’algorithme.

Validez votre travail avec votre formateur avant de passer à la suite.

```
FONCTIONS

FONCTION calculterFactorielle(nombreUtilisateur: ENTIER)
DEBUT

	sommeFactorielle est un ENTIER
	
	POUR (i = 1 | i <= nombreUtilisateur | i++
    	ALORS sommeFactorielle *= i
    FIN POUR
    
    RETOURNE sommeFactorielle
	
FIN
```


```
VARIABLES

X
Y
N
```

```
TRAITEMENT

N = calculterFactorielle(8)

ECRIRE "Saisissez 
```