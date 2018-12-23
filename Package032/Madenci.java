package Package032;

/**
 * created by cicek on 23.12.2018 20:12
 */

public class Madenci extends DunyaliveUzayli{

    public int madenSayisi;

    public Madenci(int savunma, int madenSayisi){
        super(savunma);
        this.madenSayisi = madenSayisi;
    }

    @Override
    public int gucHesapla() {
        return madenSayisi;
    }
}
