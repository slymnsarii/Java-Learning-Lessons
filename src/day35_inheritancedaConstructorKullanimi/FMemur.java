package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{

    /*
    Extends keywords kullanilan class'larda ister default constructor bulunsun
    istersek de biz yeni constructor(lar) olusturalim
    Java constructor'in ilk satirina super(); constructor call yazar

    super(); constructor call, default constructor'a benzer
    gorunmese de orda vardir calisir, ancak biz ilk satira farkli bir constructor call yazarsak
    Java super(); constructor'i siler.

    Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak Java'nin default oalrak olusturdugu
    constructo call her zaman parametresizdir --> super();


     */

    FMemur(){
        //burda gizli bir super(); vardir extends oldugu icin FMemur() calisma sirasi geldiginde
        //burdaki super(); calistiginda burdan Emuhasebe class'indaki parametresiz const'a gider ve
        // orda da extends  durumu varsa islem oyle devam eder
        System.out.println("Memur parametresiz const");
    }

    FMemur(String isim){
        System.out.println("Memur parametreli const");
    }

    public static void main(String[] args) {

        FMemur mmr1=new FMemur();//parametresiz const'a gider
    }
}
