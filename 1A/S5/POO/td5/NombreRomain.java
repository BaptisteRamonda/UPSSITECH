package td.td5;

public class NombreRomain extends Nombre {
    //Attributs
    /** Borne max, juste pour simplifier*/
    public static int NOMBRE_MAX=4000;

    /** constantes String représentant les nombres romains */
    private static final java.lang.String[] REPRESENTATION_ROMAINS= {"M","D","C","L","X","V","I"};

    /** 	constantes int représentant les entiers correspondant aux nombres romains*/
    private static final int[] VALEURS_ROMAINS= {1000,500,100,50,10,5,1};

    //Constructeurs
    /** 	construit le nombre en stockant sa valeur entière*/
    public NombreRomain(int value) {
        if(value<NOMBRE_MAX)
            valeur=value;
        else
            System.out.println("erreur");

    }

    /** convertit un nombre romain valide en entier et stocke sa valeur */
    public NombreRomain(String s) {
        valeur = 0;
        boolean anomalieDetectee;
        for(int i=0; i<REPRESENTATION_ROMAINS.length; i++) {
            while(s.startsWith(REPRESENTATION_ROMAINS[i])) {

                /////////Amelioration
                anomalieDetectee=false;
                if(s.length()>1) {
                    String c=s.substring(1,2);
                    for(int j=0; j<i; j++) {
                        if(REPRESENTATION_ROMAINS[j].compareTo(c)==0) {
                            anomalieDetectee=true;

                            valeur+=VALEURS_ROMAINS[j]-VALEURS_ROMAINS[i];
                            s=s.substring(2);

                        }
                    }
                }
                /////////fin d'Amelioration


                if(!anomalieDetectee) {
                    valeur+=VALEURS_ROMAINS[i];
                    s=s.substring(1);
                }
            }
        }
    }

    //methodes
    /** permet de convertir en nombre romain
     *
     * @return la représentation romaine de la valeur entière
     * */
    public String intToNombre() {
        int reste = valeur;
        StringBuilder representation = new StringBuilder();
        for(int i=0; i<VALEURS_ROMAINS.length; i++) {
            while(reste>=VALEURS_ROMAINS[i]) {

                /////////Amelioration
                char c=String.valueOf(reste).charAt(0);
                if(c=='9') {
                    representation.append(REPRESENTATION_ROMAINS[i + 1]).append(REPRESENTATION_ROMAINS[i - 1]);
                    reste = reste - 9*VALEURS_ROMAINS[i+1];
                }else {
                    if(c=='4') {
                        representation.append(REPRESENTATION_ROMAINS[i]).append(REPRESENTATION_ROMAINS[i - 1]);
                        reste = reste - 4*VALEURS_ROMAINS[i];
                    }
                    else {

                        ////////// cas normal
                        representation.append(REPRESENTATION_ROMAINS[i]);
                        reste = reste - VALEURS_ROMAINS[i];
                    }

                }


            }
        }
        return representation.toString();
    }

    /** soustraction d'un nombre au nombre courant
     *
     * @param n:nombre avec lequel on veut soustraire
     * */
    public void moins(Nombre n) {
        valeur=valeur - n.valeur;
    }

    /** Donne la représentation entière
     *
     * @return la représentation entière
     * */
    public int nombreToInt() {
        return valeur;
    }

    /**
     * 	addition d�un nombre au nombre courant
     *
     * @param n : nombre avec lequel on veut additionner
     */
    public void plus(Nombre n) {
        valeur=valeur+n.valeur;
    }

}
