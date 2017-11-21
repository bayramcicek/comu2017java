package Package008;

/**
 * Created by cicek on 5.10.2017 11:11
 */


public class J2get {

    public J2get(){
        //boş constructor
    }

    private int kilo,boy;
    private String cins;

    public J2get(int a, int b, String c){

        kilo=a;
        boy=b;
        cins=c;

        System.out.println("kilo = "+ kilo + "\nboy = " + boy + "\ncins = "+ cins);
    }

}
