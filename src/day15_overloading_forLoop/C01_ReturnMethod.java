package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayiyi carpip sonucu bize donduren bir method olusturun

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(sonuc);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        //istesem burda int sonuc=sayi1*sayi2;
        //return sonuc; --->olarak da yazabilirdim

        return sayi1*sayi2; //boyle birakirsam sonuc main method'a dondu var ama sonucu konsolda yazdirmadim
                            //konsolda gormek icin sout yazdirmam gerek main icerisinde sonuc variable'indan sonra
                            //burda sadece sout'u yazarsan calismaz, main'de yazmalisin
        // burda yazmak icin boyle yapmalisin, return'den once
       //int sonuc=sayi1*sayi2
       //System.out.println(sonuc);

    }
}
