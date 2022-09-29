package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i yazdirmaya calisirsaniz
        Java Compile Time'da bunu fark eder ve size izin vermez
         */

        str=null;

        /*
        System.out.println(str.length());
        NullPointerException
        */

        Object obj="Java Java Java";
        Integer sayi=(Integer) obj; //ClassCastException

        /*
        String str2="Hava Civa";
        Integer sayi=str2;
        Java bazi casting islemlerine Compile Time'da izin vermez(cunku String'in int olmayacagini bilir)

        Ancak bazen syntax uygun olabilir
        bu durumda Java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000); //kodlari bekletiyor
    }
}
