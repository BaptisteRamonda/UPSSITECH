#include <stdio.h>
#include <stdlib.h>
#include "file_dynamique.h"

int main(){
    printf("\n----- TEST INIT_FILE -----\n");
    MA_FILE f = INIT_FILE(f);
    if (FILE_EST_VIDE(f)){
        printf("Pile Vide\n");
        printf("OK\n");}
    else
        printf("NOK\n");

    printf("\n----- TEST DEFILER (File Vide) -----\n");
    TYPE elem1;
    f = DEFILER(f,&elem1);
    printf("OK\n");

    printf("\n----- TEST ENFILER -----\n");
    f = ENFILER(f,777);
    f = ENFILER(f,666);
    f = ENFILER(f, 555);
    if (FILE_EST_VIDE(f))
        printf("NOK\n");
    else
        printf("Element ajouté : 777\n");
        printf("Element ajouté : 666\n");
        printf("Element ajouté : 555\n");
        printf("OK\n");

    printf("\n----- TEST AFFICHE_FILE -----\n");
    AFFICHE_FILE(f);
    printf("OK\n");

    printf("\n----- TEST DEFILER (File Non-Vide) -----\n");
    TYPE elem2;
    f = DEFILER(f,&elem2);
    printf("Element supprimé : %d\n",elem2);
    printf("OK\n");

    printf("\n----- TEST SAISIR_FILE -----\n");
    MA_FILE f2 = INIT_FILE(f);
    f2 = SAISIR_FILE(f2);
    printf("\n");
    AFFICHE_FILE(f2);
    printf("OK\n");

    printf("\n------- FIN DES TESTS -------\n\n");
    return 0;
}