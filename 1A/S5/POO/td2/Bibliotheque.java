import java.util.ArrayList;

public class Bibliotheque {
    //Attributs
    protected ArrayList<Ouvrage> _listeOuvrages;

    //Constructeur
    public Bibliotheque(){
        _listeOuvrages = new ArrayList<>();
    }

    //Méthodes
    public void ajoutOuvrage(String titre, String auteur) throws ExceptionOuvrageExistant {
        for (Ouvrage ouv : _listeOuvrages){
            if (ouv.get_titre().compareTo(titre) == 0 &&
                ouv.get_auteur().compareTo(auteur) == 0){
                throw new ExceptionOuvrageExistant("L'ouvrage existe déjà.");
            }
        }
        Ouvrage newOuvrage = new Ouvrage(titre, auteur);
        _listeOuvrages.add(newOuvrage);
    }

    public void emprunterOuvrage(String titre, String auteur) throws ExceptionOuvrageNExistePas {
        for(Ouvrage ouvr : _listeOuvrages) {
            if (ouvr.get_titre().compareTo(titre) == 0 && ouvr.get_auteur().compareTo(auteur) == 0) {
                emprunterOuvrage(ouvr);
            }
        }
        throw new ExceptionOuvrageNExistePas("L'ouvrage n'existe pas.");
    }

    private void emprunterOuvrage(Ouvrage ouvrage) {
        try{
            ouvrage.emprunterExemplaires();
        } catch (Ouvrage.ExceptionExemplairePasLibre e){
            e.printStackTrace();
        }
    }

    //consulterOuvrage
    //rechercherOuvrage
    //toString
    //ajouterExemplaire(Ouvrage, )
    //supprimerExemplaire
    //rendreUnExemplaire
}
