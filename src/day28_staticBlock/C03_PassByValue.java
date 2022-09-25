package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=25; //dinamik yapmak icin atadim ve method'a ekledim
        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat : "+indirimliFiyat);
        System.out.println("indirimli fiyat : "+indirimliFiyat);
        System.out.println("indirimli fiyat : "+indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyati,double indirimOrani) {
        /*
        Ben Java'ya bir method olustur dedigimde main'deki satisFiyati'nin aynisini(isminin aynisi)olusturdu(16.satir parametresi)
        (karisiklik olmasin diye, istesem ben burdaki satisFiyati'nin adini xyz'de yapabilirdim)
        Ama Java variable'i buraya gecirmez variable'in degerini(100) gecirir
        Bundan sonra bu Scope'da kullandigim satisFiyati ve satisFiyati uzerinden yapacagim degisiklikler bu variable'i baglar
        Main method'daki variable'i degil, main icersinde indirimliFiyat'i tekrar tekrar yazdirsam hep ayni kalir degisiklik
        yapilmazsa main icerisinde cunku satisFiyati 100 orda
         */
        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;
    }
}
