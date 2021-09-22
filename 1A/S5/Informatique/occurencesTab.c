#include <stdio.h>
#include <stdlib.h>

int remplaceTab(int N, int* T){
    //Initialisation des variables
    int i,j=0,X,Y;
    int occur=0;
    int tIndice[100];

    //Affichage du tableau de base
    printf("\n{");
    for (i=0; i<N; i++){
        printf(" %d", T[i]);
    }
    printf(" }\n");

    //Maj des valeurs de recherche
    printf("\nEntrez la valeur à remplacer : ");
    scanf("%d",&X);
    printf("Entrez la valeur de remplacement : ");
    scanf("%d",&Y);

    //Maj du tableau
    for (i=0; i<N; i++){
        if(T[i] == X){
            T[i]=Y;
            occur++;
            tIndice[j] = i;
            j++;
        }
    }

    //Affichage des résultats
    printf("\n{");
    for (i=0; i<N; i++){
        printf(" %d", T[i]);
    }
    printf(" }\n");
    printf("Nombre d'occurences remplacées: %d\n",occur);
    printf("Tableau des indices remplacés: ");
    printf("{");
    for (i=0; i<j; i++){
        printf(" %d", tIndice[i]);
    }
    printf(" }\n\n");
    return 0;
}

int main(){
    int T[10] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}; 
    remplaceTab(10, T);
    return 0;
}
