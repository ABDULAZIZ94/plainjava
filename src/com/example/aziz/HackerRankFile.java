package com.example.aziz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HackerRankFile {
    public static void runTest(){
           //print all file in directory
            // File file = new File(".");
            // for(String fileNames : file.list()) System.out.println(fileNames);

            //in hacker rank using Scanner(System.in)

            File obj = new File("src/com/example/aziz/file.txt");
            Scanner scan;
            int l_no = 1;
            try {
                scan = new Scanner(obj);
                while(scan.hasNext()){
                    System.out.println(l_no+" "+scan.nextLine());
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}
