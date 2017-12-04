package Package019;

/**
 * created by cicek on 30.11.2017 15:58
 */

public class a3Isci {

    private String adi;
    private String soyad;

    private a2Tarih dogumTarihi;
    private a2Tarih iseGirdigiTarih;

    public a3Isci(String isim, String soyisim, a2Tarih a, a2Tarih b){

        adi = isim;
        soyad = soyisim;
        dogumTarihi=a;
        iseGirdigiTarih=b;

    }

    public String toString(){

        return String.format("\n%s\n" + "%s\n" + "doğum = %s\n"  + "işe giriş tarihi = %s\n" ,adi,soyad,dogumTarihi,iseGirdigiTarih);

    }


}
