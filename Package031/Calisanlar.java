package Package031;

/**
 * created by cicek on 20.12.2017 12:44
 */

public abstract class Calisanlar implements IGiderler{ // IGiderler'deki her şeyi implement etmeye gerek kalmasın diye abstract yaptık

    private String ad;
    private String sskNo;

    public Calisanlar(String ad,String sskNo){

        this.ad=ad;
        this.sskNo=sskNo;

    }


    public void setAd(String ad) {

        this.ad = ad;
    }
    public String getAd() {

        return ad;
    }


    public void setSskNo(String sskNo) {

        this.sskNo = sskNo;
    }
    public String getSskNo() {

        return sskNo;
    }


    @Override
    public String toString() {

        return "Calisan: " + getAd() + " " + getSskNo();
    }

}
