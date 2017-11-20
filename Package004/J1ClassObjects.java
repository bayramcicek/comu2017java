package Package004;

/**
 * Created by cicek on 2.10.2017 18:24
 */


public class J1ClassObjects {
    public static void main(String[] args){ // main class

        J2Sinif s1 = new J2Sinif(); /* burada Display1 () methodu public yani genel olduğu için */
        s1.Display1();            /* main içinde yeni bir nesne oluşturup , oluşturduğumuz nesne */
                                  /* ile Display1 () methodunu çağırmak zorundayız */


        J3Sinif.Display2();      /* Display2 () methodu static yani sabit/değişmez olduğu için direkt ait olduğu sınıfı tanımlamak yeterlidir. */


        J3Sinif s2 = new J3Sinif(); /* Display2 () static olduğu için normal şekilde nesne oluşturularak ta tanımlanabilir. */
        s2.Display2();

        System.out.println("\n--SUCCESS--");
    }

}
