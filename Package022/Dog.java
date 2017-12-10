package Package022;

/**
 * created by cicek on 07.12.2017 16:23
 */

public class Dog extends Animals {

    public Dog(){

        super();   //super(üst) classın constructorunu çağırır.Bu satır yazılmasa bile super() varmış gibi çalışır.
        System.out.println("Dog created ....");

    }

    @Override
    public void eat(){

        System.out.println("köpekler kemik yer....");
    }

    // sleep() metodunu yazmadık (kopek.sleep() gelirse üst sınıfındaki sleep methoduna gider.)

    public void havhav(){

        System.out.println("Köpek hav hav :)");

    }

}
