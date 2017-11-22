package Package001;

/**
 * Created by cicek on 19.10.2017 15:57
 */


public class J5Scope {

    public static int x=1;//kendi classında geçerli  //genel

    public  static void kullanYerelDegisken(){

        int x=25;//her method çağırıldığında başlatılır
        System.out.println("\nkullan yerel girişte x = \t" + x);

        x++;

        System.out.println("\nkullan yerel cıkışta x = \t" + x);

    }

    public  static void kullanField(){

        System.out.println("\nkullanField girişte x = \t" + x);

        x=x*10;

        System.out.println("\nkullanField cıkışta x = \t" + x);
    }



    public static void main(String[] args){

        //int x=7;
        System.out.println("\nmain girişte = -----------------" + x);

        kullanYerelDegisken();
        kullanField();
        System.out.println("\nmain ortada  = ------------------" + x);
        kullanYerelDegisken();
        kullanField();

        System.out.println("\nmain çıkışta  = ------------------" + x);
    }

}//class sonu
