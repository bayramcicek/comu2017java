package Package022;

/**
 * created by cicek on 07.12.2017 16:13
 */

public class Bird extends Animals {  //Animalın altında

    public Bird(){ //constructor

        super();   //super(üst) classın constructorunu çağırır.Bu satır yazılmasa bile super() varmış gibi çalışır.
        System.out.println("Bird created ....");

    }

    @Override
    public void eat(){

        System.out.println("kuşlar solucan yer ....");

    }

    @Override
    public void sleep(){

        System.out.println("kuşlar uyur ....");

    }

    public void fly(){

        System.out.println("kuşlar uçar ....");

    }

}
