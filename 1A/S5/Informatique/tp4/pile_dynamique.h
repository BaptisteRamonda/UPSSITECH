#ifndef PILE_DYNAMIQUE
#define PILE_DYNAMIQUE
#include "element.h"

//Définition implicite des structures de la pile dynamique
typedef struct s_cellule *CELLULE;
typedef CELLULE *PILE;

//Prototypes des fonctions
PILE init_PILE();
void affiche_PILE(PILE);
int PILE_estVide(PILE);
PILE emPILE(PILE, ELEMENT);
PILE dePILE(PILE);
PILE saisirPILE();

#endif