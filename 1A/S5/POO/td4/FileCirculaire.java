package td.td4;

import java.util.Arrays;

public class FileCirculaire implements IFileBornee {
    //Attributs
    int nb_elements;
    int index;
    Object[] array;

    //Constructeur
    public FileCirculaire(int max_size) {
        if(max_size < 1) {
            throw new IllegalArgumentException("La taille de la file est de au minimum 2!");
        }
        this.array = new Object[max_size];
        this.index = 0;
        this.nb_elements = 0;
    }

    //Méthodes
    @Override
    public void enfiler(Object o) throws FilePleineException {
        if(this.array.length == this.nb_elements){
            throw new FilePleineException("La file est pleine!");
        }
        this.array[(this.index + this.nb_elements) % this.array.length] = o;
        nb_elements++;
    }

    @Override
    public String toString() {
        return "FileCirculaire{" +
                "nb_elements=" + nb_elements +
                ", index=" + index +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void defiler() throws FileVideException {
        if(this.nb_elements == 0){
            throw new FileVideException("La file est vide!");
        }
        this.array[index] = null;
        index = (index + 1) % this.array.length;
        nb_elements--;
    }

    @Override
    public Object tete() throws FileVideException {
        if(this.nb_elements == 0){
            throw new FileVideException("La file est vide!");
        }
        return this.array[0];
    }

    @Override
    public boolean estVide() {
        return this.nb_elements == 0;
    }

    @Override
    public int longueur() {
        return this.nb_elements;
    }

    @Override
    public boolean estPleine() {
        return this.array.length == this.nb_elements;
    }

    @Override
    public int capacite() {
        return this.array.length;
    }
}
