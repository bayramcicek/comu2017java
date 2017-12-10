package Package023;

/**
 * created by cicek on 07.12.2017 16:50
 */

public class TabanMaasPersonel extends Personels {

    private double tabanMaas;

    public TabanMaasPersonel(String ad,String soyad,String sskNo,double satis,double komisyon,double tabanMaas){

        super(ad,soyad,sskNo,satis,komisyon);   // 1. constructor(SupClass constructora gitti)
        this.tabanMaas=tabanMaas;

    }


    @Override
    public double maasHesapla(){

        return tabanMaas + super.maasHesapla(); // 2. constructor
//        return  tabanMaas + (komisyon*satis);

    }


    @Override
    public String toString() {

//        return "personel: " + ad + " " + soyad + " " + satis + " " + komisyon + " " + tabanMaas;
        return super.toString() + " , Taban Maaş: " + tabanMaas;
    }

/////////////////////////////////////////////////////////////////////////////////

    public void setTabanMaas(double tabanMaas) {

        this.tabanMaas = tabanMaas;

    }

    public double getTabanMaas() {

        return tabanMaas;

    }

}//class
