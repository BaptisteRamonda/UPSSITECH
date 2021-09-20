#include <stdio.h>
#include <string.h>

struct membreFamille{
    char nom[20];   
    char prenom[20];
    int age;
    struct membreFamille* pere, *mere;
    struct membreFamille* enfants[];
};

typedef struct membreFamille membreFamille;

int main(){

    //Création de la 1ère famille
    membreFamille toto;
    strcpy(toto.prenom, "TOTO");
    strcpy(toto.nom, "X");
    toto.age = 10;

    membreFamille eglantine;
    strcpy(eglantine.prenom, "EGLANTINE");
    strcpy(eglantine.nom, "X");
    eglantine.age = 30;

    membreFamille arthur;
    strcpy(arthur.prenom, "ARTHUR");
    strcpy(arthur.nom, "X");
    arthur.age = 35;

    //Maj des liens de la 1ère famille
    toto.mere = &eglantine;
    toto.pere = &arthur;
    eglantine.enfants[0] = &toto;
    arthur.enfants[0] = &toto;

    //Ajout des parents biologiques de Toto
    membreFamille marguerite;
    strcpy(marguerite.prenom, "MARGUERITE");
    strcpy(marguerite.nom, "Y");
    marguerite.age = 25;

    membreFamille alphonse;
    strcpy(alphonse.prenom, "ALPHONSE");
    strcpy(alphonse.nom, "X");
    alphonse.age = 25;

    //Maj des liens biologiques de Toto
    toto.mere = &marguerite;
    toto.pere = &alphonse;
    marguerite.enfants[0] = &toto;
    alphonse.enfants[0] = &toto;
    eglantine.enfants[0] = NULL;
    arthur.enfants[0] = NULL;
    return 0;
}
