package ui;

import model.Intset;

public class IntSetUsage {
    public static void main(String[] args) {
        model.Intset mySet = new Intset();
        mySet.insert(4);
        System.out.println("Contains 4? " + mySet.contains(4));
        System.out.println("set size: " + mySet.size());
        mySet.remove(4);
        System.out.println("Contains 4? " + mySet.contains(4));
        System.out.println("set size: " + mySet.size());
    }
}
