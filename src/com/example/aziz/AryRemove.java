package com.example.aziz;

import java.util.ArrayList;
import java.util.List;

public class AryRemove {
    public static void runTest(){
        //create a list and add some colors to the list
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        //print the list
        System.out.println(listString);
        //remove the third element from the list
        listString.remove(2);
        //print the list again
        System.out.println("Afteremoving third element from the list:\n "+listString);
    }
}
