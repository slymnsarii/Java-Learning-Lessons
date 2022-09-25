package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {



        /*
        Eger bir class'in icerisinde herhangi bir hesaplama yapip, bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilabilir tutmak icin islemi bir method'da yapip, sonucunu main method'a dondurebiliriz.
        Return type'i void olmayan bir method'un sonucunu main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */


        /*
        Kullanicidan sehir ismini ve dogum tarihini alip
        Bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        Sehir ismini programimizda buyuk harf olarak,
        Tarihi ise 2022-06-30 seklinde kullanicidan almak istiyoruz
         */

        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("girdiginiz sehir : "+sehir); //HATAY
        System.out.println("girdiginiz tarih : "+tarih); //2022-06-30

    }

    public static String tarihAl() {
        String tarih1=""; //tarih1 yerine istedigini yazabilirsin ama return ederken tarih1'i return etmelisin.
        Scanner scan=new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil= scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih1=yil+"-";
        }else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100");
        }
        System.out.println("kacinci ay oldugunu tamsayi yaziniz");
        int ay= scan.nextInt();
        if (ay<=0 || ay>12){
            System.out.println("ay no 1-12 arasinda olmalidir");
        }else if (ay<10){
            tarih1=tarih1+"0"+ay+"-";
        }else {
            tarih1=tarih1+ay+"-";
        }
        System.out.println(" ayin kacinci gun oldugunu tamasyi giriniz");
        int gun= scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("gun no olarak 1-31 arasinda sayi girilmelidir");
        }else if (gun<10){
            tarih1=tarih1+"0"+gun;
        }else {
            tarih1=tarih1+gun;
        }
        return tarih1;

    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in); //her method icin ayri Scanner olusturmaliyiz
        System.out.println("Lutfen sehir adi giriniz");
        String sehirAdi= scan.next().toUpperCase();

        return sehirAdi;
    }
}
