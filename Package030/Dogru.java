package Package030;

/**
 * created by cicek on 20.12.2017 12:14
 */

public abstract class Dogru implements Sekil{ // Sekil , classadi1 , classadi2 gibi çoklu kalıtım yapılabilir

    @Override
    public void ciz(int renk) {

        System.out.println("Dogru ciz \n renk kodu: " + renk);
    }

//    @Override                     // bunu kullanmamak için bu classı abstract yaptık
//    public double alanHesapla() { // doğrunun alanı olmadığı için bunu kullanmadık
//        return 0;
//    }

}
