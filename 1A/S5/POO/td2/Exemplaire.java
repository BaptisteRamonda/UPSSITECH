package td.td2;

public class Exemplaire {
    //Attributs
    protected String _editeur;
    protected int _annee;
    protected String _cote;
    protected boolean _emprunte;

    //Constructeur
    public Exemplaire(String editeur,int annee,String cote) {
        _editeur = editeur;
        _annee = annee;
        _cote = cote;
    }

    //Méthodes
    public String getCote(){return _cote;}

    public boolean isEmprunte(){return !_emprunte;}

    public void setEmprunte(){_emprunte=true;}

    public void setRetourne(){_emprunte=false;}

    public String toString() {
        String s = _cote + "," + _editeur + ",";
        if (_emprunte) return s + "emprunte";
        else return s + "dispo";
    }
}
