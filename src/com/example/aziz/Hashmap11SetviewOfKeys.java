package com.example.aziz;

import java.util.HashMap;
import java.util.Set;

public class Hashmap11SetviewOfKeys {
    public static void runTest(){
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");
        
        // get keyset value from map
         Set<Integer> keyset = hash_map.keySet();
            
        // check key set values
         System.out.println("Key set values are: " + keyset);  
    }
}
