package Package028;

/**
 * created by cicek on 13.12.2017 12:38
 */

public class SaatliPersonel extends AbsPersonel {

    private double saatBasiYevmiye; // Saat başı ücret
    private double calismaSaati; // Kaç saat çalıştı?

    public SaatliPersonel(String ad,String soyad,double saatBasiYevmiye,double calismaSaati){

        super(ad, soyad);
        this.saatBasiYevmiye=saatBasiYevmiye;
        this.calismaSaati=calismaSaati;

    }


    public void setSaatBasiYevmiye(double saatBasiYevmiye) {

        this.saatBasiYevmiye = saatBasiYevmiye;
    }
    public double getSaatBasiYevmiye() {

        return saatBasiYevmiye;
    }


    public void setCalismaSaati(double calismaSaati) {

        this.calismaSaati = calismaSaati;
    }
    public double getCalismaSaati() {

        return calismaSaati;
    }


    @Override
    public double kazanc() {

        if (calismaSaati <= 40)
            return getCalismaSaati() * getSaatBasiYevmiye();

        else
            return 40 * getSaatBasiYevmiye() + ( getCalismaSaati() - 40 ) * getSaatBasiYevmiye() * 1.5;
    }

    @Override
    public String toString() {

        return "SaatliPersonel:     " + super.toString() + " " + getSaatBasiYevmiye() + "  " + getCalismaSaati() + " Kazanç: " + kazanc();
//        return String.format("%s %s %2f %2f Kazanç: %2f ", "SaatliPersonel:    " , super.toString() , getSaatBasiYevmiye() , getCalismaSaati() , kazanc());
    }

}
