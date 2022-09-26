package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{
    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur(); //Data turu ve constructor da Memur oldugu icin Memur class'ina gideriz
        System.out.println(mmr1.gunlukMesai); //9
        System.out.println(mmr1.saatUcreti); //12
        mmr1.maas(); //Memurlar : 3240 maas alir
        mmr1.ozelSigorta(); //Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); //Personel'den alacak
        System.out.println(mmr1.isim); //Personel'den
        System.out.println(mmr1.soyisim); //Personel'den
        System.out.println(mmr1.departmant); //Personel'den


        BMuhasebe mhsb1=new BMuhasebe(); //Data turu ve constructor'i Muhasebe oldugu icin Muhasebe class'ina ve parent'ina gideriz, child'i olan Memur'a gitmeyiz
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe

        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;

        BMuhasebe class'i da obje olusturabilen bir class'dir aynı zamanda bir data turudur
         */

        System.out.println(mhsb1.gunlukMesai); //8 BMuhasabe class'indakini verir
        System.out.println(mhsb1.saatUcreti); //10 Muhasebe'den
        mhsb1.maas(); //Personel min : 2400 maas alir  //Muhasebe'den
        mhsb1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir //Muhasebe'den
        mhsb1.sigorta(); //Tum personelimiz sigorta yapilir //Personel'den
        System.out.println(mhsb1.isim); //Personel'den
        System.out.println(mhsb1.soyisim); //Personel'den
        System.out.println(mhsb1.departmant); //Personel'den
    }
}
