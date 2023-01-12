package com.example.aziz;

public class HackerRankSingleton {
    //in hacker rank class is Singleton
    private HackerRankSingleton(){
    }
    public String str;
    private static HackerRankSingleton s = new HackerRankSingleton();
    public static HackerRankSingleton getSingleInstance(){
        return s;
    }
    public static void runTest(){
        HackerRankSingleton hrs = HackerRankSingleton.getSingleInstance();
        hrs.str = "Test singleton";
        System.out.println(hrs.str) ;
    }
}
