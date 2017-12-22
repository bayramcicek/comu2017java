package Package029;

/**
 * created by cicek on 22.12.2017 14:43
 */

public class Yuzdeli extends Maasli{

    private double oran , satis;
    public Yuzdeli(String name , int TcNo , double maas , double oran , double satis){

        super(name , TcNo , maas);
        this.oran=oran;
        this.satis=satis;

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
    public double hesapla() {

        return getMaas() + (getOran()*getSatis());
    }

    @Override
    public String toString() {

        return super.toString();
    }

}
