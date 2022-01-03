#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "pile_dynamique.h"

//Définition explicite des structures de la pile dynamique
struct s_cellule{
    ELEMENT valeur;
    struct s_cellule *suivant;
};

//Définition des fonctions
PILE init_PILE(){
    return NULL;
}

PILE emPILE(PILE p, ELEMENT e){
    CELLULE new = (CELLULE) malloc(sizeof(struct s_cellule));
    new->valeur = e;
    //Pointer vers ex-sommet de pile
    new->suivant = *p;
    //maj sommet de pile
    *p = new;
    return p;
}

PILE dePILE(PILE p){
    assert(!PILE_estVide(p));
    CELLULE e = *p;
    //maj du top
    *p = e->suivant;
    //liberer e
    free(e);
    return p;
}

int PILE_estVide(PILE p) {return(p == NULL);}