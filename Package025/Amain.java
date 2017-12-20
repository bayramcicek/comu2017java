package Package025;

/**
 * created by cicek on 20.12.2017 20:45
 */

// Kalıtım (inheritance) - Çok biçimlilik (Polymorphism)

//                  Calisan
//                  |     |
//      Muhendis<---       --->Patron
//
//

public class Amain {
    public static void main(String[] args){//main

        Calisan[] kisiler = new Calisan[3];

        int i;
        for (i=0;i<3;i++){

            kisiler[i] = CalisanSec();

        }

        for (i=0;i<kisiler.length;i++){

            BenKimim(kisiler[i]); // Calisan tipinde (kisiler[i]) dizisi

        }

    }//main


    public static void BenKimim(Calisan nesne){ // main dışı olduğu için "static"

//        nesne.method();

/* Eğer nesne , Muhendis veya Patron sınıflarından birine ait ise bunlar "Calisan" alt sınıfı olduğu için
   ilk sıradaki --> if (nesne instanceof Calisan) <-- bloğuna girip , yazdırılır(Çünkü "Calisan" üst sınıf).
   Daha sonra alttaki if lerden hangisine uyuyorsa kendisini kendi sınıfında yazdırır.Böylece Muhendis vaya Patron 2 defa yazdırılır. */

        if (nesne instanceof Calisan)
            nesne.method();

        if (nesne instanceof Muhendis)
            nesne.method();

        if  (nesne instanceof Patron)
            nesne.method();

//        if (nesne instanceof Calisan)      /* Burada alt sınıflardaki method ların 2 kere yazılmasını engellemiş olduk. */
//            nesne.method();
//
//        else if (nesne instanceof Muhendis)
//            nesne.method();
//
//        else  /*(nesne instanceof Patron)*/
//            nesne.method();

    } // (nesne instanceof ClassAbc) --> nesne ClassAbc sınıfında mı? ya da alt sınıflarından birinde mi?

    public static Calisan CalisanSec(){ // main dışı olduğu için "static"

        int sec = ( (int)(Math.random() * 3) );

/* Aşağıdaki ifadelere, "Calisan" tipindeki "insan" değişkeninin açısından bakarsak,
   bu değişkenin bir çok nesneye bağlanabildiğini görürüz, bu özellik "polimorfizm" 'dir
   ki bu özelliğin temelinde kalıtım (inheritance) yatar.

  yazı kaynağı: http://www.bilgisayarmuhendisleri.com/sayfa.aspx?s=38     */

        Calisan insan = null;

        if (sec ==0)
            insan = new Calisan();

        if (sec == 1)
            insan = new Muhendis();

        if (sec == 2)
            insan = new Patron();

        return insan;

    }

}//class
