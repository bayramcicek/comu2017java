package Package030;

/**
 * created by cicek on 20.12.2017 12:04
 */

public class Cember implements Sekil {

    public double yaricap;

    public Cember(int yaricap){

        this.yaricap=yaricap;
    }

    @Override
    public void ciz(int renk){ // burada implement edildi

        System.out.println("\nÇember çiz --> Renk kodu: " + renk);
    }

    @Override
    public double alanHesapla(){

        return Math.PI*yaricap*yaricap;
    }

}
