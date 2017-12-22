package Package030;

/**
 * created by cicek on 20.12.2017 12:11
 */

public class Dortgen implements Sekil{

    private double en;
    private double boy;

    public Dortgen(double en,double boy){

        this.en=en;
        this.boy=boy;
    }

    @Override
    public void ciz(int renk) {

        System.out.println("\nDörtgen çiz --> Renk kodu: " + renk);
    }

    @Override
    public double alanHesapla() {

        return en*boy;
    }

}
