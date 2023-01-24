package com.example.aziz;

import java.util.PriorityQueue;

public class PriorityQueue1Create {
    public static void runTest(){
        PriorityQueue<String> queue=new PriorityQueue<String>();  
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);
    }
}
