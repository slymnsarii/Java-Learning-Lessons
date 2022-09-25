package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        elimizdeki urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip
          eski urunu, var olan eski urunler listesine ekelyelim

         */

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        List<String> eskiUrunler=new ArrayList<>();
        //Listedeki ikram'in yerine biskrem koyalim,
        //Ikram'i da eski urunler listesine ekleyelim

        String yeniUrun="biskrem";
        String silinecekUrun="ikram";

      int temp =  urunler.indexOf(silinecekUrun);
      String silinenUrun=urunler.set(temp,yeniUrun);

      eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+urunler); //Urunler listesi : [nutella, biskrem, cekirdek, cay]
        System.out.println("Eski urunler listesi : "+eskiUrunler); //Eski urunler listesi : [ikram]


      yeniUrun="kahve";
        silinecekUrun="cay";

    temp =  urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+urunler); //Urunler listesi : [nutella, biskrem, cekirdek, kahve]
        System.out.println("Eski urunler listesi : "+eskiUrunler); //Eski urunler listesi : [ikram, cay]


        yeniUrun="findik";
        silinecekUrun="cekirdek";

        temp =  urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+urunler); //Urunler listesi : [nutella, biskrem, findik, kahve]
        System.out.println("Eski urunler listesi : "+eskiUrunler); //Eski urunler listesi : [ikram, cay, cekirdek]


    }
}
