package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
                Ornek: gun=Pazar output = “Hafta sonu”
                gun=Sali output = “Hafta ici”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        // Pazar, pazar, PAZAR, PaZAr ?? bilemeyiz,
        // pazar, pazar, pazar, pazar

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("girilen gun HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") || girilenGun.equals("cuma")) {
            System.out.println("girilen gun HAFTAICI");
        }
       if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
               || girilenGun.equals("persembe") || girilenGun.equals("cuma")
          || girilenGun.equals("pazar") || girilenGun.equals("cumartesi"))){
           System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }
    }
}