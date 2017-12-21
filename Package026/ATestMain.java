package Package026;

/**
 * created by cicek on 21.12.2017 03:11
 */

public class ATestMain {
    public static void main(String[] args){

        Maasli c1 = new Maasli("Ali",12340000,2500);
        Yuzdeli c2 = new Yuzdeli("Veli",43210000,2500,1.5,10);

        System.out.println(" ");
        System.out.println(c1.toString()); // Maasli Calisan Ali 12340000 Kazanç: 2500
        System.out.println(c2.toString()); // Yuzdeli calisan [Maasli calisan] Veli 43210000 Kazanç: 2500+15(Yuzdeli sınıfından)

        Calisan[] dizi = new Calisan[2];
        dizi[0] = c1;
        dizi[1] = c2;

        for (Calisan calisan:dizi){//for

            if (calisan instanceof Maasli)
                ((Maasli)calisan).setMaas(3000);


            if (calisan instanceof Yuzdeli){

                ((Yuzdeli)calisan).setOran(2);
//                ((Yuzdeli)calisan).setMaas(2500); // buradan istediğimiz gibi maaşı düzenleyebiliriz.

            }

        }//for

        for (int i=0;i<2;i++)
            System.out.println("\n" + dizi[i]);

    }//main

}//class
