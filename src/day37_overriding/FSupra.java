package day37_overriding;

public class FSupra extends EToyota{

    @Override
    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private method'lar override edilemez,
        Eger child class'da parent class'daki private method ile
        ayni signature'da bir method olusturursaniz bu overriding method olmaz
        yani parent istedigi ozelligini child'dan saklayabilir
         */
    }

    @Override
    void motor() {
        /*
        @Override notasyonu Java'ya bir gorev verir
        Java, bu notasyonla birbirine bagli olan 2 method'u surekli kontrol eder
        Eger parent class'daki overridden method'u silerseniz CTE verir

        @Override notasyonu kullanmak mecburi degildir
        Eger Overidding silinirse kodun CTE vermesini istersek @Override notasyonunu kullanmaliyiz
         */
    }
}
