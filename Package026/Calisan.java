package Package026;

/**
 * created by cicek on 21.12.2017 01:11
 */

// abstract --> nesne üretilmez , subclass üretilebilir
// abstract hakkında --> " http://www.cihataltuntas.com/abstract-nedir-ne-zaman-kullanilir/ "  

public abstract class Calisan {

    private String name;
    private int TcNo;

    public Calisan(String n,int t){

        name=n;
        TcNo=t;

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setTcNo(int tcNo) {
        TcNo = tcNo;
    }
    public int getTcNo() {
        return TcNo;
    }

    @Override
    public String toString() {
        return String.format(" %s %d " , getName() , getTcNo());
    }

    public abstract double Kazanc(); // burada sadece method tanımlaması var , diğer alt(sub) sınıflarda @override edilecek

}//class
