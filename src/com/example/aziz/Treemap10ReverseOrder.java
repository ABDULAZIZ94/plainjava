package com.example.aziz;

import java.util.TreeMap;

public class Treemap10ReverseOrder {
    public static void runTest(){
        // Create a tree map
        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

        // Put elements to the map 
        tree_map1.put("C2", "Red");
        tree_map1.put("C1", "Green");
        tree_map1.put("C4", "Black");
        tree_map1.put("C3", "White");

        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());
    }
}
