package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanicidan ismini isteyin
        //girilen ismi
        //isminiz :..... seklinde yazdirin
        //Insanlarin dunyasindan kod'larimizin bulundugu class'a deger almak icin
        //Scanner Class'i kullaniriz.

        //1-Scanner objesi olusturalim

        Scanner scan=new Scanner(System.in);

        //2-Kullaniciya ne istedigimizi soyleyelim

        System.out.println("Lutfen isminizi giriniz");

        //3-Olusturdugumuz scan objesi ile kullanicinin giridigi degeri alip
        //olusturacagimiz uygun bir variable'a atayalim

        String kullaniciIsmi=scan.next();
        System.out.println("Isminiz : "+kullaniciIsmi);
    }
}
