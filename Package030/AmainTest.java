package Package030;

/** 
 * created by cicek on 20.12.2017 12:03
 */

public class AmainTest {
    public static void main(String[] args){ // interface ve abstract sınıfların nesnesi oluşturulamaz

        Sekil s1 = new Cember(3);
        s1.ciz(Sekil.mavi);
        System.out.println("Çember Alan: " + s1.alanHesapla());

        Dortgen s2 = new Dortgen(4,5); // Sekil s2 = new Dortgen(4,5); // Aynı olur
        s2.ciz(Sekil.sari);
        System.out.println("Dörtgen Alan: " + s2.alanHesapla());

//        Sekil s3 = new Dogru() // hata (abstract class nesnesi oluşturulamaz)

        s1 = new Dortgen(5,6);
        s1.ciz(Sekil.siyah);
        System.out.println("Dörtgen Alan: " + s1.alanHesapla());
        
    }// main

}
