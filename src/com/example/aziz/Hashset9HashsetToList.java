package com.example.aziz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashset9HashsetToList {
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
      
      // Create a List from HashSet elements
      //Not fixed size
       List<String> list = new ArrayList<String>(h_set);
   
       // Display ArrayList elements
       System.out.println("ArrayList contains: "+ list);
    }
}
