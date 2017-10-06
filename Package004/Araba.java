package Package004;

/**
 * Created by cicek on 6.10.2017 11:01
 */
public class Araba {          // class ismi Araba
    private String plaka;
    public String renk;
    public int motorV;

    public Araba(){           // method'un ismi de Araba
        //boş constructor
    }

    public Araba(String s1, String s2, int a){   // bu method'un ismi de Araba neden? Çünkü
                                                // constructorların genel özelliği böyledir.
        plaka=s1;                               // Javada bu özelliğe polymorphism(çok biçimlilik) denir.
        renk=s2;                                // ister constructoru boş(parametresiz) çağır ister parametre vererek kullan.
        motorV=a;
    }

    int hızlan(int hiz,int ivme){
        return (hiz*ivme)/2; // bu formül kafadan sallanmıştır.
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String xx) {
        plaka = xx;
    }
}
