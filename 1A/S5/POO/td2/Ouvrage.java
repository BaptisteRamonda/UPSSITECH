package td.td2;

import java.util.ArrayList;

public class Ouvrage {
    //Attributs
    protected String _titre;
    protected String _auteur;
    protected ArrayList<Exemplaire> _listeExemplaires;
    protected int _nbExemplaires;

    //Constructeur
    public Ouvrage(String titre, String auteur){
        _titre = titre;
        _auteur = auteur;
        _listeExemplaires = new ArrayList<>();
        _nbExemplaires = 0;
    }

    //Méthodes
    public String get_titre() {return _titre;}

    public String get_auteur() {return _auteur;}

    public int get_nbExemplaires() {return _nbExemplaires;}

    public boolean ajouterExemplaire(String editeur, int annee, String cote){
        Exemplaire newExemplaire;
        newExemplaire = new Exemplaire(editeur, annee, cote);
        for (Exemplaire ex : _listeExemplaires) {
            if (ex.toString().compareTo(newExemplaire.toString()) == 0)
                return false;
        }
        _listeExemplaires.add(newExemplaire);
        _nbExemplaires++;
        return true;
    }

    public boolean supprimerExemplaire(String cote){
        for (Exemplaire ex : _listeExemplaires){
            if(ex.getCote().compareTo(cote)==0){
                _listeExemplaires.remove(ex);
                return true;
            }
        }
        return false;
    }

    public int getNbExemplairesDisponibles(){
        int nbExemplairesDisponibles=0;
        for (Exemplaire ex : _listeExemplaires){
            if(ex.isEmprunte())
                nbExemplairesDisponibles++;
        }
        return nbExemplairesDisponibles;
    }

    public String emprunterExemplaires() throws ExceptionExemplairePasLibre {
        boolean found = false;
        for (Exemplaire ex : _listeExemplaires){
            if(ex.isEmprunte()){
                ex.setEmprunte();
                return ex.getCote();
            }
        }
        return "";
    }

    public boolean retournerExemplaire(String cote){
        if(getNbExemplairesDisponibles() == _nbExemplaires){return false;}
        for (Exemplaire ex : _listeExemplaires){
            if(cote.compareTo(ex.getCote())==0){
                ex.setRetourne();
                break;
            }
        }
        return true;
    }

    public String toString(){
        return _titre + ", " + _auteur + ", " + _nbExemplaires + ", Disponibles:" + getNbExemplairesDisponibles();
    }

    public static class ExceptionExemplairePasLibre extends Throwable {
    }
}
