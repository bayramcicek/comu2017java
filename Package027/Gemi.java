package Package027;

/**
 * created by cicek on 13.12.2017 12:11
 */

public class Gemi extends Araclar{

    public Gemi(String renk,String model){

        super(renk, model); // constructor
// buradaki constructorı yazdırmak için String toString methodu kullanılabilir.

    }

    @Override
    public void drive(){

        System.out.println("\n\nGemi gidiyor");
    }

    @Override
    public void stop(){

        System.out.println("\nGemi duruyor");
    }

    @Override
    public void park(){

        System.out.println("\nGemi limanda");
    }

}
