package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];

        System.out.println(sayilar); //[I@511baa65  //referansi verdi (bulundugu yeri gosterdi,
                                                    // bilgisayarin RAM'indeki bir yeri isaret ediyor)
        //Non-primitive data turundeki datalari
        //her zaman direk yazdiramayabiliriz
        //Array'i yazdirmak istersek, Java'daki Arrays class'indan yardim isteriz

        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println((sayilar)); //[I@511baa65 //deger atasak bile direk yazdiramayiz
        System.out.println(Arrays.toString(sayilar));//[5, 3, 10] // Arrays.toString(sayilar) yazmaliyiz

        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList)); //[Ali, Ayse, Ahmet]
        System.out.println(sinifList[sinifList.length-1]);//son elemani getirmek icin
        //Array'in tek bir elemanini yazacaksak Arrays.toString kullanmayiz, tamamen array listesini cagiracaksak onu kullaniriz
        sinifList[1]="Hasan";

        System.out.println(Arrays.toString(sinifList)); //[Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]); //Hasan'i yazdiralim
        System.out.println(sinifList[0]); //Ali

    }
}
