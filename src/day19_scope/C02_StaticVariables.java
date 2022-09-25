package day19_scope;

public class C02_StaticVariables {

    static int staticSayi=10; //static olmasi icin basina static eklenmesi gerek
    String isim="Mehmet";

    static int degersizStaticVariable; //deger atanmamis static variable
    int degersizInstanceVariable; //deger atanmamis instance variable
    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor.
     */

    public static void main(String[] args) {

        /*
        bir variable static olusturulduysa
        objeler icin degil, class icin gecerlidir her yerde kullanilir
        nereden kullaniyorsan kac yapildiysa odur
         */
        System.out.println(staticSayi); //10
        staticMethod(); //10
        staticSayi=12;
        System.out.println(staticSayi); //12
        //staticOlmayanMethod(); methodu burdan cagiramam static kulubune uye olmadigi icin, obje olusturup cagirabilirim
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi); //20

        /*
        Instance bir variable'in degerini bulmak icin obje'nin olusturulmasindan itibaren
        istenen satira kadar code'u takip etmeliyiz

        Static variable'da ise class'in en basindan baslayarak
        istenen satira kadar code'u takip edip
        static variable'in son degerini bulmamiz gerekir
         */

    }


    public static void staticMethod(){
        System.out.println(staticSayi); //methodlar sadece biz cagirinca calisir,
                                        // main'de bu method'u cagirmazsan calismaz //10

    }

    public void staticOlmayanMethod(){
        /*
        Static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum methodlar static variable'lari gorebilir ve degistirebilirler
        farkli method'larda static variable'in hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren code'un calismasini takip etmeliyiz
        method ne zaman cagrilirsa o anki static variable degerini method'da kullanabiliriz
         */
        System.out.println(staticSayi);//12
        staticSayi=20;
        //System.out.println(staticSayi); //20 static sayilar her yerden kullanilabilir

    }
}
