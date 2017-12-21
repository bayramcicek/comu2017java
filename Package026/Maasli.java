package Package026;

/**
 * created by cicek on 21.12.2017 01:36
 */

public class Maasli extends Calisan{

    private double maas;

    public Maasli(String n , int t , double m){

        super(n, t);
        maas=m;

    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    public double getMaas() {
        return maas;
    }


    @Override
    public String toString() {
        return String.format("Maasli calısan: %s %s %3f" , super.toString() , "Kazanç: " , Kazanc());
    }

    @Override
    public double Kazanc() {
        return maas;
    }

}
