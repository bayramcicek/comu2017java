package Package031;

/**
 * created by cicek on 20.12.2017 12:48
 */

public class MaasliCalisan extends Calisanlar{

    private double haftalikMaas;

    public MaasliCalisan(String ad,String sskNo,double haftalikMaas){

        super(ad,sskNo);
        this.haftalikMaas=haftalikMaas;

    }


    public void setHaftalikMaas(double haftalikMaas) {

        this.haftalikMaas = haftalikMaas;
    }
    public double getHaftalikMaas() {

        return haftalikMaas;
    }


    public double odemeMiktarHesapla(){ // IGiderler methodu implement

        return getHaftalikMaas();
    }

    @Override
    public String toString() {

        return "Maasli " + super.toString();
    }

}
