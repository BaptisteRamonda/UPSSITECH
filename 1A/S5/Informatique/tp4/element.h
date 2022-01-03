#ifndef ELEMENT_H
#define ELEMENT_H

//Définition implicite de la structure d'ELEMENT
typedef struct s_element {
	char categorie;
	int ID;
} ELEMENT;

//Prototypes des fonctions
void affiche_ELEMENT(ELEMENT); //Affiche l'élément passé en paramètre
ELEMENT saisir_ELEMENT(); //Saisit un élément avant de le renvoyer
void affect_ELEMENT(ELEMENT, ELEMENT*); //Affecte un élément à un autre élément

#endif