package Package013;

/**
 * Created by cicek on 19.10.2017 16:10
 */


import java.util.Random;

public class J1MathMain {
    public static void main(String[] args){

        J2object d1 = new J2object();

        d1.doAnything();

        d1.doStatic();      //nesne oluşturularak çağırıldı
        J2object.doStatic();  //static ise nesne oluşturmadan çağırılabilir

        doInClass();

        System.out.println("---------------------------------------");


//---------------------------------------------------------------------------------//

        J2object d2 = new J2object();

        double karekok = Math.sqrt(16);//square root
        System.out.println("\n16 nın karekoku = " + karekok);

        //----------------//

        double rasgele2=Math.random(); // [0.1)
        System.out.println("\n[0.1) arası yaz = " + rasgele2);

        //----------------//

        int rasgeleSayi=(int)(Math.random()*10);// [0,10)
        System.out.println("\n[0,10) arası yaz = " + rasgeleSayi);

        //----------------//

        Random randSayi = new Random();

        int rasgele3 = randSayi.nextInt(); // [-2 147 483 648 , +2 147 483 648)
        System.out.println("\n[-2 147 483 648 , +2 147 483 648) arası yaz = " + rasgele3);

        //----------------//

        rasgele3 = randSayi.nextInt(10); // [0,10)
        System.out.println("\n[0,10) arası yaz = " + rasgele3);

        //----------------//

        rasgele3 = 2 + randSayi.nextInt(10); // [2,12)
        System.out.println("\n[2,12) arası yaz = " + rasgele3);

        double us= Math.pow(3,2);
        System.out.println("\n3 üzeri 2 = " + us);

    }//Main sonu

    public static void doInClass(){
        System.out.println("    \ndoInClass Method ");

    }

}
