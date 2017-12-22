package Package029;

/**
 * created by cicek on 22.12.2017 14:14
 */

public abstract class Calisan implements INTER {

    private String name;
    private int TcNo;

    public Calisan(String name , int TcNo){

        this.name=name;
        this.TcNo=TcNo;

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

        return getName() + "  " + getTcNo() + "  ";
    }

}
