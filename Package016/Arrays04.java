package Package016;

/**
 * created by cicek on 25.11.2017 17:36
 */

public class Arrays04 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Orijinal array = ");

        for (int i : array) { //array'in her i elemanı için (artan)

            System.out.print(" "+ i);

        }

        modifyArray(array);
        System.out.println("\n\nModify array----------------");

        for (int i : array) {
            System.out.println("    "+ i);

            System.out.printf("modifyElement() metodunna gitmeden önce array[3] = %d\n", array[3]);

            modifyElement(array[3]);

            System.out.printf("modifyElement() metodundan sonra array[3] = %d\n\n\n", array[3]);
        }
    }

    public static void modifyArray(int[] dizi) {

        for (int j=0; j<dizi.length; j++) {

            dizi[j] *= 2;// dizi[i]=dizi[i]*2
        }
    }

    public static void modifyElement(int element) {

        element*= 2;
        System.out.printf("modifyElement() metodundan içinde element= %d\n", element);

    }
}
