package td.td2;

public class main {
    public static void main(String[] args){
        Bibliotheque bib;
        Pret centreDePret;
        Emprunt paul;

        bib = new Bibliotheque();
        try {
            bib.ajoutOuvrage("La robotique","Isaac Asimov");
        } catch (ExceptionOuvrageExistant e) {
            e.printStackTrace();
        }

    }
}
