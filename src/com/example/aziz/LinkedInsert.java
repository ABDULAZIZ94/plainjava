package com.example.aziz;

import java.util.LinkedList;

public class LinkedInsert {
    public static void runTest(){
        //create an empty linked list
        LinkedList <String> llist = new LinkedList <String>();
        // use add() method to add values in the linked list
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("White");
        llist.add("Pink");
        System.out.println("Original linked list: ");
        System.out.println("Let add the Yello color after the Red Color");
        llist.add(1, "Yellow");
        //print the list
        System.out.println("The linked list:" + llist);
    }
}
