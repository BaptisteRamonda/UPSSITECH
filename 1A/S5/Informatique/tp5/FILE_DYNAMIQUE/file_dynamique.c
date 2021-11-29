#include <stdio.h>
#include <stdlib.h>
#include "file_dynamique.h"

//Définition des fonctions de la file dynamique
MA_FILE INIT_FILE(MA_FILE f){
    f = (MA_FILE)malloc(sizeof(struct s_file));
    f->tete = NULL;
    f->queue = NULL;
    f->taille = 0;
    return f;
}

bool FILE_EST_VIDE(MA_FILE f){return f->taille == 0;}

MA_FILE ENFILER(MA_FILE f, TYPE e){
    //On crée l'élément à ajouter
    ELEMENT newQueue = (ELEMENT)malloc(sizeof(struct s_element));
    newQueue->valeur = e;
    newQueue->suiv = NULL;
    //On rajoute l'élément à la file
    if(FILE_EST_VIDE(f))
        f->tete = newQueue;
    else
        (f->queue)->suiv = newQueue;
    f->queue = newQueue;
    f->taille ++;
    return f;
}

MA_FILE DEFILER(MA_FILE f, TYPE* e){
    if(FILE_EST_VIDE(f)){
        printf("Action Impossible -> File Vide.\n");
        return f;
    }
    ELEMENT temp;
    temp = f->tete;
    *e = f->tete->valeur; //On crée un pointeur pour retenir en mémoire l'ancienne tête
    f->tete = f->tete->suiv; //Le deuxième élément devient la nouvelle tête de la file
    free(temp); //On libère en mémoire l'ancienne tête
    f->taille --;
    return f;
}

void AFFICHE_FILE(MA_FILE f){
    ELEMENT e;
    e = f->tete;
    printf("-TETE-\n");
    while(e != NULL){
        printf("| %d |\n",e->valeur);
        e = e->suiv;
    }
    printf("-QUEUE-\n");
}

MA_FILE SAISIR_FILE(MA_FILE f){
    TYPE e;
    int taille;
    printf("Rentrez taille de la file: ");
    scanf("%d",&taille);
    printf("Saisir file:\n");
    while(taille != 0){
        scanf("%d",&e);
        ENFILER(f,e);
        taille --;
    }
    return f;
}