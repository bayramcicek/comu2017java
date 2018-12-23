package Package032;

/**
 * created by cicek on 23.12.2018 19:03
 */

public class Asker extends DunyaliveUzayli {

    public int silahGucu;

    public Asker(int savunma, int silahGucu){
        super(savunma);
        this.silahGucu = silahGucu;
    }

    @Override
    public int gucHesapla() {
        return getSavunmaSayisi()*silahGucu;
    }
}
