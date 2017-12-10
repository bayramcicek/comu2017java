package Package023;

/**
 * created by cicek on 07.12.2017 16:47
 */

public class Personels {

    protected String ad;     // protected --> sadece kendisi ve alt classı(ları) erişebilir.
    protected String soyad;
    protected String sskNo;
    protected double satis; // Satılan ürün sayısı
    protected double komisyon; // Ürün başı komisyon

    public Personels(String ad, String soyad, String sskNo, double satis, double komisyon){

        this.ad=ad;
        this.soyad=soyad;
        this.sskNo=sskNo;
        setSatis(satis); //kontrol - Hata olmaması için
        setKomisyon(komisyon); //kontrol - Hata olmaması için

    }


    public double maasHesapla(){

        return satis*komisyon;

    }


    public String toString() {

//        return String.format("\nPersonel: " + ad + " " + soyad + " , Ne kadar Sattı?: " + satis + " , Satış başı komisyonu: " + komisyon);
        return "\nPersonel: " + ad + " " + soyad + " , Ne kadar Sattı?: " + satis + " , Satış başı komisyonu: " + komisyon;

    }

/////////////////////////////////////////////////////////////////////////////////

    public void setAd(String ad) {

        this.ad = ad;

    }

    public String getAd() {

        return ad;

    }

/////////////////////////////////////////////////////////////////////////////////

    public void setSoyad(String soyad) {

        this.soyad = soyad;

    }

    public String getSoyad() {

        return soyad;

    }

/////////////////////////////////////////////////////////////////////////////////

    public void setSskNo(String sskNo) {

        this.sskNo = sskNo;

    }

    public String getSskNo() {

        return sskNo;

    }

/////////////////////////////////////////////////////////////////////////////////

    public void setKomisyon(double komisyon) {

        if (komisyon> 0.0 && komisyon<1.0)
            this.komisyon = komisyon;
        else
            System.out.println("\nBi dahakine 0-1 arası gir: ");

    }

    public double getKomisyon() {

        return komisyon;

    }

/////////////////////////////////////////////////////////////////////////////////

    public void setSatis(double satis) {

        if (satis>0.0)
            this.satis = satis;
        else
            System.out.println("\nSatış negatif olamaz!");

    }

    public double getSatis() {

        return satis;

    }

/////////////////////////////////////////////////////////////////////////////////

}//class
