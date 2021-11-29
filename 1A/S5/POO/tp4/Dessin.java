package tp.tp4;

public class Dessin {
    //Attributs
    protected int nbLigMax;
    protected int nbColMax;
    protected char[][] mat;

    //Constructeur
    public Dessin(int NbLigMax, int NbColMax){
        /*Création de la matrice*/
        this.nbLigMax = NbLigMax;
        this.nbColMax = NbColMax;
        this.mat = new char[nbLigMax][nbColMax];
        /*Initialisation du dessin avec des points*/
        for(int i=0; i<nbLigMax; i++){
            for(int j=0; j<nbColMax; j++){mat[i][j] ='.';}
        }
    }

    //Méthodes
    void setPoint(int nl, int nc, char c){
        /*Vérification validité paramètres*/
        if(nl<this.nbLigMax && nc<this.nbColMax && nl>=0 && nc>=0)
            this.mat[nl][nc] = c;
    }

    char getPoint(int nl, int nc){
        if(nl>=this.nbLigMax || nc>=this.nbColMax || nl<0 || nc<0)
            throw new IllegalArgumentException();
        return this.mat[nl][nc];
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i=0; i<nbLigMax; i++){
            for(int j=0; j<nbColMax; j++){
                s.append(this.mat[i][j]);
            }
            s.append("\n");
        }
        return s.toString();
    }

}
