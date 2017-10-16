package Package006;

/**
 * Created by cicek on 16.10.2017 22:31
 */
 
import java.util.Random;

public class J3FrekansBul {
    public static void main(String[] args){

        int i,sonuc,f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;;

        Random findMe = new Random();

        for (i=0;i<100;i++){

            sonuc = 1 + findMe.nextInt(6);

            switch (sonuc){
                case 1:f1++;
                break;

                case 2:f2++;
                break;

                case 3:f3++;
                break;

                case 4:f4++;
                break;

                case 5:f5++;
                break;

                case 6:f6++;
                break;
            }
        }
        System.out.print("f1 =" + f1 + "\nf2 =" + f2 + "\nf3 =" + f3 + "\nf4 =" + f4 + "\nf5 =" + f5 + "\nf6 =" + f6);

    }
}
