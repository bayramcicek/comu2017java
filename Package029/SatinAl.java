package Package029;

/**
 * created by cicek on 22.12.2017 15:29
 */

public class SatinAl implements INTER{

    private String urunAdi;
    private double fiyat , miktar;

    public SatinAl(String urunAdi , double fiyat , double miktar){

        this.urunAdi=urunAdi;
        this.fiyat=fiyat;
        this.miktar=miktar;

    }


    public void setUrunAdi(String urunAdi) {

        this.urunAdi = urunAdi;
    }
    public String getUrunAdi() {

        return urunAdi;
    }


    public void setFiyat(double fiyat) {

        this.fiyat = fiyat;
    }
    public double getFiyat() {

        return fiyat;
    }


    public void setMiktar(double miktar) {

        this.miktar = miktar;
    }
    public double getMiktar() {

        return miktar;
    }


    @Override
    public double hesapla() {

        return getFiyat()*getMiktar();
    }

    @Override
    public String toString() {

        return "\n" + urunAdi + " " + fiyat + "  " + miktar;
    }

}
