package com.example.aziz;
import java.util.Scanner;
public class HackerRankScanner {
    public static void runTest(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        //scan = new Scanner(System.in); //error in hackerank
        //scan.nextLine(); //without this \n new line captured
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
