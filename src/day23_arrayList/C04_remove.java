package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

    public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        /*
        remove method'u 2 sekilde kullanilir
        1-Obje'yi yazip silmesini istersek, bize boolean sonuc doner true/false
        2-Index girersek o index'deki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler); //[nutella, ikram, cekirdek, cay]
        System.out.println(urunler.remove("ikram")); //true(ikram'i siler)
        System.out.println(urunler); //[nutella, cekirdek, cay]

        System.out.println(urunler.remove("hobby")); //false
        System.out.println(urunler); //[nutella, cekirdek, cay]

        //Ikinci yontemi deneyelim yani index girelim

        System.out.println(urunler.remove(1)); //cekirdek
        System.out.println(urunler); //[nutella, cay]
        //index'i 1 olani bulup onu silecek ve
        // delil olarak bana cekirdek'i getirecek sonrasinda sout(urunler) yazarsan yeni listeyi(cekirdek olmayan) getirecek

        //olmayan index'i silmeye calisirsak ?
     //   System.out.println(urunler.remove(3)); //IndexOutOfBoundsException
    }
}
