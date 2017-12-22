package Package029;

/**
 * created by cicek on 22.12.2017 14:23
 */

public class Maasli extends Calisan{

    private double maas;

    public Maasli(String name , int TcNo , double maas){

        super(name , TcNo);
        this.maas=maas;

    }

    public void setMaas(double maas) {

        this.maas = maas;
    }
    public double getMaas() {

        return maas;
    }


    @Override
    public double hesapla() {

        return getMaas();
    }

    @Override
    public String toString() {

        return "\n" + super.toString() + "Kazanç: " + hesapla();
    }

}
