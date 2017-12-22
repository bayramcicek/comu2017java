package Package029;

/**
 * created by cicek on 22.12.2017 12:46
 */

 /*
    interface --> tüm sınıfların kullanabileceği bir method kütüphanesi
    abstracttaki gibi nesne oluşturulamaz
    Bir interface sınıfında sadece methodlar açıklanır/tanımlanır.(içi boş bırakılır)
    Alt sınıflarda içi doldurulur(implement)

    Bir interface aslında dış dünyaya verilen bir söz metnidir. Bir interface sınıf bünyesinde metotlar tanımlar.
    Interface sınıfı kullanan diğer sınıflar ise bu metodları kullanarak, gerekli işlemleri yaparlar

    Kısaca interface sınıflar, servis kullanıcılarından, kompleks yapıdaki alt sınıfları saklamak ve
    servis sunucusu ve sağlayıcı arasındaki bağımlılığı azaltmak için kullanılır.

    kaynak site: " http://selimkaratas.com.tr/wp/javada-interface.html "
 */

public interface INTER {

    public double hesapla();

}
