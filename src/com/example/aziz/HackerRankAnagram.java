package com.example.aziz;

import java.util.Scanner;

public class HackerRankAnagram {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()){
            return false;
        }
        else {
            String al= a.toLowerCase();
            String bl = b.toLowerCase();

            int count_a = 0;//calculate frequency of occurance
            int count_b = 0;//calculate frequency of occurance
            
            for (int i = 0; i < al.length(); i++){
                char caracter = al.charAt(i);
                for (int j = 0; j < al.length(); j++){
                    count_a = (al.charAt(j) == caracter) ? count_a + 1: count_a;
                    count_b = (bl.charAt(j) == caracter) ? count_b + 1: count_b;
                }
                if (count_a != count_b)
                    return false;
            }
            return true;
        }
    }

    public static void runTest(){

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
