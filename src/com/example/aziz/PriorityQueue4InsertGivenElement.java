package com.example.aziz;

import java.util.PriorityQueue;

public class PriorityQueue4InsertGivenElement {
    //
    public static void runTest(){
        // Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<String>();  
        // use add() method to add values in the Priority Queue
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: "+pq1);

        // Inserts the specified element into this priority queue.
        pq1.offer("Blue");
        pq1.offer("Sappire Red");
        pq1.offer("Turquis Blue");
        pq1.offer("Aqua Blue");

        System.out.println("The New Priority Queue: " + pq1);
    }
}
