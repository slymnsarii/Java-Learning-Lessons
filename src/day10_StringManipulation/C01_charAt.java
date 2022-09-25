package day10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); //ilk harfi yazdirir //J

        System.out.println(str.toUpperCase().charAt(7)); //7.index'deki harfi buyuk yazdirir //R
        // atama olmadigi icin sadece bu islem icin gecici olarak sadece r buyuk oldu Stringin tamami buyuk olmadi
        // ve R tekrar r olacak

        System.out.println(str.charAt(21)); //l

     // System.out.println(str.charAt(22));//StringIndexOutOfBoundsException
        // String'in sinirlari disinda index girersen hata verir
        //son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
        //eger index olarak uzunlugu veya daha fazla bir sayiyi girersek Java exeption verir


        //charAt() kullandigimizda sonuc char olacagi icin artik manipuation yapamayiz
        // (toUpper-lower felan kullanamayiz, oncesinde yapmaliyiz)
        //charAt(-3) felan yazamayiz
        //String method'larindan kullanmamiz gereken bir method varsa
        //charAt'den once kullanmaliyiz






    }
}
