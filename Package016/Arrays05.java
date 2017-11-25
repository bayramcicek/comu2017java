package Package016;

/**
 * Created by cicek on 25.11.2017 19:02
 */

import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] ogrenciler = new int[10];
        int[] frequency = new int[6];

        for (int i=0;i<10;i++){//

            System.out.printf("\nSiniftaki 10 öğrencinin \n0-5 arası notlarını giriniz = ");
            ogrenciler[i] = input.nextInt();

            try{ //doğruysa devam et1

                ++frequency[ogrenciler[i]];
            }

            catch (ArrayIndexOutOfBoundsException ERROR){ //yanlışsa bu hatayı göster

                System.out.println("\n\n!!!Lutfen 0-5 arası değer gir\n" + ERROR + "!!!\n"); // ERROR kısımları aynı olmalı
                i--;
            }

        }//

        System.out.printf("-----Not-----Frekans--------\n");

        for (int i=0;i<frequency.length;i++){

            System.out.printf("%6d %10d\n",i,frequency[i]);
        }
    }
}
