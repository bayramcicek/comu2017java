package Package006;

/**
 * created by cicek on 21.11.2017 22:29
 */


class J2Kedi1 {
    private int kilo1;

   /* public Kedi(int kilo) {
        this.kilo = kilo;
    }*/

    public void setKilo1(int a){    //set = vermek -> değer vermek

        kilo1=a;
    }

    private int getKilo1() {
                                    // get = almak -> geri dönüş değeri almak yani return;
        return kilo1;               /* private int sadece kendi bulunduğu classta görülebildiği için aynı
                                       classtaki Playy() methodu ile çağırıp yazdırmalıyız*/
    }

    public void Playy(){

        System.out.println("Kilo = " + getKilo1());
    }


}
