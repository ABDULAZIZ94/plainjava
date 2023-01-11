package com.example.aziz;
import java.io.*;
import java.util.Scanner;
public class HackerRankLoop2 {
    public static void runTest(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0, b=0, n=0;
        int result = 0;
        //taking input
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
            
             
            //processing
            for(int k=0; k<n; k++){
                result = a;
                for(int l=0; l<=k; l++){
                    int power = (int) Math.pow(2, l);
                    int power2 = power *b;
                    result = result + power2;
                   //result = (int) (result+(Math.pow(2, l)*b));
                }
                System.out.print(result+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
