#include <stdio.h>
#include <stdlib.h>
#include "pile_statique.h"
#include "element_P2.h"

int main(){
    printf("Test init_PILE :\n");
    PILE p = init_PILE();
    ELEMENT e = 2.12;
    printf("OK");

    printf("\nTest PILE_estVide :\n");
    if(PILE_estVide(p)==1){
        printf("Pile Vide.\n");
        printf("OK");}
    else
        printf("NOK");

    printf("\nTEST dePILE :\n");
    p = dePILE(p, &e);;
    affiche_PILE(p);
    printf("OK");

    printf("\nTEST emPILE :\n");
    p = emPILE(p, e);
    printf("INDICE NOUVELLE TETE = %d\n", p.tete);
    printf("OK\n");

    printf("Test affiche_PILE :\n");
    affiche_PILE(p);
    printf("OK");

    printf("\nTEST saisirPILE() :\n");
    p = saisirPILE();
    PILE_estVide(p);
    PILE_estPleine(p);
    printf("\nINDICE NOUVELLE TETE = %d\n", p.tete);
    printf("OK\n");

    printf("Test affiche_PILE :\n");
    affiche_PILE(p);
    printf("OK\n");
    return 0;
}