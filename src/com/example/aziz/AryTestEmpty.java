package com.example.aziz;
import java.util.ArrayList;
import java.util.Collections;

public class AryTestEmpty {
    public static void runTest(){
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: "+ c1);
        System.out.println("Checking the above array list is empty or not!"+ c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elemenets "+c1);
        System.out.println("Checing the above array list is empty or not!"+c1.isEmpty());
    }
}
