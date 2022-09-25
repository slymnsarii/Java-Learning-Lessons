package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        /*
        Input olarak verilen isim ve soyismi ilk harf buyuk, geriye kalan harfler * olacak sekilde program yaziniz
        Ex:I*** K*****
         */

        String isim="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim); //E*** B******
        System.out.println(isim+" "+soyisim);//Enes Bozkurt
        C02_MethodCreation.rakamlaritopla(654);
        
    }

    public static void ismiGizle(String isim, String soyisim) {
       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyisim);
    }
}
