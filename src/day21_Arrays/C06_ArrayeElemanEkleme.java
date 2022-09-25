package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    //C05'deki method'u kullanarak array'e eleman ekleyelim
    public static void main(String[] args) {

        String takimListesi[]={"suleyman","osman"};
        String eklenecekIsim="talha";

       takimListesi= C05_ArrayeElementEkleme.elementEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi)); //[suleyman, osman, talha]
    }
}
