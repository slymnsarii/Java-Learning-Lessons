package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        /*
        Class level'da iki tur variable olusturabiliriz
        Static(class) variable
        Instance(obje) variable
        Static variable'lar tum class'dan kullanabilirken,
        instance olanlar sadece static olmayan method'larda direk kullanilabilir
        Instance variable'lara static variable'dan ulasmak istersek obje olusturmamiz gerekir

        Instance variable'lar obje variable olduklari icin,
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir

        Static variable'lar class variable'i olduklari icin
        herhangi bir satirda static variable'in degerini bulmak icin
        CLASS'IN BASINDAN itibaren kod incelenmelidir


         */

        C01 obj1=new C01();
        System.out.println("obj1 rakam degeri : "+obj1.rakam); //5
        System.out.println("obj1'in sayi degeri : "+sayi); //10
        //obj1.rakam'da once obje icerisinde bir atama var mi(obje uzerinden gittigi icin obje1.rakam obje olusturulduktan sonra bir deger atandi mi diye bakiyorum)
        // diye bakiyoruz, eger atama yoksa instance deger ataniyor
        //Ama sayi static variable yani class variable'i, sayi'da ise obje'ye bakmaz direk class'in basindan(main class'i)
        // 21.satira kadar deger atamasi yapilmis mi diye bakariz, eger islem yapilmamissa yukarida class icerisinde bir deger var mi
        // diye bakariz varsa onu atariz

        obj1.rakam+=1; //rakam+=1 kullanamazsin cunku rakam instance bir variable  //5+1=6
        sayi+=1; //bunda itiraz olmaz cunku static  //10+1=11

        System.out.println("1 arttirdiktan sonra obj1'in rakam degeri : "+obj1.rakam);//6
        System.out.println("1 arttirdiktan sonra obj1'in sayi degeri : "+sayi); //11

        C01 obj2=new C01();

        System.out.println("obj2 rakam degeri : "+obj2.rakam); //5 //obj2 olusturulduktan sonra islem yok, instance degeri alir
        System.out.println("obj2'in sayi degeri : "+sayi);//11 //class'in basindan baslar sona kadar gider

        obj2.rakam++; //5+1=6
        sayi++; //11+1=12

        System.out.println("1 arttirdiktan sonra obj2'in rakam degeri : "+obj1.rakam);//6
        System.out.println("1 arttirdiktan sonra obj2'in sayi degeri : "+sayi); //12
    }
}
