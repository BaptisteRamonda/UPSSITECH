#ifndef PILE_STATIQUE_H
#define PILE_STATIQUE_H
#define MAX 100

//Définition structure Pile statique
typedef struct s_pile{
    int tete; //Indice de la tête de la pile
    int tab[MAX]; //Tableau d'entiers
}PILE;

//Protoypes Fonctions
PILE init_PILE();
void affiche_PILE(PILE);
int PILE_estVide(PILE);
int PILE_estPleine(PILE);
PILE emPILE(PILE, int);
PILE dePILE(PILE, int*);
PILE saisirPILE();

#endif