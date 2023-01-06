package com.example.aziz;
import java.util.*;
public class AryRetrieve {
    public static void runTest(){
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orrange");
        listString.add("White");
        listString.add("Black");
        //Print the list
        System.out.println(listString);
        //Retrieve the first and third element
        String element = listString.get(0);
        System.out.println("First element: "+element);
        element = listString.get(2);
        System.out.println("Third element: "+element);
    }
}
