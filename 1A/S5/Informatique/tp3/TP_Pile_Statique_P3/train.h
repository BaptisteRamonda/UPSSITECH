#ifndef TRAIN_H
#define TRAIN_H

typedef struct s_voie {
	char* nom;
	PILE rail;
} VOIE_DE_WAGON;

VOIE_DE_WAGON init_VOIE_DE_WAGON(char* );

void afficher_VOIE(VOIE_DE_WAGON);

VOIE_DE_WAGON ajouterWagon(VOIE_DE_WAGON ,ELEMENT);

int voieEstVide(VOIE_DE_WAGON);

void manoeuvre(VOIE_DE_WAGON*, VOIE_DE_WAGON*);

ELEMENT creer_Locomotive();

#endif