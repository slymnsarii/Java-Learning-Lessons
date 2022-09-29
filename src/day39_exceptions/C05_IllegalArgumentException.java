package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    /*
     Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir sayi
     girerse Exception verecek sekilde yazin.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("yasinizi giriniz :");
        int yas= scan.nextInt();


        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("Yasiniz : "+yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz!"); //bu yaziyi da kirmizi yazdirmak icin err kullaniriz
        }
    }


}
