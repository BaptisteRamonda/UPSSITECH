#include <stdio.h>
#include <stdlib.h>
#include "arbre.h"

int main(){
    printf("\n----- TEST INIT_ARBRE -----\n");
    Arbre a = INIT_ARBRE();
    if (ARBRE_VIDE(a)){
        printf("Arbre Vide\n");
        printf("OK\n");}
    else
        printf("NOK\n");

    printf("\n----- TEST ENLEVER_MIN_DE_ARBRE (Arbre Vide) -----\n");
    Cellule cell1;
    int supprElem = 0;
    supprElem = ENLEVER_MIN_DE_ARBRE(a, &cell1);
    printf("OK\n");

    printf("\n----- TEST AJOUT_DS_ARBRE -----\n");
    a = AJOUT_DS_ARBRE(a,7);
    a = AJOUT_DS_ARBRE(a,65);
    a = AJOUT_DS_ARBRE(a,8);
    a = AJOUT_DS_ARBRE(a, 12);
    a = AJOUT_DS_ARBRE(a,3);
    if (ARBRE_VIDE(a))
        printf("NOK\n");
    else{
        printf("Element ajouté : 7\n");
        printf("Element ajouté : 65\n");
        printf("Element ajouté : 8\n");
        printf("Element ajouté : 12\n");
        printf("Element ajouté : 3\n");
        printf("OK\n");
    }

    printf("\n----- TEST AFFICHE_ARBRE -----\n");
    AFFICHE_ARBRE(a);
    printf("OK\n");

    printf("\n----- TEST ENLEVER_MIN_DE_ARBRE (Arbre Non-Vide) -----\n");
    Cellule cell2;
    supprElem = ENLEVER_MIN_DE_ARBRE(a,&cell2);
    printf("Element supprimé : %d\n",supprElem);
    printf("OK\n");

    printf("\n------- FIN DES TESTS -------\n\n");
    return 0;
}