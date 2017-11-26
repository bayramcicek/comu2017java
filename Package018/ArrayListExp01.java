package Package018;

/**
 * created by cicek on 26.11.2017 22:23
 */

/*
        Visit this website for code-owner :

        https://beginnersbook.com/2013/12/java-arraylist/

 */


import java.util.*;

public class ArrayListExp01 {
    public static void main(String args[]) {

      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
        ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

	  /* Displaying array list elements */
        System.out.println("\nCurrently the array list has following elements:\n"+obj);

	  /*Add element at the given index*/
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
        obj.remove("Chaitanya");
        obj.remove("Harry");

        System.out.println("\n\nCurrent array list is:\n"+obj);

	  /*Remove element from the given index*/
        obj.remove(1);

        System.out.println("\n\nCurrent array list is:\n"+obj);
    }
}
