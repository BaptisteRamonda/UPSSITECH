prog.out: train.o pile_statique.o element.o main.o
	gcc -o prog.out train.o pile_statique.o element.o main.o -Wall

pile_statique.o: pile_statique.c pile_statique.h
	gcc -o pile_statique.o -c pile_statique.c -Wall

element.o: element.c element.h
	gcc -o element.o -c element.c -Wall

voie.o: train.c
	gcc -o train.o -c train.c -Wall

main.o: main.c train.h
	gcc -o main.o -c main.c -Wall

clean:
	rm -rf *.o