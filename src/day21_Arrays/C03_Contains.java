package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        //Kullanicidan aldiginiz bir ismin, verilen bir array'de olup olmadigini kontrol edip,
        //bize true veya false sonucu donduren bir method olusturun

        String isimler[]={"Basak","Nurullah","Fatih","Adem","Enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aradiginiz ismi yaziniz");
        String arananIsim= scan.nextLine();

        boolean sonuc= contains(isimler, arananIsim);
     //System.out.println(sonuc); // sonucu gormek icin yazdirdik normalde dondur dedigi icin gerek yok.Veya
        if (sonuc){
           System.out.println("Girilen isim listede var");
       }else {
            System.out.println("Girilen isim listede yok");
        }

    }

    public static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false; //atama yapmazsam itiraz ediyor return kisminda o yuzden simdilik false atiyoruz

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(arananIsim)){
                sonucMethod=true;
            }
        }

        return sonucMethod;
    }
}
