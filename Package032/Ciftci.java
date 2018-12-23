package Package032;

/**
 * created by cicek on 23.12.2018 19:10
 */

public class Ciftci extends DunyaliveUzayli {

    public int urunSayisi;

    public Ciftci(int savunma, int urunSayisi){
        super(savunma);
        this.urunSayisi = urunSayisi;
    }

    @Override
    public int gucHesapla() {
        return urunSayisi;
    }
}
