#include <stdio.h>
#include <stdlib.h>
#include "element.h"
#include "pile_statique.h"
#include "train.h"

/*Programme de test basé sur le travail de Loan BERNAT*/

void afficher_Probleme(VOIE_DE_WAGON o, VOIE_DE_WAGON e, VOIE_DE_WAGON g){
	afficher_VOIE(o);
	afficher_VOIE(e);
	afficher_VOIE(g);
}


int main(int argc, char const *argv[]) 
{
	int nb_composant = 1;

	printf("\n-----INITIALISATION DES VOIES-----\n");

	VOIE_DE_WAGON o = init_VOIE_DE_WAGON("Ouest");
	VOIE_DE_WAGON e = init_VOIE_DE_WAGON("Est");
	VOIE_DE_WAGON g = init_VOIE_DE_WAGON("garage");

	afficher_Probleme(o,e,g);

	printf("\n----INITIALISATION DU TRAIN SUR LA VOIE EST----\n");

	printf("\nCOMBIEN DE COMPOSANT A VOTRE TRAIN ? : ");
	scanf("%d",&nb_composant);
	if (nb_composant < 1) {
		printf("\nERREUR : Nombre de composants invalide\n");
	}

	for (int i = 1; i < nb_composant; ++i)
	{
		printf("\n\n####### COMPOSANT n°%d #########\n",i+1);
		e = ajouterWagon(e, saisir_ELEMENT());
	}
	e = ajouterWagon(e, creer_Locomotive());
	printf("\nUne locomotive a ete ajoute en tant que premier element automatiquement\n");

	printf("\n----DEBUT DE LA MANOEUVRE DE DEMI-TOUR----\n");

	afficher_Probleme(o,e,g);

	printf("\nLe train avance sur la voie garage\n\n");
	while (!voieEstVide(e)){
		manoeuvre(&e,&g);

		afficher_Probleme(o,e,g);
	}

	printf("\nLe train recule sur la voie Ouest\n\n");
	while (!voieEstVide(g)){
		manoeuvre(&g,&o);

		afficher_Probleme(o,e,g);
	}

	printf("\nDEMI TOUR FINI\n");
	return 0;
}