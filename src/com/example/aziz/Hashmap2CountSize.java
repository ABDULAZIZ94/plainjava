package com.example.aziz;

import java.util.HashMap;

public class Hashmap2CountSize {
    public static void runTest(){
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        System.out.println("Size of the hash map: "+hash_map.size());
    }
}
