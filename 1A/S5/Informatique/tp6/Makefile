#Variables personnalisées
CC=gcc
CFLAGS=-W -Wall
LDFLAGS=
EXEC=main

#Fichier qui regroupe l'ensemble des exécutables
all: $(EXEC)
	rm -rf *.o

main: tst_arbre.o arbre.o
	$(CC) -o tst_arbre tst_arbre.o arbre.o $(LDFLAGS)

main.o: tst_arbre.c
	$(CC) -o tst_arbre.o -c tst_arbre.c $(CFLAGS)

menu.o: arbre.c
	$(CC) -o arbre.o -c arbre.c $(CFLAGS)

menu.c: arbre.h 