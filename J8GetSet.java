package PackageJavaNesne2;

/**
 * Created by cicek on 4.10.2017 01:34
 */
import java.util.Scanner;
public class J8GetSet {
    public static void main(String[] args){
        // Data encapsulation = verilerin dış etkenlerden korunmasını sağlama mekanizmasıdır.
        /* this.xyz(this kavramı) --> parametre olarak verilen ismin
            sınıf elemanı ile karışmaması için kullanılır. */
        /* get , set metodu "private" kavramı ile doğrudan ilişkilidir */
        int kilo1;
        System.out.print("Kedinin kilosunu tahmin et  = ");
        Scanner input = new Scanner(System.in);
        kilo1 = input.nextInt();

        Kedi1 k2 = new Kedi1();
        k2.setKilo1(kilo1); // kiloyu atadı

        k2.Playy(); /* k2 nesnesi Kedi classında zaten oluşturulduğu için direkt
                        Playy() methodunu(ben fonksiyon diyorum) çağırabiliriz.*/




        System.out.println("\n--SUCCESS--");
    }
}
class Kedi1{
    private int kilo1;

   /* public Kedi(int kilo) {
        this.kilo = kilo;
    }*/

    public void setKilo1(int a){ //set = vermek , ne vermek? -> değer vermek
        kilo1=a;
    }

    private int getKilo1() { // get = almak , ne almak? -> geri dönüş değeri almak yani return;
        return kilo1;        /* private int sadece kendi bulunduğu classta görülebildiği için aynı
                                classtaki Playy() methodu ile çağırıp yazdırmalıyız*/
    }
    public void Playy(){
        System.out.println("Kilo = " + getKilo1());
    }


}
