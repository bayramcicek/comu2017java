package Package016;

/**
 * created by cicek on 25.11.2017 23:25
 */

public class Arrays07 {
    public static void main(String[] args) {

        int[] dizi1 = new int[5];             //1.dizi

        int[] dizi2;// declare -> bildirim    //2.dizi
        dizi2 = new int[3]; // create

        String[] dizi3 = new String[4];       //3.dizi

        int[] dizi4 = {2,3,5,7,9};            //4.dizi


        System.out.print("dizi4 boyutu = " + dizi4.length);
        System.out.println(" , 3. indisi = " + dizi4[3]);

        diziYazdirString(dizi3);    //atamasız
        diziYazdirInt(dizi1);       //atamasız
        diziYazdirInt(dizi2);       //atamasız


        System.out.printf("\n\n---------------------------- \n------------dizi4 ----------");
        diziYazdirInt(dizi4);       //atamalı

        System.out.print("\n\nPass by reference -----------dizi4 ");
        modifiyeDiziRef(dizi4);
        diziYazdirInt(dizi4);

        System.out.print("\n\nPass by value -----------dizi4 ");
        modifiyeDiziVal(dizi4[0]);
        diziYazdirInt(dizi4);

    }//main - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //


    public static void diziYazdirString(String[] dizi){

        System.out.print("\ndizi3(String);");
        System.out.print("\nindex       deger \n");

        for (int i=0; i<dizi.length;i++){
            System.out.println(i + ". indis --> " + dizi[i]);
        }

    }

    public static void diziYazdirInt(int[] dizi){

        System.out.print("\ndizi(int);");
        System.out.print("\nindex       deger \n");

        for (int i=0; i<dizi.length;i++){
            System.out.println(i + ". indis --> " + dizi[i]);
        }

    }

    public static void modifiyeDiziRef(int[] dizi){

        for (int i=0; i<dizi.length;i++){

            dizi[i]=dizi[i] + 1;

        }

      }

    public static void modifiyeDiziVal(int counter){

        counter += 50;
    }

}//class
