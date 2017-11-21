package Package010;

/**
 * Created by cicek on 16.10.2017 17:26
 */


import java.util.Scanner;

public class J1KediMain {
    public static void main(String[] args){

        String name;
        double hiz1,hiz2;

        J2Kediler k1 = new J2Kediler("Duman",10,20);
        J2Kediler k2 = new J2Kediler();

        Scanner input=new Scanner(System.in);

        System.out.print("Enter name  = ");
        name=input.nextLine();

        System.out.print("Enter hız1  = ");
        hiz1=input.nextDouble();

        System.out.print("Enter hız2  = ");
        hiz2=input.nextDouble();

        k2.setAll(name,hiz1,hiz2);

        System.out.println("\nİsim = " + k2.getAd() + "\nOrtalama Hız = " + k2.ortalama(k2.getKh(),k2.getTh()));



        System.out.println("---SUCCESS---");
    }
}
