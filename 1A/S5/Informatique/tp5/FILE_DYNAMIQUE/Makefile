test : file_dynamique.c file_dynamique.h tst_file_dynamique.c
	gcc -c file_dynamique.c
	gcc -c tst_file_dynamique.c
	gcc -o test.out file_dynamique.o tst_file_dynamique.o
	./test.out

clean:
	rm -rf *.o