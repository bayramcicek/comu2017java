package Package028;

/**
 * created by cicek on 13.12.2017 13:11
 */

public class KomisyonluPersonel extends AbsPersonel {

    private double komisyonOran;
    private double ekSaat; // Çalıştığı ek saat * Komisyon oranı çarpılacak

    public KomisyonluPersonel(String ad,String soyad,double komisyonOran,double ekSaat){

        super(ad, soyad);
        this.komisyonOran=komisyonOran;
        this.ekSaat=ekSaat;
    }

    public void setKomisyonOran(double komisyonOran) {

        this.komisyonOran = komisyonOran;
    }
    public double getKomisyonOran() {

        return komisyonOran;
    }

    public void setEkSaat(double ekSaat) {

        this.ekSaat = ekSaat;
    }
    public double getEkSaat() {

        return ekSaat;
    }


    @Override
    public double kazanc() {

        return komisyonOran * ekSaat;
    }

    @Override
    public String toString() {

        return "KomisyonluPersonel: " + super.toString() + " " + getKomisyonOran() + " " + getEkSaat() + " Kazanç: " + kazanc();
    }

}
