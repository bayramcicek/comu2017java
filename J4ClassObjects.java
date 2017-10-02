package PackageJavaNesne;

/**
 * Created by cicek on 2.10.2017 18:24
 */
public class J4ClassObjects {
    public static void main(String[] args){ // main class

        Sinif1 s1 = new Sinif1(); /* burada Display1 () methodu public yani genel olduğu için
                                    main içinde yeni bir nesne oluşturup , oluşturduğumuz nesne
                                    ile Display1 () methodunu çağırmak zorundayız */
        s1.Display1();

        System.out.println(" ");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        Sinif2.Display2();      /* Display2 () methodu static yani sabit/değişmez olduğu için
                                direkt ait olduğu sınıfı tanımlamak yeterlidir. */


        Sinif2 s2 = new Sinif2(); /* Display2 () static olduğu için normal şekilde nesne
                                    oluşturularak ta tanımlanabilir. */
        s2.Display2();

        System.out.println("\n--SUCCESS--");
    }

}
/////////////////////////new class/////////////////////
class Sinif1 {
    public void Display1(){
        System.out.println(" Now you seeing Public Display1 () method ");
    }

}
/////////////////////////new class//////////////////////
class Sinif2 {
    static void Display2(){
        System.out.println(" Now you seeing Public Display2 () method ");
    }

}
