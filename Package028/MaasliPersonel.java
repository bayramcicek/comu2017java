package Package028;

/**
 * created by cicek on 13.12.2017 12:38
 */

public class MaasliPersonel extends AbsPersonel {

    private double haftalikMaas;

    public MaasliPersonel(String ad,String soyad,double maas){

        super(ad,soyad);
        this.haftalikMaas=maas;

    }


    public void setHaftalikMaas(double haftalikMaas) {

        this.haftalikMaas = haftalikMaas;
    }
    public double getHaftalikMaas() {

        return haftalikMaas;
    }


    @Override // implements method in AbsPersonel.java (implement--> tamamlamak,yürütmek,yerine getirmek)
    public double kazanc() {

        return getHaftalikMaas();
    }

    @Override
    public String toString() {

        return "\nMaasliPersonel:     " + super.toString() + " Kazanç: " + kazanc();
    }

}
