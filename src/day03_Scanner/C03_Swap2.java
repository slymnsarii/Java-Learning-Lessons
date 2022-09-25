package day03_Scanner;

public class C03_Swap2 {
    public static void main(String[] args) {

        //2-Bir onceki swap sorusunda Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
        //degistiren (SWAP) bir program yapiniz

        int sayi1=10;
        int sayi2=20;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("sayi1 : "+ sayi1);
        System.out.println("sayi2 : "+ sayi2);
    }
}
