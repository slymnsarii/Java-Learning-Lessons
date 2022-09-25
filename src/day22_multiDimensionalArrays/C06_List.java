package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*
        Array'i array yapan sembol [] idi
        arrayList'de ise <> diamond(elmas) kullaniriz
         */

        List <String> isimler=new ArrayList<String>(); //ArrayList'den sonra <> icine String yazmasan da olur bazen lazim olur
        System.out.println(isimler); //[]

        //bir list'e eleman eklemek istersek(tamamini sout'ta yazdirsak true veya false dondurup, yazdirir
        isimler.add("basak");
        System.out.println(isimler.add("ayse")); //true doner
        System.out.println(isimler);//[basak, ayse]
        //List'lerde atama yapmasanizda

        /*
        String'de bir method calistirdigimizda assign yapmazsak String degismiyordu

        String isim="Suleyman";
        isim.toUpperCase(); //SULEYMAN
        sout(isim) -->Suleyman
         */

        System.out.println(isimler);//[basak, ayse]
        //List'lerde atama yapmasanizda yazdirir(son ders 22.dk izle)

        /*
        List'in tek kotu tarafi array altyapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir
         */



    }
}
