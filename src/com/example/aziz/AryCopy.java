package com.example.aziz;
import java.util.*;
public class AryCopy {
    public static void runTest(){
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: "+List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: "+List2);
        // copy List2 to List1
        //Collections.copy(destlist, srclist);    
        Collections.copy(List1, List2);
        System.out.println("Copy list to Lists2, \n After copy:");
        System.out.println("List1: "+List1);
        System.out.println("List2: "+List2);
    }
}
