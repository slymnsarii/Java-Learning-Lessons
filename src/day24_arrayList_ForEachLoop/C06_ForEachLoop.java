package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        //array'deki tum elemanlari inceleyelim, tek sayi olanlari listeye aktaralim
        //index lazim degilse bunu kullaniriz, yani her elementi getirmeyi istiyorsak

        for (int each:arr) // gelecek datalarin turu, loop icinde ne isim verdigim, nereden aldigim
                             //arr array'ine git, her bir int'i al ve bana getir
              {

            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
