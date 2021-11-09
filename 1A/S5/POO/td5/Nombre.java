package td.td5;

public abstract class Nombre {
    //Attributs
    protected int valeur;

    //Classe abstraite -> pas besoin de constructeur.

    //Méthodes
    public abstract void moins(Nombre n);
    public abstract void plus(Nombre n);
    public abstract int nombreToInt();
    //Méthodes abstraites -> pas besoin de développer le corps de la méthode.
}
