package day04_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        char harf='a';
        char yeniHarf=(char)(harf+1); //kod bu durumda(=harf+1) once sagdaki islemi yapar
                                //char yeniHarf=97+1 --> 98
                                //char bir variable 98 olamayacagi icin Java hata verir
                                //islemin sonucunun bir sonraki char olması icin basina (char) ekleriz
                                //bu isleme data casting denir

        System.out.println(yeniHarf);

        /*
        Bazen bir variable'a olusturuldugu data turu dişindan deger atanabilir
        Bunlardan bazisini Java otomatik olarak kabul eder
        Java eger bu deger atamasinda sorun olusacagini
        (data kayiplarinin olabilecegi veya datanin baskalasacagini) gorurse
        bu durumda otomatik olarak kabul etmez
        sizden eger bu atamayi istiyorsaniz sorumlulugu almanizi bekler
         */
        int sayi1=(int) 7.3;

        System.out.println("sayi1 : "+sayi1); //7

        double sayi2=10;
        System.out.println("sayi2 : "+sayi2); //10.0
        int sayi3='c';
        System.out.println("sayi3 : "+sayi3); //99
        char harf2=98;
        System.out.println("harf2 : "+harf2); //b




    }
}
