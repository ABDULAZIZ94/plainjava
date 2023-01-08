package com.example.aziz;
import java.util.*;
public class AryExtract {
    public static void runTest(){
        //Create a list and add some colors to the listt
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("Black");
        System.out.println("Original list:"+listString);
        List<String> subList = listString.subList(0, 3);
        System.out.println("List of the three elements: "+subList);
    }
}
