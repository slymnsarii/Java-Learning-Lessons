package day34_inheritance;

public class Isci extends Personel {

    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendine parent edinirler.

    mesela Isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel Class'indaki tum variable ve methodlara ihtiyaci oldugunu gorebiliriz
    Bu durumda o variable ve method'lari olusturmak yerine
    Personel class'ina kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz

    Bir class baska bir class'i parent edindiginde
    1-parent class'daki tum ozelliklere (variable+method) otomatik olarak sahip olur
    2-parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3-parent class'da olmayan bazi ozellikler olusturabilir
    NOT:Parent class'daki tum ozelliklerden hic birini reddedemez ama degistirebilir
     */

    int persNo=1001;

    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim); //Isim Belirtilmedi kendi class'imizda isim variable'i yok, parant'e gideriz
        isci1.isim="Selim";
        System.out.println(isci1.persNo); //1001 kendi class'imizzda varsa onu kullaniriz

        isci1.maas(); //Isciler min 15 Euro maas alir
    }

    public void maas(){
        System.out.println("Isciler min 15 Euro maas alir");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yapilir");
    }
}
