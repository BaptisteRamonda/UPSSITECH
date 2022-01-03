#ifndef ARBRE_H
#define ARBRE_H

/*Structures Arbre et Cellule*/
typedef struct s_cellule{
    int val;
    struct s_cellule* filsG;
    struct s_cellule* filsD;
}Cellule;

typedef Cellule* Arbre;

//Définition du type booléen
typedef enum { false = 0, true = 1}bool;

/*Prototypes des fonctions*/
Arbre INIT_ARBRE();
void AFFICHE_ARBRE(Arbre); //Affiche tous les éléments d'un arbre passé en paramètre
bool ARBRE_VIDE(Arbre); //Teste si l'arbre en paramètre est vide
Arbre AJOUT_DS_ARBRE(Arbre, int); //Ajoute la valeur int dans l'arbre passé en paramètre
int ENLEVER_MIN_DE_ARBRE(Arbre, Cellule*); //Enleve la valeur minimale de l'arbre passé en paramètre


#endif