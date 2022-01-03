#include <stdio.h>
#include <stdlib.h>
#include "element_P2.h"

int main(){
    ELEMENT e = 4.56;
    printf("affiche_ELEMENT(2.098):\n");
    affiche_ELEMENT(2.098);
    printf("OK\n");

    printf("saisir_ELEMENT()\n");
    saisir_ELEMENT();
    printf("OK\n");

    printf("affect_ELEMENT(2.097 , 4.56):\n");
    affect_ELEMENT(2.097, &e);
    affiche_ELEMENT(e);
    printf("OK\n");

    printf("compare_ELEMENT(2.097 , 4.56):\n");
    compare_ELEMENT(2.097, 4.56);
    printf("OK\n");

}