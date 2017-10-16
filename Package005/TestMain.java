package Package005;

/**
 * Created by cicek on 16.10.2017 17:26
 */
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
        String name;
        double hiz1,hiz2;

        Kediler k1 = new Kediler("Duman",10,20);
        Kediler k2 = new Kediler();

        Scanner input=new Scanner(System.in);

        System.out.print("Enter name bro = ");
        name=input.nextLine();

        System.out.print("Enter hız1 bro = ");
        hiz1=input.nextDouble();

        System.out.print("Enter hız2 bro = ");
        hiz2=input.nextDouble();

        k1.setAll(name,hiz1,hiz2);

        System.out.println("\nİsim = " + k1.getAd() + "\nOrtalama Hız = " + k1.ortalama(k1.getKh(),k1.getTh()));





        System.out.println("---SUCCESS---");
    }
}
