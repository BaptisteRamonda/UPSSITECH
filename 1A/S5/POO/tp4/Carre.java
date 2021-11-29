package tp.tp4;

public class Carre extends Rectangle{
    public Carre(int NbLigMax, int x, int y, char c){
        super(NbLigMax, NbLigMax, x, y, c);
        fill();
    }

    @Override
    public void fill() {
        for(int i=0; i<this.dessin.nbLigMax; i++){
            for(int j=0; j<this.dessin.nbColMax; j++){
                this.dessin.setPoint(i, j, c);
            }
        }
    }
}
