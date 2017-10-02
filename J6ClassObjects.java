package PackageJavaNesne;

/**
 * Created by cicek on 2.10.2017 22:17
 */
public class J6ClassObjects {
    public static void main(String[] args){

        Kedi k1 = new Kedi();
        System.out.println("Boy = " + k1.boy);
        System.out.println("Kilo = " + Kedi.kilo);



        System.out.println("\n--SUCCESS--");
    }

}

class Kedi{
    int boy = 5; //instance veriable (durum değişkeni)
    static int kilo = 25;
    private String cins = "VAN"; //private sadece bulunduğu sınıfta erişilebilir haldedir
}
