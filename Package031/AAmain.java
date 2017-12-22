package Package031;

/**
 * created by cicek on 20.12.2017 12:55
 */

public class AAmain {

    public static int i = 1;

    public static void main(String[] args){

        IGiderler[]  gider = new IGiderler[4];
        gider[0] = new Faturalar("a45",4,2.25);
        gider[1] = new Faturalar("b23",3,5.50);
        gider[2] = new MaasliCalisan("Chan" , "g-34" , 100);
        gider[3] = new MaasliCalisan("Ayla" , "g-35" , 200);

        System.out.println("\nGiderleri göster: \n");


        for (IGiderler g: gider){

            if (i==1){ // i yukarıda static olarak tanımlandı. // Bu if'in tamamını yorum satırına alarak değişikliklere bakabilirsiniz.

                if (g instanceof MaasliCalisan){ // g MaasliCalisan sınıfından bir nesne ise buraya girecek

                    System.out.println(""); // burada i nin değerini 1 arttırarak , buraya sadece 1 defa girmesini sağladık
                    i+=1;                   // böylece MaasliCalisan dan önce sadece 1 defa 1 satırlık boşluk bırakmış olduk
                }                           // i static olduğu için değeri artık 2 oldu ve i==1 bloğuna bir daha girmeyecek

            }

            System.out.println(g.toString() + "--->" + g.odemeMiktarHesapla());

        }// for

    }// main

}//class
