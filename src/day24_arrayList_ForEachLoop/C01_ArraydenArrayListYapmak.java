package day24_arrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String [] arr={"ismail","nurullah","fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari list'e cevirmek
        daha pratik olabilir
        1-Loop ile array'deki tum elementleri, List'e atabiliriz
        2-Arrays.asList() kullanabiliriz
        Ancak bu method'un iki tane kotu yan etkisi var
        -Arrays class'i kullanildigi icin array ozellikleri gecerli olur
        dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
        bu sekilde olusturulan list'lerde kullanilamaz
        -kaynak olan array ile urun olan list ozdeslestirilir
        birinde yapilan degisiklik otomatik olarak digerine de islenir
         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList); //[ismail, nurullah, fatih]

        List<Integer> sayilar=Arrays.asList(new Integer[5]);

        //1.yan etki
      //  sinifList.add("erdi"); //UnsupportedOperationException
      //  sinifList.remove(1); //UnsupportedOperationException

        //2.yan etki

        arr[1]="emre";
        System.out.println("degisim sonrasi array : "+Arrays.toString(arr));//degisim sonrasi array : [ismail, emre, fatih]
        System.out.println("array'i degistirince list : "+sinifList);//array'i degistirince list : [ismail, emre, fatih]

        sinifList.set(0,"utku");
        System.out.println("List'i degistirince list : "+sinifList);//List'i degistirince list : [utku, emre, fatih]
        System.out.println("List'i degistirince array : "+Arrays.toString(arr));//List'i degistirince array : [utku, emre, fatih]


    }
}
