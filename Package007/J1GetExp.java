package Package007;

/**
 * created by cicek on 4.10.2017 11:01
 */


import java.util.Scanner;

public class J1GetExp {
    public static void main(String[] args){

        /*
        private ders adı kullanıcıdan al
        değer ata ve yazdır.
        */

        String dersadi;

        Scanner xyz = new Scanner(System.in); //kullanıcı girdisi tanımla
        System.out.print("enter a lesson name = ");
        dersadi =  xyz.nextLine(); // girdiyi al


        J2Sinifdrs dr1 = new J2Sinifdrs();// dr1 nesnesini J2Sinifdrs class'ında oluştur.
        dr1.setDersadi(dersadi); // setDersadi methodu ile değeri J2Sinifdrs classındaki değere ata.
        System.out.println("your lesson name is  = \"" + dr1.getDersadi() + "\" bro!");


        System.out.println("\n--SUCCESS--");
    }
}
