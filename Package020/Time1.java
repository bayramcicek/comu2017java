package Package020;

/**
 * created by cicek on 27.11.2017 14:57
 */

import java.lang.Exception;

public class Time1 {

    private int hour,min,sec;



    public void setTime(int h,int m,int s) throws Exception {//setTime

        if ( (h>=0 && h<24) && (m>=0 && m<60) && (s>=0 && s<60) ){

            hour = h;
            min = m;
            sec = s;

        }

        else
            throw new IllegalAccessException("\n !!!HATALI Giriş!!! DURDURULDU!\n");// program sonlanır,devam etmez

    }//setTime


    public Time1(int h , int m , int s) throws Exception{


        setTime(h,m,s);

    }
//
//    public Time1(int hour, int min, int sec) throws Exception{
//
//        setTime(this.hour , this.min , this.sec);
//
//    }
    
    public Time1() { }


    public String toUniversalString() {// 24lük saat

        return String.format("%d , %d , %d " , hour , min , sec);

    }


    public String toString() {// 12lik saat

        return String.format("\n%d , %d , %d , %s " , ( (hour==0 || hour==12) ? 12 : hour % 12 ) , min , sec , (hour<12 ? "a.m." : "p.m.") );

    }


}//class
