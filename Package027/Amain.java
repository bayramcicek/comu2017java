package Package027;

/**
 * created by cicek on 13.12.2017 12:12
 */

public class Amain {
    public static void main(String[] args){

        // Araclar arac = new Araclar();  // hata verir çünkü soyut classlardan nesne üretilemez.

        Cars sporAraba = new Cars("Siyah","audi",2);
        sporAraba.drive();
        sporAraba.stop();
        sporAraba.park();

        Gemi hızBotu = new Gemi("Mavi","renault");
        hızBotu.drive();
        hızBotu.stop();
        hızBotu.park();

        System.out.println(" ");

        sporAraba.korna();

        hızBotu.korna(); // Gemi classında korna() methodu yok.O zaman üst(sup) classındaki korna() methodunu çalıştırır.
                         // Böylece soyut sınıfların methodlarına da erişebiliriz.

    }//main

}//class
