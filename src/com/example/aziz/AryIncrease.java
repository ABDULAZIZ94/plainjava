package com.example.aziz;
import java.util.*;
public class AryIncrease {
    public static void runTest(){
        ArrayList<String> c1 = new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original aray list: "+c1);
        //increase capacity to 6
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: "+c1);
    }
}
