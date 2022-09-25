package day14_methodCreation;

import day13_methodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        
        //input olarak verilen 4 harfli bir string'i
        //tersten yazdiran bir program yazdirin
        terstenYazdir("okan");
        System.out.println("");
        C04_MethodCreation.topla(5,8); //13
    }

    public static void terstenYazdir(String input){

        String tersInput=input.substring(3)+input.substring(2,3)+input.substring(1,2)+input.substring(0,1);
        System.out.print("Verilen kelimenin tersten yazilisi : "+tersInput);

    }
}
