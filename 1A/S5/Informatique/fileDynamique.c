#include <stdio.h>
#include <stdlib.h>

fifo defiler(fifo f){
  if (f.tete == NULL) 
    return f;
  Cellule *pc = f.tete;
  f.tete = (f.tete)->suiv;
  free(pc);
  if (f.tete == NULL) 
    f.queue = NULL;
  return f;
}
