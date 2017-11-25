package Package016;

/**
 * created by cicek on 25.11.2017 14:52
 */

public class Arrays01 {
    public static void main(String[] args){

        /*

        Array = Dizi = 1 den fazla ve aynı tip elemanların tutulması

        int[] dizi = new int[size];
        
        int[] a = {12,23,34,45,56};

         */

        int[] a = new int[5];//eleman sayısı --> 5
        int i,e=15;

        for (i=0;i<5;i++){

            a[i] = e;
            e=e+10;

        }

        System.out.println("Eleman" + "    Index" + "        Sıra");

        for (i=0;i<a.length;i++){

            System.out.println(a[i] + "           " + i + "           " + (i+1));

        }
    }
}
