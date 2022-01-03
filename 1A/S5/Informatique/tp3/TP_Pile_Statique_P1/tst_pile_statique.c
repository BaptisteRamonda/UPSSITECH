#include <stdio.h>
#include <stdlib.h>
#include "pile_statique.h"

int main(){
    PILE p = init_PILE();
    int e;
    printf("\nINDICE TETE = %d\n", p.tete);
    PILE_estVide(p);
    printf("\nTEST dePILE :\n");
    p = dePILE(p, &e);
    printf("\nTEST emPILE :\n");
    p = emPILE(p, 1);
    printf("INDICE NOUVELLE TETE = %d\n", p.tete);
    PILE_estVide(p);
    printf("\nTEST saisirPILE() :\n");
    p = saisirPILE();
    PILE_estVide(p);
    PILE_estPleine(p);
    printf("\nINDICE NOUVELLE TETE = %d\n", p.tete);
    printf("CONTENU PILE :\n");
    affiche_PILE(p);
    return 0;
}