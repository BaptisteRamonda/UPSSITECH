package td.td4;

import java.util.Vector;

public class FileVector implements IFileNonBornee {
    //Attributs
    private final Vector<Object> vector;

    //Constructeur
    public FileVector() {
        this.vector = new Vector<>();
    }

    //Méthodes
    @Override
    public void enfiler(Object o) {
        vector.add(o);
    }

    @Override
    public void defiler() throws FileVideException {
        if(this.vector.isEmpty()){
            throw new FileVideException("La file est vide!");
        }
        this.vector.remove(0);
    }

    @Override
    public Object tete() throws FileVideException {
        if(this.vector.isEmpty()) {
            throw new FileVideException("La file est vide!");
        }
        return this.vector.get(0);
    }

    @Override
    public boolean estVide() {
        return this.vector.isEmpty();
    }

    @Override
    public int longueur() {
        return this.vector.size();
    }
}
