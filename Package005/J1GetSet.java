package Package005;

/**
 * Created by cicek on 3.10.2017 23:57
 */


import java.util.Scanner;


public class J1GetSet {
    public static void main(String[] args){

        // Data encapsulation = verilerin dış etkenlerden korunmasını sağlama mekanizmasıdır.
        /* this.xyz(this kavramı) --> parametre olarak verilen ismin
            sınıf elemanı ile karışmaması için kullanılır. */
        /* get , set metodu "private" kavramı ile doğrudan ilişkilidir */

        int kilo;

        System.out.print("Kedinin kilosunu tahmin et  = ");
        Scanner input = new Scanner(System.in);
        kilo = input.nextInt();

        J2Kedi k1 = new J2Kedi();
        k1.setKilo(kilo);

        System.out.println("kilo = " + k1.getKilo());
        System.out.println("\n--SUCCESS--");
    }
}
