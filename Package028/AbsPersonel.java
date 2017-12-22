package Package028;

/**
 * created by cicek on 13.12.2017 12:37
 */

public abstract class AbsPersonel {

    private String ad;
    private String soyad;

    public AbsPersonel(String ad, String soyad){

        this.ad=ad;
        this.soyad=soyad;

    }


    public void setAd(String ad) {

        this.ad = ad;
    }
    public String getAd() {

        return ad;
    }


    public void setSoyad(String soyad) {

        this.soyad = soyad;
    }
    public String getSoyad() {

        return soyad;
    }


    @Override  // override object (Object classı tüm classların Super classıdır.)
    public String toString() {

        // return ad + "\t" + soyad;
        return getAd() + "\t" + getSoyad();
    }

    public abstract double kazanc(); // abstract method tanımlama -alt sınıflarda içi doldurulacak-

}//class
