package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{

    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    Parent'i olan tum class'lardaki abstract method'lari
    concrete hale donusturmek (override etmek) ZORUNDADIR
    (Bunun istisnasi:Parent class'larindan herhangi birisi, onun da kendi parent'inda olan
    bir abstract method'u concrete hale getirdiyse, artik bir daha concrete hale(kurallari uygulamama) GEREK YOK)

    Bu kuralin istisnasi
    parent class'lardan herhangi birinde
    concrete hale donusturulmus, abstract method'lardir.
     */

    public static void main(String[] args) {

        HA160 arb1=new HA160();
        //concrete class'dan istedigimiz objeyi uretebiliriz

        FMercedes arb2=new FMercedes();
        //mercedes'de concrete

       // EToyota arb3=new EToyota();
        //Abstract class'lar constructor barindirir ama obje uretemezler
        //Toyota class'i abstract class oldugundan obje uretilemez.

        /*
        List<String> list1=new List<String>(); //List abstract oldugundan obje uretemezsiniz
        List<String> list2=new ArrayList<>();

        Abstract bir class'in ozelliklerini tasiyan bi obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class
        Constructor'i ise child'i olan concrete bir class'dan secebilirsiniz
         */
        EToyota arb4=new GCorolla();
    }


}
