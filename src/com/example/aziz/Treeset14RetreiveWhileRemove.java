package com.example.aziz;

import java.util.TreeSet;

public class Treeset14RetreiveWhileRemove {
    public static void runTest(){
        // creating TreeSet 
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);
        System.out.println("Original tree set: "+tree_num);
        /*
         * The pollFirst() method of Java Deque Interface is used to retrieve and remove the first element of the deque.
         *  The method may return null if the given deque is empty.
         */
        System.out.println("Removes the first(lowest) element: "+tree_num.pollFirst());
        System.out.println("Tree set after removing first element: "+tree_num);
    }
}
