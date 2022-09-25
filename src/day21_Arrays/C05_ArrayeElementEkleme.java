package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String sinifList[]={"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifList=elementEkle(sinifList,eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));
        //yeniList'i yazdirmam cunku eskli listeye yeni listeyi ekledim yukarda eklenecekIsim'den
    }

    public static String[] elementEkle(String[] sinifList, String eklenecekIsim) {//3 elemanli bir array'i 4 elamnli yapamayiz,
                                            // yapmak icin yeni bir array olusturup orada 1 fazlasini olusutururuz
        String yeniSinifList[]=new String[sinifList.length+1];//[null, null, null, null] eski listeden 1 eleman fazla uzunlukta
        for (int i = 0; i < sinifList.length ; i++) { //eski array'e gore dusunuyoruz
            yeniSinifList[i]=sinifList[i];

        }
        //oncelikle eski listedeki tum elemanlari yeni listeye tasidim
        yeniSinifList[yeniSinifList.length-1]=eklenecekIsim;
        //son index'e eklenecek ismi atadim



        return yeniSinifList;
    }
}
