package tp.tp4;

public class Rectangle extends Figure{

    public Rectangle(int NbLigMax, int NbColMax, int x, int y, char c) {
        super(NbLigMax, NbColMax, x, y, c);
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
