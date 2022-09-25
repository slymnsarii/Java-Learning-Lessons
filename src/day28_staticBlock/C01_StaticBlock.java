package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        Static block class uyelerinin tamamindan once calisir(main method'dan bile once)
        
        static block class olusturuldugunda calisir
        genellikler class'la ilgili on ayarlamalar
        veya static variable'lara deger atamak icin kullanilir.

        static block'larin class icerisinde nerede oldugu onemli degildir
        once static blocklar calisir

        birden fazla static block varsa, yukaridan asagi dogru calisir(yine main'den once)
         */
        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi); //0(deger atamadan once) //10(deger atandiktan sonra)
    }

    static {
        System.out.println("main method altindaki static block calisti");
    }
}
