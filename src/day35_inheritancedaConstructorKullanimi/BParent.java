package day35_inheritancedaConstructorKullanimi;

public class BParent extends AGrandParent {
    protected String isim="Isim belirtilmedi";
    protected String parentKlupAdi="Parent Klubu";

    BParent(){
        System.out.println("Parent constructor calisti");
    }
}
