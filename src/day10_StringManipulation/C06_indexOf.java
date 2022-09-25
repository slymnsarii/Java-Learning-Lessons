package day10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); //5
        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("t")); // bana integer donduruyor
                                                //int'de yok diye bir deger bulunmuyor
                                                //0 dersek J'nin index'idir
                                                //ama negatif deger donerse biz aranan String'in str'da olmadigini anlariz
                                                //Java hep -1 dondurmeyi tercih etmistir

        String str5=" rqweıfaasdjfmafdsıfeı;fdsfeof,fsda35dfasf46";

        //str5'de p harfi kullanilmis midir?
        if (str5.indexOf("d")==-1){
            System.out.println("str5 de karakter kullanilmamis");
        }else
            System.out.println("str5 de karakter kullanilmis");
    }
}
