package td.td5;

public class NombreEntier extends Nombre {

    //attributs
    /** Borne max, juste pour simplifier */
    public static int NOMBRE_MAX=3999;
    /** constantes String représentant les nombres romains */
    private static final String[] REPRESENTATION_ARABE = {"9","8","7","6","5","4","3","2","1","0"};
    /** constantes int représentant les entiers correspondant aux nombres romains */
    private static final int[] VALEURS_ARABES = {9,8,7,6,5,4,3,2,1,0};

    //constructeurs
    /** construit le nombre en stockant sa valeur entière */
    public NombreEntier(int value) {
        if(value<=NOMBRE_MAX)
            valeur=value;
        else
            System.out.println("nombre trop �lev�.");
    }

    /** convertit un nombre romain valide en entier et stocke sa valeur */
    public NombreEntier(String s) {
        valeur = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=0; j<REPRESENTATION_ARABE.length; j++) {
                if(s.charAt(i)==REPRESENTATION_ARABE[j].charAt(0)) {
                    valeur*=10;
                    valeur+=VALEURS_ARABES[j];
                }
            }
        }

    }
    //methodes

    /**
     * Retourne la représentation romaine de la valeur entière
     *
     * @return Le nombre sous forme de chiffre romain
     */
    public String intToNombre() {
        int reste = valeur;
        String str="";
        while(reste>0) {
            for(int j=0; j<VALEURS_ARABES.length; j++) {
                if(reste%10==VALEURS_ARABES[j]) {
                    str=REPRESENTATION_ARABE[j]+str;
                    reste-=reste%10;
                    reste/=10;
                    break;
                }
            }
        }
        return str;
    }

    /**
     * soustraction d'un nombre au nombre courant
     *
     * @param n un autre nombre
     */
    public void moins(Nombre n) {
        valeur-=n.valeur;
    }

    /**
     * Retourne la représentation entière
     *
     * @return Le nombre sous forme de chiffre arabe
     */
    public int nombreToInt() {
        return valeur;
    }


    /**
     * addition d�un nombre au nombre courant
     *
     * @param n un autre nombre
     */
    public void plus(Nombre n) {
        valeur+=n.valeur;
    }

}
