package com.example.aziz;

import java.util.*;

public class AryIterate {
    public static void runTest(){
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orrange");
        listString.add("White");
        listString.add("Black");
        //iterate over list
        for(String element: listString){
            System.out.println(element);
        }
    }
}
