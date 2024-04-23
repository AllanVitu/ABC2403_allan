**VARIABLES**

- `sePromener` est un BOOLEEN
- `ilFaitPlusDe25` est un BOOLEEN
- `ilPleut` est un BOOLEEN
- `maCopineVeut` est un BOOLEEN


**TRAITEMENT**

```
ECRIRE "Fait-il plus de 25 degrés ?"
LIRE ilFaitPlusDe25

ECRIRE "Pleut-il ?"
LIRE ilPleut

ECRIRE "Estc-ce que ma copine veut se promener ?"
LIRE maCopineVeutSePromener

SI ilFaitPlusDe25 est VRAI ET ilPLEUT est FAUX OU maCopineVeutSePromener est VRAI ALORS
    sePromener <-- VRAI
    sePromener := VRAI // notion alternative

SINON ALORS
    sePromener <-- FAUX
FIN SI

```

***RESULTAT***

SI sePromener est VRAI ALORS
     ECRIRE "Tu peux aller te promener"
SINON ALORS
     ECRIRE "TU restes chez toi
FIN SI

**FIN PROGRAMME**


