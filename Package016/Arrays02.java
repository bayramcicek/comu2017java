package Package016;

/**
 * created by cicek on 25.11.2017 16:30
 */

public class Arrays02 {
    public static void main(String[] args){

        int ARRAY_LENGTH=6;

        int[] a = new int[ARRAY_LENGTH];

        for (int i=0;i<a.length;i++){// a.length --> dizinin uzunluğu

            a[i]=6+i*9;

        }

        System.out.println("index" + "    Value");

        for (int i=0;i<a.length;i++){

            System.out.println(i + "         " + a[i]);

        }
    }//main
}
