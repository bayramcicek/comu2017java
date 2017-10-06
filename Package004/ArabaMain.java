package Package004;

/**
 * Created by cicek on 6.10.2017 11:01
 */

/*
    ArabaMain sınıfı oluştur.
  -----------------------------
     2 araba nesnesi üret.
      1.si constructor olsun
      2.si klavyeden al
     instance variable ekrana yazdır
     hızlan() methodu kullan


    Araba sınıfı oluştur.
   -------------------------------
   plaka ==> private olsun
   renk,motor hacmi ==> public olsun

   hızlan(ivme,hız){
   (ivme.hız)/2
   }

 */

import java.util.Scanner;
public class ArabaMain {
    public static void main(String[] args){

        String plaka,renk;
        int motorV,hiz,ivme;

        Araba a1 = new Araba("XY54TR","Brown",120);
        Araba a2 = new Araba();

        System.out.println("önceki plaka = " + a1.getPlaka() + "\nönceki renk = " + a1.renk + "\nönceki motor hamci = " + a1.motorV);
                                                                                                // motorV static olsaydı
                                                                                                // --> Araba.motorV de olurdu.

        Scanner oku = new Scanner(System.in);

        System.out.print("\n\nYENI plaka gir = ");
        plaka = oku.nextLine();

        System.out.print("\nYENI renk gir = ");
        renk = oku.nextLine();

        System.out.print("\nYENI motor hacmi gir = ");
        motorV = oku.nextInt();

        a2.renk=renk;
        a2.motorV=motorV;
        a2.setPlaka(plaka);

        System.out.println("\n\nSON Plaka = " + a2.getPlaka() + "\nSON Renk = " + a2.renk + "\nSON motorV = " + a2.motorV);


        System.out.print("\n\nHız gir = ");
        hiz = oku.nextInt();

        System.out.print("\nIvme gir = ");
        ivme = oku.nextInt();


        //a2.hızlan(hiz,ivme);

        System.out.println("\n\n\nHızlanma = " + a2.hızlan(hiz,ivme));


        System.out.println("\n--SUCCESS--");
    }
}
