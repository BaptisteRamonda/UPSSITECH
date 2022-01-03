test1 : pile_statique.c pile_statique.h element_P2.c element_P2.h tst_pile_statique.c
	gcc -c pile_statique.c
	gcc -c element_P2.c
	gcc -c tst_pile_statique.c
	gcc -o test1.out pile_statique.o element_P2.o tst_pile_statique.o
	./test1.out
	
test2 : pile_statique.c pile_statique.h progTestPileStat.c
	gcc -c pile_statique.c
	gcc -c progTestPileStat.c
	gcc -o test2.out pile_statique.o progTestPileStat.o
	./test2.out

test3 : element_P2.c element_P2.h tst_element.c
	gcc -c element_P2.c 
	gcc -c tst_element.c 
	gcc -o test3.out element_P2.o tst_element.o 
	./test3.out

clean:
	rm -rf *.o