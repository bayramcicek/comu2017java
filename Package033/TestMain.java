package Package033;

import java.util.Scanner;

/**
 * created by cicek on 24.12.2018 01:48
 */

public class TestMain {
    public static void main(String[] args) throws Exception{

        Urun[] urun = new Urun[10];

        for (int i=0; i<urun.length;i++){

            Scanner yilScan = new Scanner(System.in);
            Scanner ayScan = new Scanner(System.in);

            // yıl
            System.out.printf("\nyıl giriniz: ");
            int yilTut = yilScan.nextInt();
            if ((yilTut>=1 && yilTut<=10) ){

            }else {
                throw new Exception("Hatalı giriş");
            }

            // ay
            System.out.printf("ay giriniz: ");
            int ayTut = ayScan.nextInt();
            if ( (ayTut>=1 && ayTut<=12) ){

            }else {
                throw new Exception("Hatalı giriş");
            }

            Zaman zmn = new Zaman(yilTut, ayTut);

            urun[i] = new Urun(zmn);
        }

        sirala(urun);
        for (Urun i : urun){
            System.out.printf("dizi: %d:%d ", i.getSkt().getYil(), i.getSkt().getAy());
        }
    }

    public static void sirala(Urun[] myArr){

            for (int i=1; i<myArr.length; i++){
                for (int a=0; a<myArr.length-i;a++){
                    if (myArr[a].getSkt().getYil()>myArr[a+1].getSkt().getYil()){
                        Urun temp = myArr[a];
                        myArr[a] = myArr[a+1];
                        myArr[a+1] = temp;

                    }else if (myArr[a].getSkt().getAy()>myArr[a+1].getSkt().getAy()){
                        Urun temp = myArr[a];
                        myArr[a] = myArr[a+1];
                        myArr[a+1] = temp;
                    }
                }
        }
    }
}
