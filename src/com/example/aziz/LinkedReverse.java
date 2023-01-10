package com.example.aziz;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedReverse {
    public static void runTest(){
        //create an empty linked list
        LinkedList<String> llist = new LinkedList<String>();
        //use add() method to add values in the linked list
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("Pink");
        llist.add("Orrange");

        //print original list
        System.out.println("Original linked list:"+llist);

        Iterator it = llist.descendingIterator();

        //Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
