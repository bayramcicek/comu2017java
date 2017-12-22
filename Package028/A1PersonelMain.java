package Package028;

import java.util.ArrayList;

/**
 * created by cicek on 13.12.2017 12:38
 */

public class A1PersonelMain {
    public static void main(String[] args){

        MaasliPersonel p1 =new MaasliPersonel("Temel" , "Kotil" , 800.00);
        SaatliPersonel p2 = new SaatliPersonel("Vecihi" , "Hürkuş" , 100 , 42);
        KomisyonluPersonel p3 = new KomisyonluPersonel("Satoshi","Nakamoto",25,3);

        System.out.println(p1);
        System.out.println(p2); // System.out.println(p2.toString());
        System.out.println(p3);

        ArrayList<AbsPersonel> calisanlar = new ArrayList<AbsPersonel>();

        calisanlar.add(p1);
        calisanlar.add(p2);
        calisanlar.add(p3);
        System.out.println("----------------------------------------");

        AbsPersonel[] calisanlar2 = new AbsPersonel[3];
        calisanlar2[0] =p1;
        calisanlar2[1] =p2;
        calisanlar2[2] =p3;

        for (AbsPersonel i:calisanlar ) {

            if (i instanceof MaasliPersonel) {

                System.out.println(i);

                MaasliPersonel p;
                p = (MaasliPersonel)i; // downcasting
                                       // AbsPersonel tipindeki i yi MaasliPersonel'e çevirildi.

                p.setHaftalikMaas(300.00); // çevirdikten sonra cast(çevirim) ettik.

                System.out.println(i);

            }//if

        }// for

    }//main

}// class
