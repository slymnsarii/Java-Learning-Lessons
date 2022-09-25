package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable'ina ulasabildim, degistirebildim(set) ve yazdirabildim(get)
         arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable'ina ulasimi tamamen serbest yapabilir veya tamamen engelleyebilirim
        //private yaptigim modele ise hic ulasamayiz
        //yani access modifier ya hep ya hic diyor(ya hem ulasirsin hem degistirirsin, yada ne ulasabilirsin ne degistirebilirsin

        //model'i degistirelim ama goremeyelim, yakit'i da gorelim ama degistiremeyelim

        //set ve get yetkilerini ozel olarak tanimlamak isterseniz
        //1.adim : ozel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir data'ya baska class'lara ulasmak mumkun olmadigindan
        //2.adim : set yetkisi icin setter ve get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Corolla");//model olarak Corolla'yi atadik
        //model'i yazdirma imkanimiz yok , cunku getter method'u yok
        System.out.println(arb1.getYakit());//elektrikli bilgisini yazdirabildik
        //yakit'i degistiremeyiz cunku setter method'u yok

        /*
        Eger bir obje olusturulurken sadece set edilmesine izin verilmesi isteniyorsa setter method'u olustururuz
        1)Neyi encapsulation yapmak istiyorsak(class uyelerinden(variable'lardan) onu private yapariz
        2)public olan setter ve getter method'larini olusturmaliyiz
         */

    }
}
