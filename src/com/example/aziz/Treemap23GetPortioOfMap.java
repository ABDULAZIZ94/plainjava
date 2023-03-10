package com.example.aziz;

import java.util.TreeMap;

public class Treemap23GetPortioOfMap {
    public static void runTest(){
        // Declare tree maps
        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

        // Put elements to the map 
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + tree_map);
        System.out.println("Keys are greater than or equal to 20: " + tree_map.tailMap(20));
    }
}
