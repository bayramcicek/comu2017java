package Package027;

/**
 * created by cicek on 13.12.2017 12:11
 */

public class Cars extends Araclar {

    private int kapi;

    public Cars(String renk, String model, int kapi){

        super(renk, model); // constructor
        this.kapi=kapi;
// buradaki constructorı yazdırmak için String toString methodu kullanılabilir.

    }

    @Override // implement - abstractta verilen metodu burada dolduruyoruz.
    public void drive(){

        System.out.println("\nCars gidiyor");
    }

    @Override // implement - abstractta verilen metodu burada dolduruyoruz.
    public void stop(){

        System.out.println("\nCars duruyor");
    }

    @Override // implement - abstractta verilen metodu burada dolduruyoruz.
    public void park(){

        System.out.println("\nCars otoparkta");
    }

    @Override // override
    public void korna() {

        System.out.println("\nCars korna çalıyor");
    }

}
