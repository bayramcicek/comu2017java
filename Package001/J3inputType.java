package Package001;

/**
 * Created by cicek on 2.10.2017 01:35
 */


import java.util.Scanner;

public class J3inputType {
    public static void main(String[] args){

        int a1,a2;
        Scanner Nesne1 = new Scanner(System.in);

        System.out.print("ilk sayını gir = ");
        a1 = Nesne1.nextInt();

        System.out.print("ikinci sayını gir = ");
        a2 = Nesne1.nextInt();

          /*
            Read a byte -           nextByte()
            Read a short -          nextShort()
            Read an int -           nextInt()
            Read a long -           nextLong()
            Read a float -          nextFloat()
            Read a double -         nextDouble()
            Read a boolean -        nextBoolean()
            Read a string -         nextLine()
            Read a word -           next()
        */

        System.out.println("\nYour 1.numaran = " + a1);
        System.out.println("Your 2.numaran = " + a2);


        if (a1>a2){
            System.out.println("\na1 büyüktür a2");
        }
        else if (a1<a2){
            System.out.println("\na2 büyüktür a1");
        }
        else {
            System.out.println("\na1 eşittir a2");
        }


    }
}
