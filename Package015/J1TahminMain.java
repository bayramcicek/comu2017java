package Package015;

/**
 * Created by cicek on 19.10.2017 16:42
 */

/*
0-100 arası random üret
eşit olana dek sayı gir
aritmetik ortalamayı bul
 */

import java.util.Scanner;

public class J1TahminMain {
    public static void main(String[] args){

        Scanner n1 = new Scanner(System.in);

        System.out.println("\n100 den az bir sayı tahmin et = ");
        int tahminAl = n1.nextInt();

        J2Tahmin k1 = new J2Tahmin();
        int random = k1.Random();

        int cift=0;
        int ciftOrt=0;

        int tek=0;
        int tekOrt=0;

        if (tahminAl %2==0) {

            cift = cift + tahminAl;
            ++ciftOrt;
        }
        else {

            tek = tek +tahminAl;
            ++tekOrt;
        }

        while (tahminAl!=random){

            if (tahminAl<random){
                System.out.println("büyük yaz");
                System.out.println(" sayi tahmin et = ");
                tahminAl = n1.nextInt();
                if (tahminAl %2==0) {

                    cift = cift + tahminAl;
                    ++ciftOrt;
                }
                else {

                    tek = tek +tahminAl;
                    ++tekOrt;
                }
            }

            else {
                System.out.println("küçük yaz");
                System.out.println(" sayi tahmin et = ");
                tahminAl = n1.nextInt();
                if (tahminAl %2==0) {

                    cift = cift + tahminAl;
                    ++ciftOrt;
                }
                else {

                    tek = tek +tahminAl;
                    ++tekOrt;

                }

            }
        }


        System.out.println("true ");/////////////////////////////////////////true///////////


        System.out.println(ciftOrt);// kaç çift sayı yazıldı
        System.out.println(tekOrt);// kaç tek sayı yazıldı

        System.out.println(cift);// çift sayıların toplamı
        System.out.println(tek);// tek sayıların toplamı

        double ortcift=0.000;

        if (ciftOrt != 0){// paydanın 0 olmasına karşın

            ortcift=cift/ciftOrt;
            System.out.println(ortcift);
        }


        double orttek=0.000;

        if (tekOrt != 0){// paydanın 0 olmasına karşın

            orttek=tek/tekOrt;
            System.out.println("\n" + orttek);
        }

    }//main
}//class
