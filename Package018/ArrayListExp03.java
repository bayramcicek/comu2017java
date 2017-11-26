package Package018;

import java.util.ArrayList;

/**
 * created by cicek on 26.11.2017 23:45
 */

public class ArrayListExp03 {
    public static void main(String[] args){

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(3);
        myList.add(7);
        myList.add(1);
        myList.add(2);
        myList.add(5);
        myList.add(5);
        myList.add(8);
        myList.add(5);
        myList.add(6);
        myList.add(3);
        myList.add(4);
        myList.add(7);
        myList.add(3);
        myList.add(1);
        myList.add(7); // 15 eleman
        
        System.out.println("\nmyList ilk hali;\n" + myList);

        mtd(myList);

        System.out.println("\nListenin son hali;\n" + myList);

    }//main


    public static void mtd(ArrayList<Integer> list){//mtd

        if ((list.size()) % 2 != 0){//

            list.remove(list.size()-1);
            System.out.println("\n\nçift elemanlı yap;\n" + list);

        }//

        System.out.println("\n\nlist Size = " + list.size());
        System.out.println(list);

        for (int i=0;i<list.size();i+=2){///for

            if (list.get(i) > list.get((i+1))){// ise ikisini de sil

                list.remove(i);
                list.remove(i);
                i-=2;

                System.out.println("\n\nlist Size = " + list.size());
                System.out.println(list);
            }

        }///for

    }//mtd

}//class
