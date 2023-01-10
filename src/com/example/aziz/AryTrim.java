package com.example.aziz;

import java.util.ArrayList;

public class AryTrim {
    /*
    *output seems does not show any differentiation
    * before and trim
    */
    public static void runTest(){
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: "+c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
    }
}
