package PackageJavaNesne2;

/**
 * Created by cicek on 3.10.2017 23:57
 */
import java.util.Scanner;
public class J7GetSet {
    public static void main(String[] args){

        // Data encapsulation = verilerin dış etkenlerden korunmasını sağlama mekanizmasıdır.
        /* this.xyz(this kavramı) --> parametre olarak verilen ismin
            sınıf elemanı ile karışmaması için kullanılır. */
        /* get , set metodu "private" kavramı ile doğrudan ilişkilidir */
        int kilo;
        System.out.print("Kedinin kilosunu tahmin et  = ");
        Scanner input = new Scanner(System.in);
        kilo = input.nextInt();

        Kedi k1 = new Kedi();
        k1.setKilo(kilo);

        System.out.println("kilo = " + k1.getKilo());




        System.out.println("\n--SUCCESS--");
    }
}
class Kedi{
    private int kilo;

   /* public Kedi(int kilo) {
        this.kilo = kilo;
    }*/

    public void setKilo(int k){ //set = vermek , ne vermek? -> değer vermek
        kilo=k;
    }

    public int getKilo() { // get = almak , ne almak? -> geri dönüş değeri almak yani return;
        return kilo;
    }
}
