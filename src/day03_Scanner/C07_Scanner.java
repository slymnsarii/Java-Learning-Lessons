package day03_Scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        //bir onceki soruyu tek seferde tum bilgileri alarak yapiniz(tek scanner ile)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz \naralarda Enter tusuna basiniz ");

        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("girilen bilgiler = "+isim+" "+soyisim+ " "+yas);

    }
}
