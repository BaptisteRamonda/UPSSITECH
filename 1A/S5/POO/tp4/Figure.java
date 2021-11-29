package tp.tp4;

public abstract class Figure {
    //Attributs
    protected Dessin dessin;
    protected int x; /*x et y servent à définir la position de la figure*/
    protected int y;
    protected char c;

    //Constructeur
    public Figure(int NbLigMax, int NbColMax, int x, int y, char c){
        this.dessin = new Dessin(NbLigMax, NbColMax);
        this.x = x;
        this.y = y;
        this.c = c;
    }

    //Méthodes
    public abstract void fill();

    public String toString(){return this.dessin.toString();}
}
