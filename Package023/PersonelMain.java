package Package023;

/**
 * created by cicek on 07.12.2017 16:45
 */

public class PersonelMain {
    public static void main(String[] args){

        Personels p1 = new Personels("Jessie","PINKMAN","t-18",100, 0.3);
        System.out.println(p1);

        System.out.println( "Maaş: " + p1.maasHesapla() );

//        p1.setKomisyon(5); // hata verir
//        System.out.println("maas : " + p1.maasHesapla());

        TabanMaasPersonel p2 = new TabanMaasPersonel("İbni" ,"El-Harezmi" , "t-42" , 200 , 0.5 , 150);
        System.out.println(p2);
        System.out.println( "Maaş: " + p2.maasHesapla());

        p2.setTabanMaas(200);
        System.out.println( "\nMaaş: " + p2.maasHesapla());

        p2.setSoyad("NAKAMATO");
        System.out.println( "\nSoyad: " + p2.getSoyad());

        p2.setTabanMaas(9000);
        System.out.println("\nMaaş: " + p2.getTabanMaas());

        System.out.println(p2);

    }//main

}//class
