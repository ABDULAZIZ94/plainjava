package com.example.aziz;

import java.util.SortedMap;
import java.util.TreeMap;

public class Treemap22GetPortionOfMap2 {
    public static void runTest(){
        // Declare tree maps
        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
        SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

        // Put elements to the map 
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + tree_map);
        sub_tree_map = tree_map.subMap(20, true, 40, true);
        System.out.println("Sub map key-values: " + sub_tree_map);
    }
}
