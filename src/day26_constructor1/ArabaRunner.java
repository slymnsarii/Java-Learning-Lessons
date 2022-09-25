package day26_constructor1;

import day25_constructor.Car;

public class ArabaRunner {

    public static void main(String[] args) {
        // bir gun onceki Car class'indan obje olusturalim

        Car car1 = new Car();
        /*
         Farkli bir package'daki bir class'dan obje olusturdugumuzda
         access modifier'lari da dikkate almaliyiz
         */

        /*
        Farkli bir package'daki class'dan car1. deyince bir onceki class'dan method'lara ulasiyor ama variable'lara ulasmiyor,
        variable'lara da ulasmasi icin o package'deki class'a gidip variable'larin basina "public" eklenmeli
         */
        System.out.println(car1.fiyat);
        /*
        Araba class'indan bir obje olusturdugumda eger default constructor
        kullanildiysa tum ozellikler icin tek tek deger atamak zorunda kaliriz
         */

        Araba araba1=new Araba();
        araba1.fiyat=100000;
        araba1.marka="Mercedes" ;
        araba1.yil=2010;
        araba1.model="C180";
        System.out.println("Araba1 bilgileri\nMarka : "+araba1.marka+"\nModel : "+araba1.model
                +"\nYil : "+araba1.yil+"\nFiyat :"+araba1.fiyat);
        /*
        Eger bir objeyi olustururken bazi ozelliklerini
        argument olarak belirtip
        o ozelliklerde bir obje olusturmak istersek
        Java itiraz eder.
        Cunku her class'da default constructor vardir
        ama o da parametresizdir.
        Bizim yeni ve parametreli constructor(lar)'a
        ihtiyacimiz var
        Biz method olustururken istersek method'u
        kendimiz yazabiliriz(puclic void...)
        Istersek de tek tek yazmamiza gerek yok,
        biz method call'i yazariz bunlari Java'ya olusturturuz
        demistik..Aynisi constructor icin de gecerli.
        Bunu yapmak icin de obje'deki argument'lerin uzerine
        gelip "create constructor" a tiklariz ve
        Araba Class'inda bir constructor olustururuz
        Ama orada argument'lerin ismini sirasiyla
        marka,model..  yazmaliyiz.
         */
        Araba araba2=new Araba("Bmw","5.20",2011,150000);

        System.out.println("Araba2 bilgileri\nMarka : "+araba2.marka+"\nModel : "+araba2.model
                +"\nYil : "+araba2.yil+"\nFiyat :"+araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println("Araba3 bilgileri\nMarka : "+araba3.marka+"\nModel : "+araba3.model
                +"\nYil : "+araba3.yil+"\nFiyat :"+araba3.fiyat);

        Araba araba4=new Araba("Audi","A5",2020,50000);
        System.out.println("Araba4 bilgileri\nMarka : "+araba4.marka+"\nModel : "+araba4.model
                +"\nYil : "+araba4.yil+"\nFiyat :"+araba4.fiyat);
    }
}
