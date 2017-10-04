package PackageJavaNesne2;

/**
 * Created by cicek on 4.10.2017 11:01
 */
import java.util.Scanner;
public class J9GetSet {
    public static void main(String[] args){
        /*
        private ders adı kullanıcıdan al
        başka bir sınıfta değer ata ve yazdır.
        */
        String dersadi;

        Scanner xyz = new Scanner(System.in); //kullanıcı girdisi tanımla
        System.out.print("enter a lesson name = ");

        dersadi =  xyz.nextLine();// girdiyi al


        Sinifdrs dr1 = new Sinifdrs();// dr1 nesnesini Sinifdrs class'ında oluştur.
        dr1.setDersadi(dersadi); // setDersadi methodu ile değeri Sinifdrs classındaki değere ata.
        System.out.println("your lesson name is  = \"" + dr1.getDersadi() + "\" bro!");


        System.out.println("\n--SUCCESS--");
    }
}
class Sinifdrs{
    private String courseName; // private string oluştur

    public void setDersadi(String a){
        courseName = a; // dışarıdan "a" ya gelen değeri ata

    }

    public String getDersadi() {
        return courseName; // değeri döndür
    }
}
