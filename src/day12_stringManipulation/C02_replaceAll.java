package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {
        
        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        /*
        str'i Bugun Java cok guzel haline getirin
        replaceAll'deki all'un amaci ayni ozellikteki tum karakterleri almasidir
        butun sayilari sil
        butun ozel karakterleri sil
         */

        //Tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        //space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak bir String koyalim
        //"qazwsx"
        str=str.replace(" ", "qazwsx");
        System.out.println(str); //1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el
        str=str.replaceAll("\\W", "");
        System.out.println(str); //1Bu2gu3nqazwsxJavaqazwsxcokqazwsxg3uzel

        str=str.replaceAll("\\d", "");

        //istenmeyen ozel karakter ve sayilardan kurtulduk
        //simdi space'leri geri getirelim

        str=str.replace("qazwsx", " ");

        System.out.println(str); //Bugun Java cok guzel

    }
}
