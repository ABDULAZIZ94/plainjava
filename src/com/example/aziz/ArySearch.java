package com.example.aziz;
import java.util.*;
public class ArySearch {
    public static void runTest(){
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        //Search the value Red
        if(listString.contains("Red")){
            System.out.println("Found the element");
        }else{
            System.out.println("There is no such element");
        }
    }
}
