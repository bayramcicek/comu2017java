package Package026;

/**
 * created by cicek on 21.12.2017 01:43
 */

public class Yuzdeli extends Maasli{

    private double oran , satis; // oran--> satıştan alacağı oran

    public Yuzdeli(String n , int t , double m , double o , double s){

        super(n, t, m);
        oran=o;
        satis=s;

    }


    public void setOran(double oran) {
        this.oran = oran;
    }
    public double getOran() {
        return oran;
    }


    public void setSatis(double satis) {
        this.satis = satis;
    }
    public double getSatis() {
        return satis;
    }


    @Override
    public double Kazanc() {
        return getMaas() + (getOran()*getSatis());
    }

    @Override
    public String toString() {
        return String.format("Yüzdeli calisan: %s " , super.toString());
    }

}
