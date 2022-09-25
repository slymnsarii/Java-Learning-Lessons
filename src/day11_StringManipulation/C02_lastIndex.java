package day11_StringManipulation;

public class C02_lastIndex {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /*
        verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
            -verilen kelime cumlede kullanilmamis
            -verilen kelime cumlede sadece 1 kere kullanilmis
            -verilen kelime cumlede 1'den fazla kullanilmis
         */

        int kelimeIlkIndex=cumle.indexOf(kelime); //ilk kullanimi verir
        int kelimeSonIndex=cumle.lastIndexOf(kelime); //son kullanimini verir

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        }else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else {
            System.out.println("verilen kelime cumlede 1'den fazla kullanilmis");
        }

    }
}
