package day36_inheritanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe{

    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci(); //burda const. isci oldugu icin biz bir isci olusturuyoruz
                                    // ama iscinin Muhasebe'deki calisan olarak ozelliklerini arıyoruz
        /*
        Bir obje olustururken
        Data turu ve constructor ayni class'dan ise
        direk o class'a gidiyorduk

        Eger data turu ve constructor farkli ise
        Oncelikle Data turunun oldugu class'a gideriz
        ancak, bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin Mhassebe class'indaki tum calisanlarla beraber
        sahip oldugu genel ozellikleri yazdirir

         */
        System.out.println(isc1.gunlukMesai); //Muhasabe'den 8
        System.out.println(isc1.saatUcreti); //Muhasabe'den 10
        isc1.maas(); //Muhasabe'den //Personel min : 2400 maas alir
        isc1.ozelSigorta(); //Muhasabe'den //Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); //Personel'den
        System.out.println(isc1.isim); //Personel'den
        System.out.println(isc1.soyisim); //Personel'den
        System.out.println(isc1.departmant); //Personel'den

        APersonel isc2=new DIsci(); //burda const. isci oldugu icin biz bir isci olusturuyoruz
                                     // ama iscinin Personel'deki calisan olarak ozelliklerini arıyoruz

        //System.out.println(isc2.gunlukMesai); //Muhasabe'den 8
       // System.out.println(isc2.saatUcreti); //Muhasabe'den 10
        //isc2.ozelSigorta(); //Muhasabe'den //Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.sigorta(); //Personel'den
        System.out.println(isc2.isim); //Personel'den
        System.out.println(isc2.soyisim); //Personel'den
        System.out.println(isc2.departmant); //Personel'den

        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa
        varsa onun parent'ina gidebilir ama child'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */

    }
}
