package day42_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I01_Interfaces {

    int SAYI=30;
    String ISIM="Yildiz Koleji";

    /*
    Interface bir class degildir

    Abstract class'lar Java'da abstraction(soyutlastirma/kural koyma)
    islevini yapiyordu
    Ancak abstract bir class'da abstract olmayan method'lar da olabilir
    Bu da full abstraction yapmaya izin vermez

    Eger Java'da icinde hic concrete method olmasin dedigimiz bir class olusturmak istiyorsaniz
    bunu class degil, interface yapmalisiniz

    1)INTERFACE'LERDE CONCRETE METHOD OLMAZ
    2)Interface'ler full abstraction yaptigindan Interface'lerden obje olusturulamaz

      Hatirladiginiz gibi Interface olan List'den direk obje olusturamiyorduk
      List<String> list=new List<>();
      Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz
      List<String> list=new ArrayList<>();
    3)Class'larda bir child birden fazla parent edinemez
      Ancak Interface'lerde concrete method olmadigindan
      biz her method'u child class'da override etmek zorundayiz,
      Override ederken kimin soyledigini override ettigimizin onemi yok
    4)Interface'ler neyin yapilmasi gerektigini soyler
      ama nasil yapilacagina karismaz
     */

    List<String> list=new ArrayList<>();

}
