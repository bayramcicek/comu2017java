package Package032;

/**
 * created by cicek on 23.12.2018 20:09
 */

public class Cyborg extends DunyaliveUzayli {

    public int lazerGucu;

    public Cyborg(int savunma, int lazerGucu){
        super(savunma);
        this.lazerGucu = lazerGucu;
    }

    @Override
    public int gucHesapla() {
        return getSavunmaSayisi()*lazerGucu;
    }
}
