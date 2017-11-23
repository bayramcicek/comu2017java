package Package014;

/**
 * Created by cicek on 19.10.2017 16:35
 */


public class MethodOverLoad { // aynı fonksiyonu 1 den fazla oluşturmak.
    public static void main(String[] args){

        System.out.println("8 karesi = " + kareAl(8));
        System.out.println("8.1 karesi = " + kareAl(8.1));

    }

    public static int kareAl(int sayiInt){

        System.out.print("\nkareAl(8) int parametre ile -----> ");
        return sayiInt*sayiInt;
    }

    public static double kareAl(double sayiD){

        System.out.print("\nkareAl(8.1) double parametre ile -----> ");
        return Math.pow(sayiD,2);
    }
}
