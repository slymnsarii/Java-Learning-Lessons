package day14_methodCreation;

import day13_methodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        /*
        Verilen 3 basamaakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim
         */

        int input=423;
        rakamlaritopla(input);
        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("ahmet");
    }

    public static void rakamlaritopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;


         birlerBasamagi=input%10;
         rakamlarToplami+=birlerBasamagi;
         input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz " + temp+ " sayisinin rakamlar toplami : "+ rakamlarToplami);


    }
}
