package com.example.aziz;

import java.util.*;

public class AryUpdate {
    public static void runTest(){
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orrange");
        listString.add("white");
        listString.add("Black");
        //Print the list
        System.out.println(listString);
        //update the third element with yellow
        listString.set(2, "Yellow");
        //Print the list again
        System.out.println(listString);
    }
}
