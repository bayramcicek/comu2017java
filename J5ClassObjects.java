package PackageJavaNesne;

/**
 * Created by cicek on 2.10.2017 19:07
 */
import java.util.Scanner;
public class J5ClassObjects {
    public static void main(String [] args){
        //klavyeden ders adı gir
        //ders adını ShowMe() metoduna çıktı olarak göster

        String lesson1;

        Scanner sc1 = new Scanner(System.in); /* ekran girdisi tanımlandı*/
        System.out.print(" Enter a Lesson Name =  ");
        lesson1 = sc1.nextLine(); /* ekran girdisi alındı*/

        //ClassShow.ShowMe(lesson1);
        ClassShow asd = new ClassShow();
        asd.ShowMe(lesson1);



        System.out.println("\n--SUCCESS--");
    }
}
class ClassShow{
    public void ShowMe(String name1)/* static void ShowMe(String name1) */{
        System.out.println("\nYour lesson name is = \"" + name1 + "\"");

    }
}
