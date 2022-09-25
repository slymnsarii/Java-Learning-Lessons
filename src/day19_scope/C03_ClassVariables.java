package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farkli bir class'da calisirken herhangi bir class adini yazip .'ya basarsak
        adini yazdigimiz class'daki tum STATIC uyelerini gorebilir ve kullanabiliriz
         */
        //Java run yaptigimizda bu class'daki islemleri yapar, eskiye bakmaz

        C02_StaticVariables.staticMethod(); //10 // burda staticMethod()'a gider sadece
                                                // o method'daki yazilana bakar icindekini calistirir

        System.out.println(C02_StaticVariables.staticSayi);//10//burda C02_StaticVariables class'indaki variable'a gider
                                                                // sadece onun en basta atadigi degeri yazdirir

        System.out.println(C02_StaticVariables.degersizStaticVariable);//0 //burda C02_StaticVariables class'indaki
                                                                        // atanmamis olan degersiz variable'a gider
        /*Class variable'lara deger atayip atamamak bize kalmistir
          istersek deger atamasi yapariz, istemezsek atamayiz
          Eger deger atamissak Java atadigimiz o degeri kabul eder
          deger atamazsak Java bu variable'lara default bir deger atamasi yapar
          int-->0
          String-->null
          boolean-->false
          char-->'' hiclik
         */

        /*
        baska class'daki variable'lara yani instance variable'lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10 // obje kullandigimda da bu defa static olmayanlara ulasiyorum,
        // burda C02_StaticVariables class'indaki staticOlmayanMethod()'a gidiyorum direk ve ordaki islemi yapacak
        //oraya gittiginde souttaki staticSayi'yi 10 yazdirir sonra ama sonra 20 atandigi icin 20 olarak kaydeder
        //bu method'un icinde staticSayi=20 olur

        System.out.println(obje1.isim); //Mehmet
        System.out.println(obje1.degersizInstanceVariable);//0 olur (default deger atar)

        System.out.println(C02_StaticVariables.staticSayi);//20
                        // oldu cunku C02 class'indaki static sayi degerini 20 olarak degistirdik(57.str)

        /*
        Farkli bir clas'dan C02 class'indan method ve variable'lari kullandigimda
        C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir
         */
    }
}
