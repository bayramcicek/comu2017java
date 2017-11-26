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

        System.out.print("-------------------------");
        for (int i=0;i<items.size();i++){ // ArrayList yazdırma diğer yol

            System.out.println("\n" + items.get(i));

        }

        items.remove("red");
        System.out.print("-------------------------");
        System.out.println("\n"+items);


        items.add(2,"looooooooong");//2.indise ekler(3.eleman yap)
        System.out.print("-------------------------");
        System.out.println("\n"+items);

    }//main
}
