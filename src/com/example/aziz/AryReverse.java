package com.example.aziz;
import java.util.*;
public class AryReverse {
    public static void runTest(){
        //Create a list ad add some colors to the list
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println("List before reversing :\n" + listString);
        Collections.reverse(listString);
        System.out.println("List after reversing :\n"+ listString);
    }
}
