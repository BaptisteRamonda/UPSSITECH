package tp.tp2;

import java.util.Objects;

public class RDV {
    //Attributs
    Date date;
    Horaire horaire;
    String nom;

    //Constructeurs
    public RDV(Date d, Horaire h, String n){
        this.date = d;
        this.horaire = h;
        this.nom = n;
    }

    public RDV(RDV rdv){
        this.date = rdv.date;
        this.nom = rdv.nom;
        this.horaire = rdv.horaire;
    }

    //Méthodes
    public boolean apres(RDV rdv) throws ExceptionTP2 {
        if (this.date.apres(rdv.date))
            return true;
        return this.date == rdv.date && this.horaire.apres(rdv.horaire);
    }

    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof RDV))
            return false;
        RDV test = (RDV) o;
        return (this.horaire == test.horaire) && (this.date == test.date) && (Objects.equals(this.nom, test.nom));
    }

    public Date getDate(){return this.date;}

    public Horaire getHoraire(){return this.horaire;}

    public String getNom(){return this.nom;}

    public void setDate(Date date){this.date = date;}

    public void setHoraire(Horaire horaire){this.horaire = horaire;}

    public void setNom(String nom){this.nom = nom;}

    public String toString(){
        String s = "Le RDV est pour ";
        s = s + this.nom + " a " + this.date + " et a " + this.horaire;
        return s;
    }
}
