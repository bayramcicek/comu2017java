package Package017;

/**
 * created by cicek on 26.11.2017 11:41
 */

public class Daire {//class

    int yaricap;
    double cevre;
    double alan;

    final static double pi=3.14;// pi'nin değiştirilmemesi için (final)
    //float pi=3.14f;

    public static void main(String[] args) {//main

        Daire d1 = new Daire(4);
        d1.hesapla(); // hesapla() methodu static olmadığı için nesne oluşturularak çağırıldı.

    }//main


    Daire(int r){// constructor

        yaricap=r;
        cevre=2*pi*r;
        alan=r*r*pi;

    }//

     void hesapla(){////

        System.out.println("\ndairenin yaricapi = "+yaricap);
        System.out.println("\ndairenin cevresi = "+cevre);
        System.out.println("\ndairenin alani = "+alan);

    }////

}//class
