package day06_Concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper Class Java'nin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigimiz class'lardir

        int-->Integer
        char-->Character
        digerleri primitive ile ayni sadece bas harfi buyuk
         */

        String str="Java ile hayat ne guzel";
        System.out.println(str.toUpperCase()); //JAVA İLE HAYAT NE GUZEL

        boolean guzelMi=true;
         //guzelMi.     boolean primitive oldugundan hazir methodu bulunmuyor

        Boolean buGuzelMi=true; //WrapperClass
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767



        String ogrNo="123456";

        //Kullanicidan bir sifre isteyin
        //eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre); //parseInt string sayilardan olusuyorsa int'a cevirebilir

        System.out.println("Girilen sifre : "+(sifre+3)); //150003
        System.out.println("Integer sifre : "+(sifreSayi+3)); //15003

        /*
        Wrapper Class'lar ilerde kullanabilecegimiz pek cok faydali hazir method icerir.
         */


    }
}
