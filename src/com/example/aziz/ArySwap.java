package com.example.aziz;
import java.util.*;
public class ArySwap {
    public static void runTest(){
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Array list before Swap: ");
        for(String a:c1){
            System.out.println(a);
        }

        //swapping list(idex 0) elemet with 3rd(idex 2) elemet
        Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");

        for(String b :c1){
            System.out.println(b);
        }
    }

}
