#ifndef FILE_DYNAMIQUE
#define FILE_DYNAMIQUE

//Définition du type CLIENT
typedef struct s_client{
    int nbTickets;
    float prixTotal;
}CLIENT;

//Définition explicite de la structure d'un élément
typedef struct s_element{
    CLIENT client;
    struct s_element* suiv;
}*ELEMENT;

//Définition explicite de la structure d'une file dynamique
typedef struct s_file{
    ELEMENT tete;
    ELEMENT queue;
    int taille;
}*MA_FILE;

//Définition du type booléen
typedef enum { false = 0, true = 1}bool;

//Prototypes des fonctions
MA_FILE INIT_FILE(MA_FILE);
float AFFICHE_FILE(MA_FILE);
bool FILE_EST_VIDE(MA_FILE);
MA_FILE ENFILER(MA_FILE, CLIENT);
MA_FILE DEFILER(MA_FILE, CLIENT*);
MA_FILE SAISIR_FILE(MA_FILE);

#endif