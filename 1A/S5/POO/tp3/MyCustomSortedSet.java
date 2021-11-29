package tp.tp3;

import java.util.Collections;

public class MyCustomSortedSet extends MyCustomSet{
    //Constructeurs
    public MyCustomSortedSet(){
        super();
    }

    public MyCustomSortedSet(MyCustomSortedSet set){
        super(set);
    }

    //Méthodes
    public void add(int e) {
        if (!this.data.contains(e)) {
            this.data.add(e);
            Collections.sort(this.data);
        }
    }

    public MyCustomSortedSet union(MyCustomSortedSet m) {
        MyCustomSortedSet temp = new MyCustomSortedSet(this);
        for (int i = 0; i < m.size() ; i++) {
            if (!temp.contains(m.get(i)))
                temp.data.add(m.get(i));
        }
        Collections.sort(temp.data);
        return temp;
    }

    public MyCustomSortedSet intersection(MyCustomSortedSet m2) {
        MyCustomSortedSet m = new MyCustomSortedSet();
        for (int i = 0; i < m2.size(); i++) {
            if (this.contains(m2.get(i)))
                m.add(m2.get(i));
        }
        return m;
    }

    public MyCustomSortedSet difference(MyCustomSortedSet m2) {
        MyCustomSortedSet m = new MyCustomSortedSet(this);
        for (int i = 0; i < m2.size(); i++) {m.data.remove(m2.get(i));}
        return m;
    }

    public boolean subset(MyCustomSortedSet m2) {
        int rep = 0;
        if (this.size() < m2.size())
            return false;
        for (int i = 0; i < m2.size(); i++) {
            if (!this.contains(m2.get(i)))
                rep++;
        }
        return rep == 0;
    }

    public double nearest(int val) {
        assert (!this.isEmpty()) :"WARNING EMPTY STACK";
        if (this.contains(val)) {return val;}
        if (val < this.get(0)) {return this.get(0);}
        if (val > this.get(this.size() - 1)) {return this.get(this.size() -1);}
        double nearest;
        int mid = (this.size() + this.size()%2)/2;
        int ecart = (mid + mid%2)/2;
        while (!(this.get(mid ) < val && this.get(mid + 1) > val)) {
            if (this.get(mid) < val)
                mid = mid + ecart;
            else
                mid = mid - ecart ;
            ecart = (ecart + ecart%2) /2;
        }
        if ((val - this.get(mid)) < (this.get(mid + 1) - val)) {nearest = this.get(mid);}
        else {nearest =  this.get(mid + 1);}
        return nearest;
    }
}
