package Package010;

/**
 * Created by cicek on 16.10.2017 17:26
 */


public class J2Kediler {

    private String ad;
    private double kh,th;

    public J2Kediler(){
        // boş constructor
    }

    public J2Kediler(String m, double k, double t){

        ad=m;
        kh=k;
        th=t;
    }


    public void setAll(String a,double b,double c){

        ad=a;
        kh=b;
        th=c;
    }


    public String getAd() {

        return ad;
    }

    public double getKh() {

        return kh;
    }

    public double getTh() {

        return th;
    }


    public double ortalama(double hiz1,double hiz2){

        return (hiz1 + hiz2)/2;
    }

}
