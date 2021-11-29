#include <stdio.h>
#include <stdlib.h>
#include "file_dynamique.h"

int main(){
    printf("\n--------------- PROGRAMME CINEMA ---------------\n");
    printf("| 15h - Jurassic Park                          |\n");
    printf("| 17h - Inception                              |\n");
    printf("| 19h - Bienvenue chez les Ch'tis              |\n");
    printf("| 21h - Pulp Fiction                           |\n");
    printf("|                                              |\n");
    printf("| TARIF: 8.50€                                 |\n");
    printf("| -20 pourcent tarif de groupe (5 pers. +)     |\n");
    printf("------------------------------------------------\n");

    float gainJournee = 0;

    printf("\n15h - Jurassic Park\n");
    MA_FILE f = SAISIR_FILE(f);
    gainJournee += AFFICHE_FILE(f);

    printf("\n17h - Inception\n");
    f = SAISIR_FILE(f);
    gainJournee += AFFICHE_FILE(f);

    printf("\n19h - Bienvenue chez les Ch'tis\n");
    f = SAISIR_FILE(f);
    gainJournee += AFFICHE_FILE(f);

    printf("\n21h - Pulp Fiction\n");
    f = SAISIR_FILE(f);
    gainJournee += AFFICHE_FILE(f);

    printf("\nRecette totale de la journée : %.2f€\n\n",gainJournee);
    return 0;
}