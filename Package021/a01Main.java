package Package021;

/**
 * created by cicek on 10.12.2017 15:01
 */


/*
* 1 tane kütüphane class - yıl
* 1 tane kitap tipinde kitap -id - yazar
* 1 tabe dergi tipinde dergi - dergino
**/

public class a01Main {
    public static void main(String[] args){

        a03Dergi dergi1 = new a03Dergi(9);
        a04Kutuphane kutuphane1 = new a04Kutuphane(2017);

        System.out.println(dergi1);
        System.out.println(kutuphane1);

        a02Kitap k1 = new a02Kitap(0110010011 ,"Author", dergi1 , kutuphane1);

        System.out.println(k1);

    }

}
