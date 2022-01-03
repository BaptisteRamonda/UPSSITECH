#include <stdio.h>
#include <stdlib.h>
#include "element.h"
#include "pile_statique.h"
#include "train.h"

VOIE_DE_WAGON init_VOIE_DE_WAGON(char* n){
	VOIE_DE_WAGON v;
	v.nom = n;
	v.rail = init_PILE();
	return v;
}

void afficher_VOIE(VOIE_DE_WAGON v){
	printf("Voie %s : ",v.nom);
	affiche_PILE(v.rail);
}

VOIE_DE_WAGON ajouterWagon(VOIE_DE_WAGON v, ELEMENT e){
	v.rail = emPILE(v.rail, e);
	return v;
}

int voieEstVide(VOIE_DE_WAGON v){
	return PILE_estVide(v.rail);
}


void manoeuvre(VOIE_DE_WAGON* v1, VOIE_DE_WAGON* v2){
	ELEMENT stockage;
	v1->rail = dePILE(v1->rail,&stockage);
	v2->rail = emPILE(v2->rail,stockage);
}

ELEMENT creer_Locomotive(){ //creer la locomotive automatiquement
	ELEMENT e;
	e.categorie = 'L';
	e.ID = 1;
	return e;
}