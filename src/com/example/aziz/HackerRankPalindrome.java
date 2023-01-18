package com.example.aziz;

import java.util.Scanner;

public class HackerRankPalindrome {
    public static void runTest(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int Amod2 = A.length()%2;
        boolean polindrome = false;
        if(Amod2==0){
            int middle = A.length() / 2;
            String A_right = A.substring(middle, A.length());
            String A_reversed = "";
            for (int i = 0; i < A_right.length(); i++) {
                A_reversed = A_right.charAt(i) + A_reversed;
            }
            String A_left = A.substring(0, middle);
            polindrome = A_left.contentEquals(A_reversed);
        }else if(Amod2==1){
            int middle = Math.floorDiv(A.length(),  2);
            String A_right = A.substring(middle+1, A.length());
            String A_reversed = "";
            for (int i = 0; i < A_right.length(); i++) {
                A_reversed = A_right.charAt(i) + A_reversed;
            }
            String A_left = A.substring(0, middle);
            polindrome = A_left.contentEquals(A_reversed);
        }

        if(polindrome){
            System.out.println("Yes");
        }else if(! polindrome){
            System.out.println("No");
        }
   
    }
}
