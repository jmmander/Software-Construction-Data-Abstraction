package model;

import java.util.ArrayList;

public class Intset {
    ArrayList<Integer> internalArray;

    public Intset(){
        internalArray = new ArrayList<Integer>();
    }
    //modifies: this
    //effects: inserts int into set unless already there, if already there does nothing
    public void insert(int num) {
        if (!internalArray.contains(num)){
            internalArray.add(num);
        }
    }



    //modifies: this
    //effects: removes int from set unless not there, if not there does nothing
    public void remove(int num) {
        if (internalArray.contains(num)){
            internalArray.remove(new Integer(num));
        }
    }

    //effects: if the int is in set, return true, otherwise return false
    public boolean contains(Integer num) {return internalArray.contains(num);}

    //effects: returns size of set
    public int size() { return internalArray.size(); }
}
