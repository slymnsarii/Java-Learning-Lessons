package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        BinarySearch Java'da eleman aramanin kisa yoludur,
        ancak BinarySearch'un calismasi icin once
        array'in sirali hale(sort methodu) getirilmesi gerekir
        Eger siralama yapmadan siralama yaparsaniz,
        sonucu bulamayabilir veya yanlis bulabilirsiniz
              */

        String harfler[]={"Y","B","D","G","O"};

        String arananHarf="Y"; //-6 eger sort yapmazsan ortadan baslar D yi arasan dogru bulur

        // Arrays.binarySearch(harfler,arananHarf);//once array sonra arananHArf yada kelime // int dondurur
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));//true

        //BinarySearch bize aradigimiz elemanin index'ini dondurur
        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));//[B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler,arananHarf));//4
        System.out.println(C03_Contains.contains(harfler,arananHarf));//true
    }
}
