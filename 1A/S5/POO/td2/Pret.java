package td.td2;

public class Pret {
    //Attributs
    private Bibliotheque _bibliotheque;

    //Constructeur
    public Pret(Bibliotheque bibliotheque){
        _bibliotheque = bibliotheque;
    }

    //Methodes
    public void emprunterExemplaire(String titre, String auteur) throws ExceptionOuvrageNExistePas {
        _bibliotheque.emprunterOuvrage(titre, auteur);
    }
}
