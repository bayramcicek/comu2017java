package Package030;

/**
 * created by cicek on 20.12.2017 12:03
 */

public interface Sekil {

    int siyah = 1; // --> public static final int siyah = 1; ile aynı anlamda
    int mavi = 2;
    int sari = 3;

    void ciz(int renk); // public abstract

    double alanHesapla(); // soyut method

}
