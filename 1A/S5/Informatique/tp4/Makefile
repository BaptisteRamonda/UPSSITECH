CC=gcc
CFLAGS=-W -Wall
EXEC=testp

all: $(EXEC)

testp: tst_pile_dynamique.o pile_dynamique.o element.o
	$(CC) -o testp tst_pile_dynamique.o pile_dynamique.o element.o

train: train.o pile_dynamique.o element.o
	$(CC) -o train train.o pile_dynamique.o element.o

train.o: train.c train.h pile_dynamique.c pile_dynamique.h element.h
	$(CC) -c pile_dynamique.c $(CFLAGS)
	$(CC) -c train.c $(CFLAGS)

tst_pile_dynamique.o: tst_pile_dynamique.c pile_dynamique.c pile_dynamique.h
	$(CC) -c tst_pile_dynamique.c $(CFLAGS)
	$(CC) -c pile_dynamique.c $(CFLAGS)

pile_dynamique.o: pile_dynamique.c pile_dynamique.h element.h
	$(CC) -c pile_dynamique.c $(CFLAGS)

element.o: element.c element.h
	$(CC) -c element.c $(CFLAGS)

clean:
	rm -rf *.o