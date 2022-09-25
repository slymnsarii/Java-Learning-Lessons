package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {

    String isim="Child belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
         AGrandParent gp1=new AGrandParent();
        //Bu objeyi olusturmak icin AGranparent Const. calisir,
        //Parent veya child const. calismaz

        Child child1=new Child();
        child1.granpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        //child1 objesi icin Child constructor calisti
        /*
        Java'da bir class'i kullanabilmek icin
        o class'dan obje olusturulup, dolayisiyla
        o class'in constructor'ini kullanirdik

        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin
        o class'larin constructor'larini otomatik calistiran bir yapi kurmustur.

        Ornegin child class'inda, child class'indan bir obje olusturmak istedigimizde
        Child constructor'ini kullaniriz

        Java Child(){} constructor'ini gordugunde once parent'in constructor'ini calistirmam lazim der,
        buradan Parent constructor'a gider
        Parent class'inda Paretn(){} gorunce
        once bunun parent'inin yani GrandParent constructor calismasi gerekir der

        Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak
        tum constructor'lari asagi dogru calistirir
         */

    }
}
