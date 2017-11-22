package Package012;

import java.util.Random;

/**
 * created by cicek on 22.11.2017 21:14
 */


/*
        Enumeration / saymak,sıralamak,dökmek

      /  Enum Durum(Gecti,Kaldı);
      / int a;
      /  Durum b;  --(int a; gibi)---
      /  b = Durum.Gecti;

---------------------------------------------------------------------------------------
        2 tane zar at
        ilk atışta:
            toplamı 7 veya 11 gelirse KAZAN
            toplamı 2 veya 3 veya 12 gelirse KAYBET

        eğer diğer toplamlar geldiyse:
            puanıma ekle ve tekrar zar AT
        attığın zar toplamı 7 ise KAYBET veya toplam puanına denk olana dek döngü yap.
 */


public class ZarOyunu {

        public static final Random randNum = new Random();

        private enum Durum {Kazan,Kaybet,Devam};

    public static void main(String[] args){

        int puan = 0;
        Durum oyunDurum;
        int zarToplam;

        zarToplam = ZarAt();

        switch(zarToplam){ //switch
            case 7:
            case 11: oyunDurum = Durum.Kazan;
                break;

            case 2:
            case 3:
            case 12: oyunDurum = Durum.Kaybet;
                break;

            default : oyunDurum = Durum.Devam;
                puan = zarToplam;
                    break;

        } //switch

        while(oyunDurum == Durum.Devam){

            zarToplam = ZarAt();
            if (zarToplam == puan)
                oyunDurum = Durum.Kazan;
            else
                oyunDurum = Durum.Kaybet;

        } //while

        if (oyunDurum == Durum.Kazan){
            System.out.println("Kazandınız !!!");
        }


        if (oyunDurum == Durum.Kaybet){
            System.out.println("Kaybettiniz ...");
        }

       // System.out.println("f1 = " + f1);




    } //main sonu

    public static int ZarAt(){
        int zar1 = 1 +randNum.nextInt(6);
        int zar2 = 1 +randNum.nextInt(6);

        return zar1 + zar2;
    }


}//class sonu
