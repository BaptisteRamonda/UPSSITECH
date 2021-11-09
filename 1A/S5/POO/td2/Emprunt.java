package td.td2;

import java.util.ArrayList;

public class Emprunt {
    //Attributs
    private ArrayList<String> _listEmprunts;
    private Pret _centreDePret;

    //Constructeur
    public Emprunt(Pret centreDePret){
        _listEmprunts = new ArrayList<>();
        _centreDePret = centreDePret;
    }

    //Methodes
    public void emprunter(String titre, String auteur) throws ExceptionOuvrageNExistePas {
        _centreDePret.emprunterExemplaire(titre, auteur);
    }
}
