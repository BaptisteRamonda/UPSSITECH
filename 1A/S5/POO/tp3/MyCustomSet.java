package tp.tp3;

import java.util.ArrayList;

public class MyCustomSet {
    //Attributs
    protected ArrayList<Integer> data;

    //Constructeur
    public MyCustomSet(){
        this.data = new ArrayList<>();
    }

    public MyCustomSet(MyCustomSet set){this.data = new ArrayList<>(set.data) ;}

    //Méthodes
    public void add(int e){if (!this.data.contains(e)) this.data.add(e);}

    public int size(){return this.data.size();}

    public boolean isEmpty(){return this.data.isEmpty();}

    public void remove(Object e){
        if(!this.isEmpty() || this.contains((Integer) e))
            this.data.remove((Integer) e);
    }

    public boolean contains(int e) {return this.data.contains(e);}

    public String toString() {
        String s = "l'ensemble contient ";
        s = s + this.data.size() + " entier(s) :" + this.data;
        return s;
    }

    public void clear() {this.data.clear();}

    public int getRandomInt(int max) {return (int)Math.floor(Math.random() * Math.floor(max));}

    public int random() {
        if(this.isEmpty()) {
            System.out.println("Pile vide.");
            return -1;
        }
        return this.data.get(this.getRandomInt(this.data.size()));
    }

    public boolean equals(MyCustomSet test) {
        if (test == null)
            return false;
        if (this.data.size() != test.data.size()) {
            return false;
        } else {
            int count = 0;
            for(int i = 0; i < this.data.size(); i++) {
                if (this.data.contains(test.data.get(i)))
                    ++count;
            }
            return count >= this.data.size();
        }
    }

    public Integer get(int i) {
        if(i>=0 && i<data.size())
            return data.get(i);
        return null;
    }
}
