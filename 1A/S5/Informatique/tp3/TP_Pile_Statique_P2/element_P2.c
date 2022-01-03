#include <stdio.h>
#include <stdlib.h>
#include "element_P2.h"

//Définitions explicites des fonctions
void affiche_ELEMENT(ELEMENT e){
    //On part du principe que pour les tests, ELEMENT est un float
    printf("%.3f\n", e);
}

void saisir_ELEMENT(ELEMENT* p){
    scanf("%f", p);
}

void affect_ELEMENT(ELEMENT e1, ELEMENT* e2){*e2 = e1;}

int compare_ELEMENT(ELEMENT e1, ELEMENT e2){return (e1 < e2);}