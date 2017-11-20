package Package001;

/**
 * Created by cicek on 2.10.2017 00:54
 */


import java.util.Scanner;

public class J2inputType {
    public static void main(String[] args){

        int s1,s2;
        Scanner num = new Scanner(System.in); /* "num" nesnedir */ /* "Scanner" classı/sınıfı oluşturuldu */

        System.out.print("enter first number = ");
        s1 = num.nextInt();
        /* "num" nesnesini kullanarak "Scanner" sınıfına gitti */

        System.out.print("enter second number = ");
        s2 = num.nextInt();

          /*
            Read a byte -           nextByte()
            Read a short -          nextShort()
            Read an int -           nextInt()
            Read a long -           nextLong()
            Read a float -          nextFloat()
            Read a double -         nextDouble()
            Read a boolean -        nextBoolean()
            Read a String -         nextLine()
            Read a word -           next()
        */

        System.out.println("\nYour 1st number is = " + s1);
        System.out.println("Your 2snd number is = " + s2);



    }

}
