public class FileChainee implements IFileNonBornee {
    //Attributs
    private int size;
    private Maillon tete, queue;

    //Méthodes
    @Override
    public void defiler() throws FileVideException {
        if(tete == null){
            throw new FileVideException("La file est vide!");
        }
        tete = tete.suiv;
        if(tete == null){
            queue = null;
        }
        size--;
    }

    @Override
    public Object tete() throws FileVideException {
        if(tete == null) {
            throw new FileVideException("La file est vide!");
        }
        return tete;
    }

    @Override
    public boolean estVide() {
        return tete == null;
    }

    @Override
    public int longueur() {
        return size;
    }

    @Override
    public void enfiler(Object o) {
        if(queue == null) {
            queue = new Maillon(o);
            tete = queue;
        } else {
            queue.suiv = new Maillon(o);
            queue = queue.suiv;
        }
        size++;
    }


    //Inner Class
    private static class Maillon {
        private Maillon suiv;
        public Maillon(Object val) {
            //Attributs
            this.suiv = null;
        }
    }
}
