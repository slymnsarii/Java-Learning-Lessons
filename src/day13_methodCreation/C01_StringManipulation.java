package day13_methodCreation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        /*
        Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    String str1 = “$13.99”
    String str2 = “$10.55”
    ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
         */

        String str1="13.99";
        double sayi1=Double.parseDouble(str1); //Stringden oluşan sayilari  double sayi  yapma
        System.out.println(sayi1);
        String str2="10.55";
        double sayi2=Double.parseDouble(str2);

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        System.out.println("$"+(sayi1+sayi2));

        System.out.println(str1+" "+str2);

    }
}
