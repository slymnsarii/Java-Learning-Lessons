package day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{

    protected int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void maas(){
        System.out.println("Personel min : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }

}
