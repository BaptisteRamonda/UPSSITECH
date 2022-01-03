#include <stdio.h>
#include <stdlib.h>
#include "arbre.h"

Arbre INIT_ARBRE(){
    return NULL;
}

void AFFICHE_ARBRE(Arbre a){
    if(!a) return;
    if(a->filsG) 
        AFFICHE_ARBRE(a->filsG);
    printf("%d\n", a->val);
    if(a->filsD) 
        AFFICHE_ARBRE(a->filsD);
}


bool ARBRE_VIDE(Arbre a){return a==NULL;}

Arbre AJOUT_DS_ARBRE(Arbre a, int val){
    Cellule* tempCell;
    Arbre tempTree = a;
    Cellule* elem = (Cellule*)malloc(sizeof(Cellule));
    elem->val = val;
    elem->filsG = NULL;
    elem->filsD = NULL;
    if(tempTree)
    do{
        tempCell = tempTree;
        if(val > tempTree->val ){
            tempTree = tempTree->filsD;
            if(!tempTree) tempCell->filsD = elem;
        }
        else{
            tempTree = tempTree->filsG;
            if(!tempTree) tempCell->filsG = elem;
        }
    }
    while(tempTree);
    else  a = elem;
    return a;
}


int ENLEVER_MIN_DE_ARBRE(Arbre a, Cellule* cell){
    if(ARBRE_VIDE(a)){
        printf("Action Impossible -> Arbre Vide.\n");
        return 0;
    }
    if(a->filsG != NULL)
        ENLEVER_MIN_DE_ARBRE(a->filsG, cell);
    else{
        cell->val = a->val;
        a->filsG = NULL;
    }
    return cell->val;
}