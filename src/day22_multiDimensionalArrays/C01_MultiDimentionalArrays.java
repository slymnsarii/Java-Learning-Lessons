package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimentionalArrays {
    public static void main(String[] args) {
        //Tek katli array'lerde array'i direk yazdiramiyoruz
        //cunku array non-primitive data turudur ve her n-primitive data direk yazdirilamayabilir

        //Ancak array'in icerisindeki elementleri direk yazdirabiliriz
        //cunku genelde primitive data turu veya String elementler kullaniyorduk

        //Multi-dimentional array'lerde en dikkat edecegimiz konu
        //ulasmak istedigimiz elementin bir array mi yoksa primitive data mi oldugudur


        int [][] sayilar={{1,2,4,5},{3,4}};

        /*
        burada sayilar array'iyini dusunursek icinde 2 tane inner array var
        sayilar[0]==>[1,2,4,5]

        ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]); //[I@511baa65
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]); //2
        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));//[[I@511baa65, [I@340f438e]
                                            // Bu array'in icerisinde 2 tane daha array oldugu icin referans yazdirir
        //multi-dimensionalArrays'i direk yazdirmak icin Arrays.deeptoString kullaniriz
        System.out.println(Arrays.deepToString(sayilar)); //[[1, 2, 4, 5], [3, 4]]

        /*
        Array'i 2 sekilde declare edebiliyorduk
        1-Elemanlari direk yazabiliriz
         int [][] sayilar={{1,2,4,5},{3,4}};
        2-Outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz

        int[][] sayilar= new int[3][4]; // 3 satir 4 sutunlu gibi

        ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer array'in 3 tane inner array'i vardir
        her bir inner array'in ise 4 tane elemani vardir

        eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
         mecburen 1.yontemi kullanmalisiniz
         */
    }
}
