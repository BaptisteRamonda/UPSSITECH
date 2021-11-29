#include <stdio.h>
#include <stdlib.h>
#define PRIX 8.5
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

MA_FILE ENFILER(MA_FILE f, CLIENT e){
    //On crée l'élément à ajouter
    ELEMENT newQueue = (ELEMENT)malloc(sizeof(struct s_element));
    newQueue->client = e;
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

MA_FILE DEFILER(MA_FILE f, CLIENT* e){
    if(FILE_EST_VIDE(f)){
        printf("Action Impossible -> File Vide.\n");
        return f;
    }
    ELEMENT temp;
    temp = f->tete;
    *e = f->tete->client; //On crée un pointeur pour retenir en mémoire l'ancienne tête
    f->tete = f->tete->suiv; //Le deuxième élément devient la nouvelle tête de la file
    free(temp); //On libère en mémoire l'ancienne tête
    f->taille --;
    return f;
}

float AFFICHE_FILE(MA_FILE f){
    ELEMENT e;
    float gain = 0;
    e = f->tete;
    printf("-TETE-\n");
    while(e != NULL){
        printf("|--------------\n");
        printf("| Tickets : %d \n",(e->client).nbTickets);
        printf("| Prix    : %.2f€\n",(e->client).prixTotal);
        gain += (e->client).prixTotal;
        e = e->suiv;
    }
    printf("|--------------\n");
    printf("|Gain Total : %.2f€\n",gain);
    printf("-QUEUE-\n");
    return gain;
}

MA_FILE SAISIR_FILE(MA_FILE f){
    f = INIT_FILE(f);
    CLIENT e;
    int taille;
    printf("Rentrez taille de la file: ");
    scanf("%d",&taille);
    while(taille != 0){
        printf("Nombre de tickets : ");
        scanf("%d",&(e.nbTickets));
        if (e.nbTickets >= 5)
            e.prixTotal = e.nbTickets * (PRIX*0.8);
        else
            e.prixTotal = e.nbTickets * PRIX;
        f = ENFILER(f,e);
        taille --;
    }
    return f;
}