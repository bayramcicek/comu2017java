package Package021;

/**
 * created by cicek on 10.12.2017 15:01
 */

public class a02Kitap {

    private int id;
    private String yazar;
    private a04Kutuphane yili;
    private a03Dergi derginumara;


    public a02Kitap(int id, String yazar, a03Dergi derginumara, a04Kutuphane yili){

        this.id=id;
        this.yazar=yazar;
        this.derginumara=derginumara;
        this.yili=yili;

    }

    @Override
    public String toString() {
        return String.format("\nId: " + id + "\nYazar: " + yazar + derginumara + yili);
    }

}
