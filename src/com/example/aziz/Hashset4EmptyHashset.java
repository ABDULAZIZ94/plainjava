package com.example.aziz;

import java.util.HashSet;

public class Hashset4EmptyHashset {
    public static void runTest(){
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        // Remove all elements
        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements "+h_set);   
    }
}
