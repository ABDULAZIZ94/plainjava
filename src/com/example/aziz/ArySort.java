package com.example.aziz;
import java.util.*;
public class ArySort {
    public static void runTest(){
        //create a list and add some colors to the list
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println("List before sort: "+listString);
        Collections.sort(listString);
        System.out.println("List after sort: "+listString);
    }
}
