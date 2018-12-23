package Package032;

/**
 * created by cicek on 23.12.2018 19:00
 */

public abstract class DunyaliveUzayli {

    private int savunmaSayisi;

    public DunyaliveUzayli(int savunmaSayisi){
        this.savunmaSayisi = savunmaSayisi;
    }

    public int getSavunmaSayisi() {
        return savunmaSayisi;
    }

    public abstract int gucHesapla();
}
