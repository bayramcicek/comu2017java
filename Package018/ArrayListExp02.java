package Package018;

import java.util.ArrayList;

/**
 * created by cicek on 26.11.2017 19:11
 */

public class ArrayListsExp02 {
    private static ArrayList<String> list;

    public static void main(String[] args){

        /*

                            Rota adı
                                |
            ArrayList<String> items = new ArrayList<String>();
                 |      |
             keyword    |
                   Değişken tipi



         */

        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add("blue");
        items.add("yellow");
        items.add("work");
        items.add("code");

        System.out.println("\n"+items);// ArrayList yazdırma
        printArrayList(items); // ArrayList yazdırma diğer yol

    //--------------------------------------------------------------------------------//

        items.remove("red");
        System.out.print("\n--------------------------------------------------remove(\"red\")");
        System.out.println("\n"+items);

    //--------------------------------------------------------------------------------//

        items.add(2,"aaaaaaaad");//2.indise ekler(3.eleman yap)
        System.out.print("--------------------------------------------------add(2,\"aaaaaaaad\")");
        System.out.println("\n"+items);

    //--------------------------------------------------------------------------------//

        items.set(4,"seeet");//4.indisin yerine yaz
        System.out.print("--------------------------------------------------set(4,\"seeet\")");
        System.out.println("\n"+items);

    //--------------------------------------------------------------------------------//

        items.remove(1);
        System.out.print("--------------------------------------------------remove(1)");
        System.out.println("\n"+items);


    //--------------------------------------------------------------------------------//

        items.clear();
        System.out.print("--------------------------------------------------clear()");
        System.out.println("\n"+items);

    //--------------------------------------------------------------------------------//

        System.out.println("\nisEmpty ==> " + items.isEmpty());

    }//main


    public static void printArrayList(ArrayList<String> mylist){//

        System.out.print("--------------------------------------------------");
        for (int i=0;i<mylist.size();i++){

            System.out.print("\n" + mylist.get(i));

        }

    }//

}
