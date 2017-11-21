package Package009;

/**
 * Created by cicek on 6.10.2017 11:01
 */


public class J2Araba {          // class ismi J2Araba

    private String plaka;
    public String renk;
    public int motorV;

    public J2Araba(){           // method'un ismi de J2Araba

        //boş constructor
    }


    public J2Araba(String s1, String s2, int a){    // bu method'un ismi de J2Araba Çünkü
                                                    // constructorların genel özelliği böyledir.
        plaka=s1;                                   // Javada bu özelliğe polymorphism(çok biçimlilik) denir.
        renk=s2;                                    // ister constructoru boş(parametresiz) çağır ister parametre vererek kullan.
        motorV=a;
    }

    int hızlan(int hiz,int ivme){

        return (hiz*ivme)/2; // bu formül kafadan sallanmıştır.
    }

    public void setPlaka(String xx) {

        plaka = xx;
    }

    public String getPlaka() {

        return plaka;
    }


}
