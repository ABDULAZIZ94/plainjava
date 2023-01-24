package com.example.aziz;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.List;

public class PriorityQueue10ToArray {
    public static void runTest(){
        // Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<String>();  
        // use add() method to add values in the Priority Queue
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: "+pq1);

        //Convert a linked list to array list    
        List<String> array_list = new ArrayList<String>(pq1);
        System.out.println("Array containing all of the elements in the queue: "+array_list);
    }
}
