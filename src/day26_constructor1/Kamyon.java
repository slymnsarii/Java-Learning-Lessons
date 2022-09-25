package day26_constructor1;

public class Kamyon {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public    int yil;
    public   int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;

        /*
        KamyonRunner'da olusturdugum kamyon2(yesil)
        Mercedes,4140,2005,500000 argumentlerini yazdiktan sonra constructor olusturup
        yukaridaki Kamyon constructor'in icindekilere(siyah) parametre olarak gonderiyoruz
        markaK olarak gonderdigim parametre asagisindaki yazili olan
        atanmis variable'lara geliyor, o da en yukaridaki instance variable'lara
        (public String marka="Marka belirtilmedi") ataniyor
        Boylece sistem tamamlanmis oluyor
        markaK'lar siyah, instance variable'lar mor

         */

        /*
        Bizim temel amacimiz KamyonRunner'da argument olarak girilen degerin
        Kamyon Class'inda instance variable'a atanmasi
        Ancak scope konusunda ogrendigimiz gibi
        Kamyon Constructor scope'unda marka oldugu icin
        instance marka'ya gitmiyor(eger farkli isim yapsam markaK gibi, o zaman ancak anlayabiliyor)
        Bu karisikligi gidermek icin instance variable'lari
        belirli hale getirmemiz lazim
        Java bunun icin "this" keyword'u olusturmustur
        Basina this. yazdigimiz(this.marka) instance variable'dir
        sagda yazan marka'da benim argument olarak Kamyon constructor'ina
        parametre olarak gelen deger
        Intellij'de bunu anlamamiz icin this yaptigimi Kamyon class'indaki
        instance variable'lari aliyor(mor)
        this olmayani ise Kamyon scope'undeki () icindeki degerleri aliyor(siyah)

        Genel kullanim acisindan this keyword'u
        kodu herkesin anlamasini kolaylastirdigi icin tercih edilir
         */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\nmarka = " + marka +
                "\nmodel = " + model +
                "\nyil = " + yil +
                "\nfiyat = " + fiyat ;
        /*
        toString() method'unu constructor gibi
        sag tiklayip Generate,
        sonra toString()'e tiklayip olusturdum
        yukarida hazir bir seyler geliyor ve ben
        kendime gore duzenliyorum
         */
    }
}
