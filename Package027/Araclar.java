package Package027;

/**
 * created by cicek on 13.12.2017 11:58
 */

public abstract class Araclar { // abstract classlardan nesne oluşturulamaz.

    private String renk;
    private String model;

    public Araclar(String renk,String model){

        this.renk=renk;  // constructor
        this.model=model;
// buradaki constructorı yazdırmak için String toString methodu kullanılabilir.

    }

    public abstract void drive(); // abstract oluduğu için ";" koyulur - soyut method
    public abstract void stop();  // Alt sınıflarda mutlaka @override edilmeli
    public abstract void park();  // Sadece alt sınıflarda böyle bir method olması gerekir diye yönerge veriyoruz.

    public void korna(){  // somut method(kendi methodu). Bu methodu alt classları kullanarak çağırmak zorundayız.

        System.out.println("Kooorrrrnaaaaaaa!!! ");
    }

}
