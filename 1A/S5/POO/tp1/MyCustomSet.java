package tp.tp1;

import java.util.ArrayList;

public class MyCustomSet {
    //Attributs
    protected ArrayList<Integer> data;

    //Constructeur
    public MyCustomSet(){
        this.data = new ArrayList<>();
    }

    //Méthodes
    public void add(int e){if (!this.data.contains(e)) this.data.add(e);}

    public int size(){return this.data.size();}

    public boolean isEmpty(){return this.data.size() == 0;}

    public void remove(Object e){
        if(!this.isEmpty() || this.contains((Integer) e))
            this.data.remove((Integer) e);
    }

    public boolean contains(int e) {return this.data.contains(e);}

    public String toString() {return this.data.toString();}

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

}
