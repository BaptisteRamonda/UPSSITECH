package tp.tp4;

import java.util.ArrayList;

public class Schema {
    //Attributs
    protected ArrayList<Figure> listFig;
    protected Dessin dessin;

    //Constructeur
    public Schema(int NbLigMax, int NbColMax){
        this.dessin = new Dessin(NbLigMax, NbColMax);
        this.listFig = new ArrayList<>();
    }

    //Méthodes
    public String toString(){return this.dessin.toString();}

    public void ajout(Figure fig){
        if(fig != null && fig.dessin.nbLigMax > 0 && fig.dessin.nbColMax > 0) {
            this.listFig.add(fig);
            for (int i = 0; i < fig.dessin.nbLigMax; i++) {
                for (int j = 0; j < fig.dessin.nbColMax; j++) {
                    // Vérification qu'on ne sort pas des limites de coordonnées
                    if (fig.x + i < dessin.nbLigMax && fig.y + j < dessin.nbColMax) {
                        dessin.setPoint(fig.x + i, fig.y + j, fig.dessin.getPoint(i, j));
                    }
                }
            }
        }
    }
}
