package Package029;

/**
 * created by cicek on 22.12.2017 15:36
 */

public class Amain {
    public static void main(String[] args){

        INTER[] dizi = new INTER[4];

        dizi[0] = new SatınAl("Arduino", 10 , 5);
        dizi[1] = new SatınAl("3D Yazılcı", 35 , 2);
        dizi[2] = new Maasli("Lee" , 1234000234 , 2500);
        dizi[3] = new Yuzdeli("Kim Jong-un" , 432100098 , 2500 , 1.5 , 10);


        for (int i=0;i<dizi.length;i++){

            System.out.println(dizi[i].toString());
        }

        double toplam = 0;
        for (INTER a : dizi){

            toplam = toplam + a.hesapla();
        }

        System.out.println("\n\nToplam: " + toplam);
        
    }// main

}
