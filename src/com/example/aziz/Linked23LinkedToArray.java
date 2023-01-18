package com.example.aziz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked23LinkedToArray {
    public static void runTest(){
        // create an empty linked list
        LinkedList <String> linked_list = new LinkedList <String> ();
        linked_list.add("Red");
        linked_list.add("Green");
        linked_list.add("Black");
        linked_list.add("White");
        linked_list.add("Pink");
        System.out.println("Original linked list: " + linked_list);

        //Convert a linked list to array list
        // cannot put reference to List<String>
        // unless import also java.util.List
        List<String> list = new ArrayList<String>(linked_list);

        for (String str : list){
        System.out.println(str);
        }
    }
}
