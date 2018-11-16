package Package011a;

/**
 * created by cicek on 16.11.2018 20:46
 */

/* 2018 Vize 3. soru */

public class Sinif2 {
    public static void main(String[] args){

        Sinif1 obj = new Sinif1();

        Sinif1.f1();    // F1
        obj.f2();       // F2
        obj.f3();       // F2 F1 F1
        Sinif1.f4();    // F1 F1

        /*output:

                F1
                F2
                F2
                F1
                F1
                F1
                F1
        */


    }
}
