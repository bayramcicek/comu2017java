package Package016;

/**
 * created by cicek on 25.11.2017 16:48
 */

public class Arrays03 {
    public static void main(String[] args){

        int[] dizi = {0,1,0,2,3,7,1,2,4,2,1};//öğrencilerin not aldığı aralıklar

        /*

          0-9 -> 0
        10-19 -> 1
        20-29 -> 0
        30-39 -> 2
        40-49 -> 3
        50-59 -> 7
        60-69 -> 1
        70-79 -> 2
        80-89 -> 4
        90-99 -> 2
          100 -> 1

         */

        int i,s;

        for (i=0;i<dizi.length;i++){//

            if (i==10)
                System.out.printf("\n%5d",100);

            else
                System.out.printf("\n%2d-%2d",i*10,i*10+9);

            for (s=0;s<dizi[i];s++){

                System.out.printf(" *");

            }
        }//

    }//main
}
