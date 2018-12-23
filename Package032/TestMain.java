package Package032;

import java.util.Scanner;

/**
 * created by cicek on 23.12.2018 18:31
 */

public class TestMain {
    public static void main(String[] args){

        Scanner girdi = new Scanner(System.in);

        int toplamPuan=0;

        while (true){


            System.out.printf("\nbaşlamak için -1 dışında bir sayı gir, çıkmak için -1 gir: ");
            int exit = girdi.nextInt();

            if (exit != -1){

                // dünyalı
                DunyaliveUzayli[] dunyaArray = new DunyaliveUzayli[500];
                int dunyaToplamGuc=0;

                for (int  i=0; i<dunyaArray.length; i++){
                    dunyaArray[i] = rasgeleDunyaliAta(dunyaArray);
                    dunyaToplamGuc += dunyaArray[i].gucHesapla();
                }

                System.out.printf("\ndünya güç: %d\n", dunyaToplamGuc);

                // uzaylı
                DunyaliveUzayli[] uzayArray = new DunyaliveUzayli[500];
                int uzayToplamGuc=0;

                for (int  i=0; i<uzayArray.length; i++){
                    uzayArray[i] = rasgeleUzayliAta(uzayArray);
                    uzayToplamGuc += uzayArray[i].gucHesapla();
                }

                System.out.printf("uzaylı güç: %d\n", uzayToplamGuc);
                System.out.printf("Bu elin puanı: %d\n", dunyaToplamGuc-uzayToplamGuc);

                toplamPuan += dunyaToplamGuc-uzayToplamGuc;
            }

            else {
                System.out.printf("\n\noyun bitti. son puanınız: %d", toplamPuan);
                return ;
            }
        }
    }

    public static DunyaliveUzayli rasgeleDunyaliAta(DunyaliveUzayli[] arr){

            DunyaliveUzayli obj = null; // Exception in thread "main" java.lang.NullPointerException

            int sinifRand = (int)(Math.random()*2); // [0,2)
            int savunmaRand = (int)(Math.random()*10+1); // [0,11)
            int silahRand = (int)(Math.random()*10+1); // [0,11)

            if (sinifRand==0){obj=new Asker(savunmaRand, silahRand);}
            if (sinifRand==1){obj=new Ciftci(savunmaRand, silahRand);}

            return obj;
    }

    public static DunyaliveUzayli rasgeleUzayliAta(DunyaliveUzayli[] arr){

        DunyaliveUzayli obj = null; // Exception in thread "main" java.lang.NullPointerException

        int sinifRand = (int)(Math.random()*2); // [0,2)
        int savunmaRand = (int)(Math.random()*10+1); // [0,11)
        int silahRand = (int)(Math.random()*10+1); // [0,11)

        if (sinifRand==0){obj=new Cyborg(savunmaRand, silahRand);}
        if (sinifRand==1){obj=new Madenci(savunmaRand, silahRand);}

        return obj;
    }
    
        /* output:
    
    başlamak için -1 dışında bir sayı gir, çıkmak için -1 gir: 1

    dünya güç: 8705
    uzaylı güç: 8851
    Bu elin puanı: -146
    
    başlamak için -1 dışında bir sayı gir, çıkmak için -1 gir: 3
    
    dünya güç: 8821
    uzaylı güç: 9590
    Bu elin puanı: -769
    
    başlamak için -1 dışında bir sayı gir, çıkmak için -1 gir: 5
    
    dünya güç: 9278
    uzaylı güç: 9683
    Bu elin puanı: -405
    
    başlamak için -1 dışında bir sayı gir, çıkmak için -1 gir: 22
    
    dünya güç: 8886
    uzaylı güç: 8481
    Bu elin puanı: 405
    
    başlamak için -1 dışında bir sayı gir, çıkmak için -1 gir: 2
    
    dünya güç: 8220
    uzaylı güç: 9239
    Bu elin puanı: -1019
    
    başlamak için -1 dışında bir sayı gir, çıkmak için -1 gir: -1
    
    
    oyun bitti. son puanınız: -1934
     */
    
}
