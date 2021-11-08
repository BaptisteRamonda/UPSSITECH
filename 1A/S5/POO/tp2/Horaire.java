package tp.tp2;

public class Horaire {
    //Attributs
    int heure;
    int minute;

    //Constructeurs
    public Horaire(int h, int m) throws ExceptionTP2 {
        this.heure = h;
        this.minute = m;
        if((minute<0) || (minute>59) || (heure<0) || heure>23)
            throw new ExceptionTP2(0);
    }

    public Horaire(Horaire horaire) throws ExceptionTP2{
        this.heure = horaire.heure;
        this.minute = horaire.minute;
        if((minute<0) || (minute>59) || (heure<0) || heure>23)
            throw new ExceptionTP2(0);
    }

    //Méthodes
    public boolean apres(Horaire horaire) throws ExceptionTP2{
        if((horaire.heure < this.heure))
            return true;
        return (horaire.heure == this.heure) && (horaire.minute < this.minute);
    }

    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof Horaire))
            return false;
        Horaire test = (Horaire) o;
        return (this.heure == test.heure) && (this.minute == test.minute);
    }

    public String toString(){
        String s = "";
        s = s + this.heure + ":" + this.minute;
        return s;
    }

}
