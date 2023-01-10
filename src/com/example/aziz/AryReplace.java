package com.example.aziz;
import java.util.*;
public class AryReplace {
    public static void runTest(){
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        System.out.println("Original array list: "+color);
        String new_color = "white";
        color.set(1, new_color);

        int num=color.size();
        System.out.println("Replace second element with white");
        for(int i=0; i<num; i++){
            System.out.println(color.get(i));
        }
    }
}
