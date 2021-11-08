package tp.tp2;

import java.util.ArrayList;
import java.util.Objects;

public class Agenda {
    //Attributs
    protected ArrayList<RDV> agenda;

    //Constructeur
    public Agenda(){
        this.agenda = new ArrayList<>();
    }

    //Méthodes
    public void ajoutRDV(RDV rdv){this.agenda.add(rdv);}

    public RDV getRDVParDateEtHeure(Date date, Horaire horaire){
        for (RDV rdv : this.agenda) {
            if (rdv.date.equals(date) && rdv.horaire.equals(horaire))
                return rdv;
        }
        return null;
    }

    public RDV getRDVParNom(String nom){
        for (RDV rdv : this.agenda){
            if (Objects.equals(rdv.nom, nom))
                return rdv;
        }
        return null;
    }

    public void supprimeRDVParDateEtHeure(Date date, Horaire horaire){
        this.agenda.removeIf(rdv -> rdv.date.equals(date) && rdv.horaire.equals(horaire));
    }

    public void supprimeRDVParNom(String nom){
        this.agenda.removeIf(rdv -> Objects.equals(rdv.nom, nom));
    }

    public String toString(){
        StringBuilder s = new StringBuilder("L'agenda contient : \n");
        for (RDV rdv : this.agenda)
            s.append(rdv.toString()).append("\n");
        return s.toString();
    }
}
