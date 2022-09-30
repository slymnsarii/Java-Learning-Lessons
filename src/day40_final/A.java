package day40_final;

public class A {
    protected String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji"; //eger okul adinin hic bir obje icin degistirilmemesini istiyorsak
                                              //static de yaparak her yerden ulasilmasini sagladik, nasıl olsa degistirilemiyor

    /*
    Bir variable final olarak tanimlandiysa
    baska class'lardan veya icinde oldugumuz class'dan
    bu variable'a baska deger atanmasi mumkun degildir

    Madem ki degeri degistirilemiyor
    genelde static de yaparak
    bu variable'a erisim kolaylastirilabilir

    Genelde static final yaptigimiz variable'larin isimleri BUYUK HARF ile baslar veya tamami BUYUK yazilir
     */

    final void finalMethod(){
        System.out.println("Final method'lar override edilemez");
        /*
        Bir method'u final olarak isaretlerseniz bu method degistirilemez demektir.
        (override edilemez)
         */
    }
}
