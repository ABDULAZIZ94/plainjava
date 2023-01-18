package com.example.aziz;

import java.io.*;
import java.util.*;


public class HackerRankString {
    public static void runTest(){
        //getting input
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        //sum length of two string
        int sum = A.length() + B.length();
        System.out.println(sum);

        //comparing two string lexically
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //uppercase first character
        String new_A = A.substring(0,1).toUpperCase() +A.substring(1,A.length());
        String new_B = B.substring(0,1).toUpperCase() +B.substring(1,B.length());
        
        System.out.println(new_A+" "+new_B);
        sc.close();
    }
}
