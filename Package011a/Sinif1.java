package Package011a;

/**
 * created by cicek on 16.11.2018 20:47
 */

/* 2018 Vize 3. soru */

public class Sinif1 {

    public static void f1(){System.out.printf("F1\n");}
    public void f2(){System.out.printf("F2\n");}
    public void f3(){
//        Sinif1.f2();    // Error: java: non-static method f2() cannot be referenced from a static context
        f2();
        f1();
        Sinif1.f1();
    }

    public static void f4(){
//        Sinif1.f2();  // Error: java: non-static method f2() cannot be referenced from a static context
//        f2();         // Error: java: non-static method f2() cannot be referenced from a static context
        f1();
        Sinif1.f1();
    }

}
