package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip
        //girilen bilgiler = seyfi capar 34 seklinde yazdiralim

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        /*String verileri scanner ile alirkan next() ve nextLine() kullanilabilir
        next():ilk bosluga kadar olan kismi yani 1 kelime alir
        nextLine():satirin sonuna kadar ne yazarsak alir
        NOT:Eger ardarda birden fazla String deger alacaksak nextLine() kullanmaliyiz.
         */
        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas=scan.nextDouble();

        System.out.println("girilen bilgiler = "+isim+" "+soyisim+ " "+yas);

    }
}
