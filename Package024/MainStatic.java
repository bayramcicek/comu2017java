package Package024;

/**
 * created by cicek on 19.12.2017 23:14
 */

public class MainStatic {
    public static void main(String[] args){

        Static obj1 = new Static(1,2,3,4); // 1,2,3,4 sayıları sırasıyla atandı
        Static obj2 = new Static(); // Hepsi 0(default) , (static olmadığında ve setXYZ() ataması olmadığında varsayılan değer "0(NULL)")


//        System.out.printf(" num1: %d \n num2: %d \n num3: %d \n num4: %d" , obj2.num1 , obj2.num2 , obj2.getNum3() , obj2.getNum4());
        System.out.println("num1: " + obj2.num1 + "\nnum2: " + obj2.num2 + "\nnum3: " + obj2.getNum3() + "\nnum4: " + obj2.getNum4());


        Static obj3 = new Static(10,20,30,40);
        System.out.println("\n\nnum1: " + obj3.num1 + "\nnum2: " + obj3.num2 + "\nnum3: " + obj3.getNum3() + "\nnum4: " + obj3.getNum4());


        System.out.println("\n\nnum1: " + obj2.num1 + "\nnum2: " + obj2.num2 + "\nnum3: " + obj2.getNum3() + "\nnum4: " + obj2.getNum4());


        obj2.setNum3(55); // int
        obj2.setNum4(55); // static int
        System.out.println("\n\nnum1: " + obj1.num1 + "\nnum2: " + obj1.num2 + "\nnum3: " + obj1.getNum3() + "\nnum4: " + obj1.getNum4());


        System.out.println("\n\nnum1: " + obj2.num1 + "\nnum2: " + obj2.num2 + "\nnum3: " + obj2.getNum3() + "\nnum4: " + obj2.getNum4());

    }

}
