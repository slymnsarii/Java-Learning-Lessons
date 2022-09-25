package day05_MatematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        String str="Java cok guzel";

        int sayi=10;
        /*
        primitive data turlerinin yaninda method'lar olmaz
        java bazi methodlari kullanabilmemiz icin
        her bir primitive data turu icin bir wrapper class olusturmustur.

         */

        Integer sayi2=10;

        sayi2.byteValue();

        System.out.println(sayi2);

        int num1=Integer.MAX_VALUE;
        System.out.println(num1);

    }
}
