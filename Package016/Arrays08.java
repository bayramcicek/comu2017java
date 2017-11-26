package Package016;

/**
 * created by cicek on 26.11.2017 10:14
 */

public class Arrays08 {
    public static void main(String[] args){

        int[][] dizi1 = new int[3][4]; // 3 satır 4 stun

        int[][] dizi2= {{1,2,3},{4,5,6}};

        int[][] dizi3= {{1,2,3},{4,4,5,5,6}};

        int[][] dizi4= new int[2][];

        int[][] dizi5= new int[1][5];
        int[] dizi5a= new int[5];

        int[] dizison = {1,2,3,4,5};

        dizi4[0]=new int[3];
        dizi4[1]=new int[5];

        diziGoster(dizi1);
        diziGoster(dizi2);
        diziGoster(dizi3);
        diziGoster(dizi4);
        diziGoster(dizi5);
        diziGosterTek(dizi5a);

        System.out.println("\n\ndizi3 satır sayısı = "+ dizi3.length);
        System.out.println("dizi3 1. satır uzunluğu = "+ dizi3[0].length);
        System.out.println("dizi3 2. satır uzunluğu = "+ dizi3[1].length);

        System.out.println("\n\ndizison uzunluğu = "+ dizison.length);

    }//main


    public static void diziGoster(int[][] dizi){////

        System.out.print("------------------\n");

        for (int satir=0;satir<dizi.length;satir++){

            for (int stun=0;stun<dizi[satir].length;stun++){

                System.out.print(dizi[satir][stun] + " ");

            }

            System.out.print("\n");
        }

    }////

    public static void diziGosterTek(int[] dizi){////

        System.out.print("------------------\n");

        for (int satir=0;satir<dizi.length;satir++){

                System.out.print(dizi[satir]+ " ");

        }

    }////

}
