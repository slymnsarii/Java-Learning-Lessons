package day04_DataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=132;

        byte sayi2= (byte) sayi1;
        System.out.println(sayi2); //50

        /*
        Genis data turundeki degeri, dar data turundeki variable'a atamak isterseniz
        Java sizin genis data turundeki degerin, dar data turunun sinirlarina uyup uymayacagini
        calistirana kadar bilmez ama Java risk almaz
        Riski sıfıra indirmek icin burda bir sorun olursa
        sorumlulugu kabul etmemizi bekler
        bunun icin degerin onune parantez icerisinde istedigimiz data turunu
        yazmamiz yeterlidir.

        Bu riski ustlendigimizde 3 durum olusabilir
        1-bizim degerimiz dar kalip degerlerine uygun olursa hic bir kayip olmadan cast olur
        2-double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
        3*-genis kalip degeri dar kaliba koydugunuzda, sinirlari asan durumlarda veri baskalasabilir
         */
    }
}
