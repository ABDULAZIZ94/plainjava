package com.example.aziz;
import java.util.*;
public class AryShuffle {
   public static void runTest(){
     //create a list and add some colors to the list
     List<String> listString = new ArrayList<String>();
     listString.add("Red");
     listString.add("Green");
     listString.add("Orange");
     listString.add("White");
     listString.add("Black");
     System.out.println("List before shuffling:\n"+listString);
     Collections.shuffle(listString);
     System.out.println("List after shuffling:\n"+listString);
   }
}
