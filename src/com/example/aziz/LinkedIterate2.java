package com.example.aziz;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedIterate2 {
    public static void runTest(){
        //create an empty linked list
        LinkedList<String> llist = new LinkedList<String>();
        // use add() method to add values in the linked list
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("White");
        llist.add("Pink");
        //set  iterator at specified index
        Iterator p = llist.listIterator(1);
        //print list from second position
        while (p.hasNext()){
            System.out.println(p.next());
        }
    }
}
