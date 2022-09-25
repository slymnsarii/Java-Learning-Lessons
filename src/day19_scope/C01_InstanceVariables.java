package day19_scope;

public class C01_InstanceVariables {
        /*
        Class icerisinde her yerden kullanmak istediginiz variable'lari
        class level'da(Class'in icinde ama methodlarin disinda)
        genellikle class level variable'lar class'in basinda olusturulur(sart degil)

        class level'daki variable'lar icin 2 scope vardir
        1-Static variables (Class variable'lari da denir)
        2-Instance (static olmayan) variables (obje variable'lari da denir)
         */

    int instSayi=20; //static olmayip class level'da oldugu icin instance variable'dir.


    public static void main(String[] args) {
        int sayi=10;
       // System.out.println(instSayi); //main method static kulubune uye ama instSayi uye degil
                                        // o yuzden main method'dan direk cagiramazsin
        /*
        Instance variables static olmadigi icin static kulub'e uye olan main method'dan direk kullanamayiz
        instance variable'larin diger adi object variable'dir
        dolayisiyla object olusturursaniz, instance variable'lari her yerden kullanabilirsiniz
        Obje olusturmak icin --> ClassIsmi objeAdi=new ClassIsmi();
         */

        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : "+obje1.instSayi); // obje olusturup sout icinde
                                                    // objeIsmi.(static olmayan)ınstance variable yazarsak calisir //20
        obje1.instSayi=30;
        System.out.println("obje 1 degistikten sonra : "+obje1.instSayi); //30

        //Bu class'dan da istedigimiz kadar obje olusturabiliriz ama ismini degistirmeliyiz
        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : "+obje2.instSayi); //20 burda yeni object oldugu icin
                                                                        // instSayi ilk atandigi degeri yazdirir

        System.out.println("obje 1 degistikten sonra : "+obje1.instSayi);// 30

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degismeden once : "+obje2.instSayi); //20

        //Her obje olustugunda instance (obje) variable'inin ilk atanan degerini alir


    }



    public static void staticMethod(){
        //System.out.println(sayi);
        /*
        Bir method'un icerisinde olusturulan variable sadece o method'un icinden kullanilabilir.(Local variables)
         */

        /*
        intSayi=30;
        instance variable'lara main method disindaki static method'lardan da direk ulasamayiz
        object olusturursak ulasiriz
         */

        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println("obje 4 : "+obje4.instSayi); //20


    }



    public void staticOlmayanMethod(){

        System.out.println(instSayi);
        /*
        instance variable'lar class icerisindeki static olmayan method'lardan direk kullanilabilir.
         */

    }
}
