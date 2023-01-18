package com.example.aziz;
import java.util.*;

public class HackerRankStringPattern {
    public static void runTest() {
        Scanner scan = new Scanner(System.in);
        try{
            String s = scan.nextLine();
            // Write your code here.

            String[] tokens = new String[]{};
            if(s.length()>0){
                tokens = s.trim().split("[ !,?._'@]+");
                System.out.println(tokens.length);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }else{
                throw new NullPointerException("empty array");
            }
        
        }catch(Exception e){
            System.out.println(0);
        }
        
        scan.close();
    }
}
