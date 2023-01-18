package com.example.aziz;

import java.util.LinkedList;

public class Linked13RemoveFirstLast {
    public static void runTest(){
        // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
     // use add() method to add values in the linked list
            l_list.add("Red");
            l_list.add("Green");
            l_list.add("Black");
            l_list.add("Pink");
            l_list.add("orange");
        
       // print the list
     System.out.println("The Original linked list: " + l_list);
  
    // Remove the first element
      Object firstElement = l_list.removeFirst();
      System.out.println("Element removed: "+ firstElement);
   
    // Remove the last element
      Object lastElement = l_list.removeLast();
      System.out.println("Element removed: "+ lastElement);
      System.out.println("The New linked list: " + l_list);
      
    }
}
