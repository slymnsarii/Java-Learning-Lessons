package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
        Kullaniciya index sorup, o index'deki urunu yazdiran bir program yazdiralim
        Kullanici urun sayisindan buyuk index girerse, exception vermesinin onune gecelim
         */

        String urunler[]={"Nutella","Cokokrem","Sut","Cay","Findik"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");

        int istenenSira=0;

        try {
            istenenSira= scan.nextInt();
        } catch (InputMismatchException deneme) {
            System.out.println("Urun index'i icin bir tam sayi girmeniz gerekli");

        }
        /*
        catch blogunun onundeki parantezde
        exception class'inin ismi ve yaninda
        yakalanan exeption'i atadigimiz variable'in ismi olur (e)

        Eger yakalanan exeption ile ilgili bilgileri
        kullaniciya vermek isterseniiz bu objeyi kullanabilirsiniz
        eger exception'la ilgili kullaniciya bilgi verme gereksinimi yoksa
        e kullanilmasa da kod calisir
         */


        try {
            System.out.println("Aradiginiz urun "+urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor"+
                    "\nSira numarasi en fazla "+(urunler.length)+" olabilir");
        }

    }
}
