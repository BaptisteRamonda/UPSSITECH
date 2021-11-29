package tp.tp4;

public class Triangle extends Figure{

    public Triangle(int base, int x, int y, char c){
        super((base/2)+1,base,x,y,c );
        fill();
    }

    @Override
    public void fill() {
        int vmin = dessin.nbColMax/2 ;
        int vmax = vmin ;
        for(int i=0;i<dessin.nbLigMax;i++) {
            for(int j=0;j<dessin.nbColMax;j++) {
                if(dessin.nbColMax%2 == 1 && j<=vmax && j >= vmin) {
                    dessin.setPoint(i, j, c);
                }
                if(i != 0 && (dessin.nbColMax%2 == 0) && j<=vmax && j >= vmin) {
                    dessin.setPoint(i, j, c);
                }
            }
            vmin -= 1 ;
            vmax += 1 ;
            if(i == 0 && dessin.nbColMax%2 == 0) {
                vmax = vmax-1 ;
            }
        }
    }
}
