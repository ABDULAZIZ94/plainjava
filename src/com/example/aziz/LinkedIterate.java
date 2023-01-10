package com.example.aziz;

import java.util.LinkedList;

public class LinkedIterate {
    public static void runTest(){
        //Create an empty linked list
        LinkedList<String> llist = new LinkedList<String>();
        //use add() method to add the values in the linked list
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("White");
        llist.add("Pink");
        llist.add("Yellow");

        //print the list
        for(String element:llist){
            System.out.println(element);
        }
        
    }
}
