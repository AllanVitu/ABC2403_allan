# Ecrire un programme qui affiche “Hello World !”.


```
ECRIRE "Hello World"

FIN PROGRAMME
```

# L’utilisateur est invité à saisir son prénom dans la console.

Le programme affiche “Bonjour “ suivi du prénom saisi.

Exemple de fonctionnement du programme en mode Console :

```
VARIABLES
     prenom est une CHAINE DE CARACTERES

TRAITEMENT
     ECRIRE "Saisissez votre prénom"
     LIRE prenom
     ECRIRE "bonjour ", prenom, "."


Veuillez saisir votre prénom : Allan 
Bonjour Allan
Appuyez sur une touche pour quitter.
```

Alternative avec controle sur la longueur du prénom

```
VARIABLES
     prenom est une CHAINE DE CARACTERES

TRAITEMENT
     ECRIRE "Saisissez votre prénom"
     LIRE prenom
     SI prenom.LONGUEUR > 2 ALORS
        ECRIRE "bonjour ", prenom, "."
    SINON
        ECRIRE "Prénom invalide"
    FIN SI

```


# Exercice 1.3 : Calcul de la moyenne de 2 nombres

L’utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

Exemple de fonctionnement du programme en mode Console :

**VARIABLES**

```
premierNombre est un NOMBRE ENTER

secondNombre est un NOMBRE ENTIER

laMoyenne est un NOMBRE DECIMAL
```

**TRAITEMENT**

```
ECRIRE "Saisir le premier nombre"
LIRE premierNombre

ECRIRE "saisir le second nombre"
LIRE secondNombre

laMoyenne <-- (premierNombre + secondNombre) / 2

ECRIRE "La moyenne"
LIRE laMoyenne

FIN SI

```