package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tamsayilar alin
        Kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        //while ile
        /*
        Loop'larda kullanacagimiz variable'lari loop'dan once olusturmaliyiz
        while loop'da, loop'dan once olusturdugumuz bu variable'a atayacagimiz degeri iyi dusunmemiz gerekiyor
        cunku yanlis bir deger atarsam loop hic devreye girmez
         */

        while (sayi%2==0){

            System.out.println("Lutfen bir tam sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else {
                System.out.println("Girilen sayi tek, benden bu kadar");
            }

        }

        //do while ile yapalim

        do {//ilk onceden olusturulan variable'a hangi deger atandiginin onemi yok, ilk atanan deger ne olursa olsun kod calisir
            // do while'in dezavantajı :
            //ilk calistirma kontrol yapilmadan oldugu icin, loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
            System.out.println("Lutfen bir tam sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else {
                System.out.println("Girilen sayi tek, benden bu kadar");
            }

        }while (sayi%2==0);

    }
}
