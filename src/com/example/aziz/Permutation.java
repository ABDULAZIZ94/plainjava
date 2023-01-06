package com.example.aziz;

public class Permutation {
 /*
  * A method exposed to client to calculate permutation of String in Java. 
  */
   public static void permutation(String input){
    permutation("", input);
}

/*
* Recursive method which actually prints all permutations
* of given String, but since we are passing an empty String
* as current permutation to start with,
* I have made this method private and didn't exposed it to client. 
*/
private static void permutation(String perm, String word) {
  if (word.isEmpty()) {
      System.err.println(perm + word);

  } else {
      for (int i = 0; i < word.length(); i++) {
          permutation(perm + word.charAt(i), word.substring(0, i) 
                          + word.substring(i + 1, word.length()));
      }
  }

}

public static void test(){
    String str = "string";
    System.out.println(str.substring(0,0));
    System.out.println(str.substring(0,1));
    System.out.println(str.substring(1,2));
    System.out.println(str.substring(2,2));
    System.out.println(str.substring(0,5));
    System.out.println(str.substring(0,6));
    System.out.println(str.substring(5,6));
    System.out.println(str.length());
    System.out.println(str.charAt(6));
}

}
