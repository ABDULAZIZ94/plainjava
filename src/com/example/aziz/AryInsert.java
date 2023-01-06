package com.example.aziz;

import java.util.*;

public class AryInsert {
    public static void runTest(){
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        //Print out initial list
        System.out.println(listString);
        //Now insert
        listString.add(0, "Pink");
        listString.add(5, "Yellow");
        //Print altered list
        System.out.println(listString);
    }
}
