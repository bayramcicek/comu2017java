package Package019;

/**
 * created by cicek on 30.11.2017 15:47
 */

public class a1Main { // 30.11.2017 Lab dersindeki kodlar
    public static void main(String[] args){

        a2Tarih dogum    = new a2Tarih(24,7,1949);
        a2Tarih iseGiris = new a2Tarih(18,3,1988);

        System.out.println(" ");

        a3Isci isci = new a3Isci("Ali","Yilmaz",dogum,iseGiris);


        System.out.println(dogum);// dogum un sınıfındaki toString() metodundaki return değerlerini(aldığı parametrelerle) yazdır.
        System.out.println(iseGiris);// iseGiris in sınıfındaki toString() metodundaki return değerlerini(aldığı parametrelerle) yazdır.

        System.out.println(isci);// isci in sınıfındaki toString() metodundaki return değerlerini(aldığı parametrelerle) yazdır.
    }

}
