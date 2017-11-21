package Package006;

/**
 * Created by cicek on 4.10.2017 01:34
 */


import java.util.Scanner;

public class J1GetMethod {
    public static void main(String[] args){

        // Data encapsulation = verilerin dış etkenlerden korunmasını sağlama mekanizmasıdır.
        /* this.xyz(this kavramı) --> parametre olarak verilen ismin
            sınıf elemanı ile karışmaması için kullanılır. */
        /* get , set metodu "private" kavramı ile doğrudan ilişkilidir */

        int kilo1;

        System.out.print("Kedinin kilosunu tahmin et  = ");
        Scanner input = new Scanner(System.in);
        kilo1 = input.nextInt();

        J2Kedi1 k2 = new J2Kedi1();
        k2.setKilo1(kilo1);         // kiloyu atadı

        k2.Playy();                  /* k2 nesnesi Kedi classında zaten oluşturulduğu için direkt
                                        Playy() methodunu çağırabiliriz.*/




        System.out.println("\n--SUCCESS--");
    }
}
