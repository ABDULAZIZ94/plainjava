package com.example.aziz;

import java.util.Scanner;

public interface HackerRankPrintf {
    public static void runTest() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.print(s1);
            
            for(int j=0; j<15-s1.length(); j++){
                System.out.print(" ");
            }
            String x_str = String.valueOf(x);
            while(x_str.length()<3){
                x_str = "0"+x_str;
            }
            
            System.out.println(x_str);
        }
        System.out.println("================================");
        sc.close();
}
}
