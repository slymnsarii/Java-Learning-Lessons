package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

    public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler);//[nutella, ikram, cekirdek, cay]
        //indexOf()'da icine object(n-primitive data turu) yazmaliyiz
        System.out.println(urunler.indexOf("ikram")); //1
        System.out.println(urunler);//[nutella, ikram, cekirdek, cay]

        /*
        indexOf() bize bilgi donduren bir method'dur
        listemizi degistirmez
         */
        
        urunler.lastIndexOf("ikram"); //1
        System.out.println(urunler); //[nutella, ikram, cekirdek, cay]
        /*
        indexOf() urunu aramaya 0.index'den,
        lastIndexOf() aramaya son index'den baslar

        arama bitip, urun bulundugunda, ikiside bulunan urunun index'ini verir(ayni index)

         */

        urunler.add("ikram");
        System.out.println(urunler);//[nutella, ikram, cekirdek, cay, ikram]
        System.out.println(urunler.indexOf("ikram")); //1
        System.out.println(urunler.lastIndexOf("ikram")); //4

        System.out.println(urunler.indexOf("hobby")); //-1
        System.out.println(urunler.lastIndexOf("hobby")); //-1


    }
}
