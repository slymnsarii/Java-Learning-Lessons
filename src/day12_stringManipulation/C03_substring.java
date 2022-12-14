package day12_stringManipulation;

import java.util.Locale;

public class C03_substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3)); //eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); //once parantez ici length kismi-->8-3=5 -->soyisim.substring(5)
                                                                    //fil
        System.out.println(isim.substring(2,4)); //le

        //isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        //kredi kartinin ilk 4 rakami gorulsun, geriye kalan *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan=isim.substring(1).replaceAll("\\w", "*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalan=soyisim.substring(1).replaceAll("\\w", "*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalan+" "+
                          soyisimIlkHarf+soyisimGeriyeKalan+"\n"+
                            kkIlk4+kkGeriyeKalanlar);

    }
}
