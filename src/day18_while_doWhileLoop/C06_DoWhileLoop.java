package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve
     girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

         */

        Scanner scan=new Scanner(System.in);
        int sayi=0; // while loop olsa burda direk islemi yapmazdi
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayilarToplami=0;

        do {
            System.out.println("Lutfen toplamak uzere pozitif tam sayi giriniz");
            sayi= scan.nextInt();
            if (sayi>0){
                pozSayilarToplami+=sayi;
                pozSayiAdedi++;
            }else if (sayi<0){
                negSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }//bir daha else yazip 0'i kontrol etmeme gerek yok cunku while kontrol edecek onu.

        }while (sayi!=0); // sayi 0'a esit olmadigi muddetce devam edecek dongu

        System.out.println(pozSayiAdedi+" adet pozitif sayi girdiniz\n"+negSayiAdedi+
                " negatif sayi girdiniz ancak onlar toplama dahil edilmedi.\n"+"Sayilarin toplamlari "+pozSayilarToplami);

            //Kullanici her defasinda kendi girdigi icin sayilari, arttirma islemleri yapmadik loop icerisinde.
    }
}
