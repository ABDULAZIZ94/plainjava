package com.example.aziz;

import java.util.Scanner;

public class HackerRankException {
    public static void runTest(){
        Scanner scan  =  new Scanner(System.in);
        int b = scan.nextInt();
        int h = scan.nextInt();
        if(-100<=b && b<=100 && -100<=h && h<=100)
            try{
                if(! (b>0 && h>0)){
                    throw new Exception("Breadth and height must be positive");
                }else{
                    int area =  b * h;
                    System.out.println(area);
                }
            }catch(Exception e){
                System.out.println(e);
            }
    }
}
