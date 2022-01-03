#ifndef PILE_STATIQUE_H
#define PILE_STATIQUE_H
#define MAX 100
#include "element.h"

//Définition structure Pile statique
typedef struct s_pile{
    int tete; //Indice de la tête de la pile
    ELEMENT tab[MAX]; //Tableau d'éléments
}PILE;

//Protoypes Fonctions
PILE init_PILE();
void affiche_PILE(PILE);
int PILE_estVide(PILE);
int PILE_estPleine(PILE);
PILE emPILE(PILE, ELEMENT);
PILE dePILE(PILE, ELEMENT*);
PILE saisirPILE();

#endif