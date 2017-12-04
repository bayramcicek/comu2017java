package Package019;

/**
 * created by cicek on 30.11.2017 15:51
 */

public class a2Tarih {

    private int gun,ay,yil;

    public a2Tarih(int Gun, int Ay, int Yil){

        gun=Gun;
        ay=Ay;
        yil=Yil;

        System.out.printf("%s\n",this);// aşağıdaki toString() e gider ve return değerini yazdırır.

    }



    public String toString() {

        return String.format("%d,%d,%d",gun,ay,yil);
    }
    
}
