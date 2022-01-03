#ifndef ELEMENT_P2_H
#define ELEMENT_P2_H

//Définition du type ELEMENT
typedef float ELEMENT;

//Prototypes des fonctions
void affiche_ELEMENT(ELEMENT); //Affiche l'élément passé en paramètre
void saisir_ELEMENT(); //Saisit un élément avant de le renvoyer
void affect_ELEMENT(ELEMENT, ELEMENT*); //Affecte un élément à un autre élément
int compare_ELEMENT(ELEMENT, ELEMENT); //Compare deux éléments passés en paramètres

#endif