#include <stdio.h>
#include <stdlib.h>
#include "element.h"

//Définitions explicites des fonctions
void affiche_ELEMENT(ELEMENT e){
	printf("[Type : %c & ID : %d]",e.categorie,e.ID);
}

ELEMENT saisir_ELEMENT(){
	ELEMENT e;
	printf("\nINDIQUEZ LE TYPE DU WAGON (W/R) :\n");
	scanf("\n%c",&e.categorie);
	printf("\nINDIQUEZ SON ID :\n");
	scanf("%d",&e.ID);
	return e;
}

void affect_ELEMENT(ELEMENT e1, ELEMENT* e2){*e2 = e1;}