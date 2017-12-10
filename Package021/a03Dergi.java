package Package021;

/**
 * created by cicek on 10.12.2017 15:01
 */

public class a03Dergi {

    private int dergiNo;

    public a03Dergi(int dergiNo){

        this.dergiNo=dergiNo;

    }

    @Override
    public String toString() {
        return String.format("\nDergi No: " + dergiNo);
    }

}
