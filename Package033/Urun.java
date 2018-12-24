package Package033;

/**
 * created by cicek on 24.12.2018 01:46
 */

public class Urun {
    private String urunAdi, urunTuru;
    private Zaman skt;

    public Urun(Zaman skt){
        this.skt = skt;
    }

    public Zaman getSkt() {
        return skt;
    }
}
