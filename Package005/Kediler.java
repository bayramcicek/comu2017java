package Package005;

/**
 * Created by cicek on 16.10.2017 17:26
 */
public class Kediler {
    private String ad;
    private double kh,th;

    public Kediler(String m,double k,double t){
        ad=m;
        kh=k;
        th=t;
    }

    public Kediler(){
    }

    double ortalama(double hiz1a,double hiz2b){
        return (hiz1a + hiz2b)/2;
    }
//////////set//////////////////////////
    public void setAll(String a,double b,double c){
        ad=a;
        kh=b;
        th=c;
    }

/////////get///////////////////////////
    public String getAd() {
        return ad;
    }

    public double getKh() {
        return kh;
    }

    public double getTh() {
        return th;
    }
}
