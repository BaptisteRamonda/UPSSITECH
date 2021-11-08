package tp.tp2;

public class Date {
    //Attributs
    int jour;
    int mois;
    int annee;

    //Constructeurs
    public Date(int j, int m, int a) throws ExceptionTP2{
        this.jour = j;
        this.mois = m;
        this.annee = a;
        if((annee<0) || (mois<=0) || (mois>12) || (jour<=0) || (jour>31) || ((mois==2) && (jour>29)) || (!(((annee%4 == 0) && (annee%100 != 0)) || (annee%400 == 0)) && (mois==2) && (jour>28)))
            throw new ExceptionTP2(1);
    }

    public Date(Date date) throws ExceptionTP2{
        this.jour = date.jour;
        this.mois = date.mois;
        this.annee = date.annee;
        if((annee<0) || (mois<=0) || (mois>12) || (jour<0) || (jour>31))
            throw new ExceptionTP2(1);
    }

    //Methodes
    public boolean apres(Date date){
        if(date.annee < this.annee)
            return true;
        if((date.annee == this.annee) && (date.mois < this.mois))
                return true;
        return ((date.annee == this.annee) && (date.mois == this.mois) && (date.jour < this.jour));
    }

    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof Date))
            return false;
        Date test = (Date) o;
        return (this.annee == test.annee) && (this.mois == test.mois) && (this.jour == test.jour);
    }

    public String toString(){
        String s = "";
        s = s + this.jour + "/" + this.mois + "/" + this.annee;
        return s;
    }

    public Date anneeSuivante() throws ExceptionTP2 {
        Date date = new Date(this.jour, this.mois, this.annee);
        //Vérification année bissextile
        if ((date.mois == 2) && (date.jour == 29)){
            date.annee ++;
            date.mois ++;
            date.jour = 1;
            return date;
        }
        date.annee ++;
        return date;
    }

    public Date moisSuivant() throws ExceptionTP2{
        if((annee<0) || (mois<=0) || (mois>12) || (jour<0) || (jour>31))
            throw new ExceptionTP2(1);
        Date date = new Date(this.jour, this.mois, this.annee);
        //Vérification 31 de chaque mois suivi d'un 30
        if((date.jour == 31) && ((date.mois == 3) || (date.mois == 5) || (date.mois == 8) || (date.mois == 10))){
            date.mois++;
            date.jour = 30;
            return date;
        }
        //Vérification mois février bissextile
        if ((date.mois == 1) && ((date.jour == 30) || (date.jour == 31)) && (((date.annee%4 == 0) && (date.annee%100 != 0)) || (date.annee%400 == 0))){
            date.mois ++;
            date.jour = 29;
            return date;
        }
        //Vérification mois février classique
        if ((date.mois == 1) && ((date.jour == 30) || (date.jour == 31))){
            date.mois++;
            date.jour = 28;
            return date;
        }
        //Vérification mois de décembre
        if ((date.mois == 12)){
            date.annee++;
            date.mois = 1;
            return date;
        }
        date.mois++;
        return date;
    }

    public Date jourSuivant() throws ExceptionTP2{
        if((annee<0) || (mois<=0) || (mois>12) || (jour<0) || (jour>31))
            throw new ExceptionTP2(1);
        Date date = new Date(this.jour, this.mois, this.annee);
        //Vérification 31 du mois + décembre
        if((date.jour == 31) && ( (date.mois == 1) || (date.mois == 3) || (date.mois == 5) || (date.mois == 7) || (date.mois == 8) || (date.mois == 10) || (date.mois == 12))){
            if (date.mois == 12){
                date.annee++;
                date.mois = 1;
            }
            else
                date.mois++;
            date.jour = 1;
            return date;
        }

        //Vérification 30 du mois
        if((date.jour == 30) && ((date.mois == 4) || (date.mois == 6) || (date.mois == 9) || (date.mois == 11))){
            date.jour = 1;
            date.mois++;
            return date;
        }

        //Vérification annee bissextile
        if ((date.mois == 2) && (date.jour == 29) && (((date.annee%4 == 0) && (date.annee%100 != 0)) || (date.annee%400 == 0))){
            date.mois = 3;
            date.jour = 1;
            return date;
        }
        if ((date.mois == 2) && (date.jour == 28) && (((date.annee%4 == 0) && (date.annee%100 != 0)) || (date.annee%400 == 0))){
            date.jour++;
            return date;
        }
        if ((date.mois == 2) && (date.jour == 28) && !(((date.annee%4 == 0) && (date.annee%100 != 0)) || (date.annee%400 == 0))){
            date.mois=3;
            date.jour = 1;
            return date;
        }
        date.jour++;
        return date;
    }

}
