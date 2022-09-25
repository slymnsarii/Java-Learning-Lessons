package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : "+sayilar1.size()); //Listenin boyutu : 3
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1); //[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu : "+sayilar1.size());//Listenin yeni boyutu : 8

        sayilar1.set(3,8);//var olan elemani yer degistirir(3.index'de olan 2 yerine 8 yazar(2'yi siler 8 yapar)
        System.out.println(sayilar1);//[5, 3, 2, 8, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12)); //5 //sout icerisinde direk set yaparsan sildigi elemani yazdirir
        //ama tekrar sout(sayilar1) yazarsan yeni listeyi gosterir
        System.out.println(sayilar1);//[12, 3, 2, 8, 5, 3, 2, 2]

        /*
        set method'u istenen index'deki eski elementi silip
        yerine verdigimiz elementi set eder.

        eger eski elementi silmek istemiyorsak,
        add(index,deger) method'unu kullanabiliriz

        set() sildigi eski elementi de bize dondurur
         */
    }
}
