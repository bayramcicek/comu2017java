package Package031;

/**
 * created by cicek on 20.12.2017 12:35
 */

public class Faturalar implements IGiderler {

    private String faturaNo;
    private int miktar;
    private double parcaBasiFiyat;

    public Faturalar(String faturaNo,int miktar,double parcaBasiFiyat){ // yapıcı method

        this.faturaNo=faturaNo;
//        setMiktar(miktar);
        this.miktar=miktar;
        this.parcaBasiFiyat=parcaBasiFiyat;

    }


    public void setFaturaNo(String faturaNo) {

        this.faturaNo = faturaNo;
    }
    public String getFaturaNo() {

        return faturaNo;
    }


    public void setMiktar(int miktar) {

        this.miktar = miktar;
    }
    public int getMiktar() {

        return miktar;
    }


    public void setParcaBasiFiyat(double parcaBasiFiyat) {

        this.parcaBasiFiyat = parcaBasiFiyat;
    }
    public double getParcaBasiFiyat() {

        return parcaBasiFiyat;
    }


    public double odemeMiktarHesapla() { // interface methodu implement ettik

        return getParcaBasiFiyat()*getMiktar();
    }

    @Override
    public String toString() { // Java object classından override

        return "Fatura: " + getFaturaNo() + " " + getMiktar() + "*" + getParcaBasiFiyat();
    }

}
