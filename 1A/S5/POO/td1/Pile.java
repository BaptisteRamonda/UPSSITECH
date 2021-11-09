public class Pile {
    //Attributs
    private final int[] tableau;
    private int taille;
    final static int tailleMax=100;

    //Constructeur
    public Pile(){
        tableau = new int[tailleMax];
        int taille = 0;
    }

    //Méthodes
    public void ajout(int e){
        if (taille < tailleMax) {
            taille++;
            tableau[taille] = e;
        }
    }

    public int longueur(){return taille;}

    public boolean pileVide(){return taille==0;}

    public boolean pilePleine(){return taille==tailleMax;}

    public void enleverTete(){if (taille>0) taille --;}

    public void enleverDernier(){
        if (taille>0){
            System.arraycopy(tableau, 1, tableau, 0, taille);
            taille--;
        }
    }

    public int tete(Pile p){return tableau[taille];}

    public int dernier(Pile p){return tableau[0];}

    public int queue(Pile p){return tableau[taille-1];}

    public boolean appartient(int e){
        boolean appartient = false;
        for (int i=0; i<taille; i++){
            if (tableau[i] == e) {
                appartient = true;
                break;
            }
        }
        return appartient;
    }

    public String toString() {
        StringBuilder message = new StringBuilder("[");
        if (taille >= 1) {
            message.append(tableau[0]);
        }
        for (int i = 1; i < taille; i ++) {
            message.append(", ").append(tableau[i]);
        }
        message.append("]");
        return message.toString();
    }

    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof Pile))
            return false;
        Pile p = (Pile) o;
        if (p.taille != ((Pile) o).taille)
            return false;
        for (int i=0; i<=this.taille; i++){if(this.tableau[i] != ((Pile) o).tableau[i]) return false;}
        return true;
    }

    public Pile clone(){
        Pile clone = new Pile();
        if (taille + 1 >= 0) System.arraycopy(this.tableau, 0, clone.tableau, 0, taille + 1);
        return clone;
    }
}
