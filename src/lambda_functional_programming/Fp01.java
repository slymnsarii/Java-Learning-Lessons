package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    /*
    1)Lambda(Functional programming) Java 8 ile kullanilmaya baslanmistir
    2)Functional Programming'de "Ne yapilacak" (What to do) uzerine yogunlasilir. Structured Programming "Nasil yapilacak"
    (How to do) uzerine yogunlasilir.
    3)Functional Programming Arrays ve Collections ile kullanilir.
    4)"entrySet() methodu ile Map, Set'e donusturulerek Functional Programming'de kullanilir.

     */

    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);




    }
    //Ardisik list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun(Structered)

    public static void listElemanlariniYazdir(List<Integer> list){

        for (Integer w:list) {
            
        }
    }
}
