#include <stdio.h>
#include <stdlib.h>
#include "pile_dynamique.h"

int main(){
    printf("\n##### TEST init_PILE() #####\n");
    PILE p = init_PILE();
    printf("Test OK\n");

    printf("\n##### TEST PILE_estVide() #####\n");
    if (PILE_estVide(p) == 1){
        printf("La pile est vide\n");
        printf("Test OK\n");
    }
    else
         printf("Test NOK\n");

    printf("\n##### TEST emPILE() #####\n");
    ELEMENT e;
    p = emPILE(p, e);
    if (PILE_estVide(p) == 0)
        printf("Test OK\n");
    else
        printf("Test NOK\n");
    
        
    return 0;
}