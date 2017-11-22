package Package001;

/**
 * Created by cicek on 19.10.2017 15:44
 */


public class J4Donguler {
    public static void main(String[] args){


        int toplam=0;
        int carp=1;


        System.out.println("--------------FOR---------------------\n\n");

        for (int i=1;i<=5;i++){
            System.out.print(i + " - ");
            toplam=toplam+i;
            carp=carp*i;
        }

        System.out.println("top = " + toplam);
        System.out.println("carp = " + carp);



        System.out.println("--------------WHILE---------------------\n\n");

        toplam=0;
        carp=1;
        int j=1;

        while (j<=5){
            System.out.println(j + "  -   ");
            toplam=toplam+j;
            carp=carp*j;

            j++;

        }

        System.out.println("top = " + toplam);
        System.out.println("carp = " + carp);


        System.out.println("--------------DO WHILE--------------------\n\n");

        toplam=0;
        carp=1;
        int k=1;

        do {
            System.out.println(k + "   -   ");
            toplam=toplam+k;
            carp=carp*k;

            k++;
        }while (k<=5);

        System.out.println("top = " + toplam);
        System.out.println("carp = " + carp);


    }
}
