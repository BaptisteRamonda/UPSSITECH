#include <stdio.h>
#include <stdlib.h>
#include "pile_statique.h"
#include "element_P2.h"

//Définitions Explicites des Fonctions
PILE init_PILE(){
    PILE p;
    p.tete = -1;
    return p;
}

void affiche_PILE(PILE p){
    int i;
    for (i=0; i<=p.tete; i++){
        affiche_ELEMENT(p.tab[i]);
    }
}

int PILE_estVide(PILE p){return p.tete < 0;}

int PILE_estPleine(PILE p){return p.tete+1 == MAX;}

PILE emPILE(PILE p, ELEMENT e){
    if (PILE_estPleine(p))
        return p;
    p.tete ++;
    affect_ELEMENT(e, &p.tab[p.tete]);
    return p;
}

PILE dePILE(PILE p, ELEMENT* e){
    if(PILE_estVide(p))
        return p;
    affect_ELEMENT(p.tab[p.tete], e);
    p.tete--;
    return p;
}

PILE saisirPILE(){
    int taille;
    int i;
    ELEMENT elem;
    PILE p = init_PILE();
    printf("Entrez la taille de la pile :");
    scanf("%d", &taille);
    for (i=0; i<taille; i++){
        scanf("%f", &elem);
        p = emPILE(p, elem);
    }
    return p;
}

