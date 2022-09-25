package day03_Scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
               int sayi=10;
               char harf='a';
              int toplam=sayi+harf;
              String str="banan";
             System.out.println(toplam); //10a degil 107 oldu
        System.out.println(str+harf); //banana
        System.out.println(harf+2); //99
        System.out.println(str+sayi+harf); //banan10a



        /*
        1-char data turu isleme girdigi degiskenin turune gore farkli davranabilir
            eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir.
            sayi+harf sayi variable'i int old. harf variable'i ASCII table'dan 97 degerini kullanir

            char yeniHarf=harf+2;  java once sagdaki islemi yapar, sagda int + char gorunce ascii degerini alir
            sonra atama islemi yapmaya calisir
            char yeniHarf=99;
            bu atama java acisindan kabul edilebilir degildir

        2- str+harf; //banana String variable cok gucludur, hangi data turu ile isleme girerse girsin
        diger data turunu kendine benzetir

         */

        //pekii... console'da 10a gormek istersek nasil yazdirmaliyiz?

        System.out.println(""+sayi+harf); //10a

        char deger='1';
        char harff='a';
        System.out.println(deger+harff); // '1' + 'a' --> 49+97=146


    }
}
