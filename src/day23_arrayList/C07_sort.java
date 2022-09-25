package day23_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

    public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        Collections.sort(urunler);

        System.out.println(urunler);//[cay, cekirdek, ikram, nutella]

        /*
        List ile gelen sort method'unda siralama ozelligini girmek gerekiyor
        bunun yerine Collections Class'indan sort method'unu kullaniyoruz
        bu method listemizi natural order'a(String'de alfabeye gore) gore siralar
         */
    }
}
