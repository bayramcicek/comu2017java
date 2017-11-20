package Package002;

/**
 * Created by cicek on 2.10.2017 19:07
 */


import java.util.Scanner;

public class J1ClassObjects {
    public static void main(String [] args){

        //klavyeden ders adı gir
        //ders adını ShowMe() metoduna çıktı olarak göster

        String lesson1;

        Scanner sc1 = new Scanner(System.in); /* ekran girdisi tanımlandı*/

        System.out.print(" Enter a Lesson Name =  ");
        lesson1 = sc1.nextLine(); /* ekran girdisi alındı*/

        J2ClassShow n1 = new J2ClassShow();
        n1.ShowMe(lesson1);



        System.out.println("\n--SUCCESS--");
    }
}
