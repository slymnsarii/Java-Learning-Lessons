package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        //FileInputStream'e Add exception to method signature yaparak; throws FileNotFoundException bu method calisirken
        // throws FileNotFoundException firlatabilir dedik

        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz
        Ayni sekilde Java'dan bilgisayarimiz'daki bir dosyaya
        ekleme veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz.
         */

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
        //dosyayi yazmak icin:Text'e sag tik-->Copy Path/Reference-->Path from Content Root-->() tirnak icinde icine yapistir

        /*
        Goruldugu gibi compile time'da altini cizen her durum
        Compile Time Error degildir
        Java'da bazi exception'lar da CTE'dir
        Ozellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile Time Exception'dir


        CTE olustugunda Java cozum icin 2 ihtimal onerir
        1)try-catch ile cevrelemek
        2)method signature'na throws keyword ile beklenen Exception turunu yazmak

        throws Exception, sadece olayin farkinda oldugumuzun deklarasyonudur
        Exception'in handle edilmesinde hic bir rolu yoktur
        Yani try-catch ile handle ettigimiz(kontrol altina aldigimiz) exception'larda kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa yine
        hic bir sey yapmamisiz gibi hata mesaji yayinlayip, calismayi durdurur
         */
    }
}
