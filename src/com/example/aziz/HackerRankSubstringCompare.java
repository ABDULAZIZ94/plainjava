package com.example.aziz;
import java.util.Scanner;

public class HackerRankSubstringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //if(s.length()>=1 && s.length()<=100 && s.matches("[a-zA-Z]+"))
        if(s.length()>=1 && s.length()<=1000)
            for(int j=0; j<=s.length()-k; j++){   
                String sub  = s.substring(j, j+k);
                if(sub.compareTo(smallest)<0 | smallest == ""){
                    smallest = sub;
                }
                if(sub.compareTo(largest)>0 | largest == ""){
                    largest = sub;
                }
            }
        
        return smallest + "\n" + largest;
        //return String.valueOf(s.length());
    }


    public static void runTest() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}