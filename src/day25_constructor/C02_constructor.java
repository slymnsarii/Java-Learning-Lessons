package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_constructor {
    public static void main(String[] args) {

             C01           obj1      =       new        C01();// C01 class'indan obje olusturduk, bu obje C01 class'inin bir kopyasidir
        //class adi     objenin adi        keyword   constructor(yapici,bir class'in obje uretmesi icin mutlaka sahip olmasi gerekn yapidir)

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list=new ArrayList<>();
      //  List<String> list2=new List<>();

        /*
        Java'da bir obje olusturmak icin
        mutlaka constructor kullanmalisiniz
         */

        System.out.println(obj1.sayi);//0 sayinin atanmis bir degeri olmadigi icin default deger atanir(instance)
        obj1.deneme(); //C01 deneme method'u calistir

    }
}
