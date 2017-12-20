package Package024;

/**
 * created by cicek on 19.12.2017 23:00
 */

// static -> hafızada aldığın en son değerden devam et

public class Static {

    public int num1; // "int" ise method da "int" olmalı
    public static int num2; // "static int" ise method da "static int" olmalı

    private int num3; // "int" ise method da "int" olmalı
    private static int num4; // "static int" ise method da "static int" olmalı

    public Static(){
        // boş constructor
    }

    public Static(int num1, int num2, int num3, int num4){

        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;

    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public int getNum3(){ // num3 "int" olduğu için kullanıldığı method da "int" olmalı
        return num3;
    }


    public static void setNum4(int num4) { // public static void setNum4(int n1)
        Static.num4 = num4;                    // num4 = n1;
    }
    public static int getNum4() { // "static" yazılmasa bile çalışır fakat "static" yazılması daha sağlıklı olur
        return num4;
    }

}
