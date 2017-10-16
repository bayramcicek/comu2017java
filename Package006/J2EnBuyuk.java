package Package006;

/**
 * Created by cicek on 16.10.2017 21:42
 */
import java.util.Scanner;
public class J2EnBuyuk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sonuc;
        int n1, n2, n3;

        System.out.print("1. sayi gir = ");
        n1 = input.nextInt();

        System.out.print("2. sayi gir = ");
        n2 = input.nextInt();

        System.out.print("3. sayi gir = ");
        n3 = input.nextInt();

        sonuc = Maxx(n1, n2, n3);

        System.out.print("En büyük sayi = " + sonuc);


    }
    /////////////////////////////////////////////////////new method/////////////////////
    public static int Maxx(int x,int y,int z){
        int maxValue;
        maxValue = x;

        if (y > maxValue) {
            maxValue = y;
        }

        if (z > maxValue) {
            maxValue = z;
        }

        return maxValue;

    }
}
