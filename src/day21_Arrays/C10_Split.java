package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        /*
        split() bir array method'u degil, String method'udur
        ama array dondurdugu icin, bu konuda anlatiyoruz

        split ile herhangi bir String'i istedigimiz parcalara bolup bir array haline getiriyoruz(hiclik ile)
         */

        String str="Java ne kadar guzel";

        String kelimeler[]=str.split(" ");
        //Space'leri bulur isaretler, sonra onlari yok eder ve standart olarak array'de ", " koyar
        System.out.println(Arrays.toString(kelimeler));//[Java, ne, kadar, guzel]

        String kelimelerNe[]=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));//[Java ,  kadar guzel]

        String kelimelerE[]=str.split("e");
        System.out.println(Arrays.toString(kelimelerE));//[Java n,  kadar guz, l]

        String karakterler[]=str.split("");//bir stringi hiclikten bolersiniz size butun karakterleri verir
        System.out.println(Arrays.toString(karakterler));//[J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]
    }
}
