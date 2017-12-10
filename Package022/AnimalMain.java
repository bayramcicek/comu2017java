package Package022;

/**
 * created by cicek on 07.12.2017 16:04
 */

public class AnimalMain {
    public static void main(String[] args){

        System.out.println("");

        Animals hayvan = new Animals();// defining the object
        hayvan.eat();
        hayvan.sleep();
        System.out.println("");

        Bird kus = new Bird();///////// defining the object
        System.out.println("");

        Dog kopek = new Dog();///////// defining the object
        System.out.println("");

        /////////////////////////////////////////////////////////////////////////////

        kus.eat();
        kus.sleep();
        kus.fly();// fly() (normal bi method)
        System.out.println("");

        kopek.eat();
        kopek.sleep();// sleep() methodu kendi(Dog) sınıfında yoksa bi üst classına(superclass)(supClass) gider.
        kopek.havhav();
        System.out.println("");
    }
}
