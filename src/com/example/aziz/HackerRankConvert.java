package com.example.aziz;

import java.util.Scanner;

public class HackerRankConvert {
    public static void runTest(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        try{
            String str_n = String.valueOf(n);
            if(!str_n.isBlank()){
                System.out.println("Good job");
            }
        }catch(Exception e){
            System.out.println("Wrong answer");
        }

    }
}
