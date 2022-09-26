package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan Hizmetler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        Overriding child class'daki bir method'un
        parent class'daki ayni isimdeki method'u
        etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cikarmasidir.

        Overriding'i nerede dikkate aliyoruz?
        Bir obje olustururken data turu ve constructor farkli ise dikkate aliriz

        Eger bir obje olustururken
        data turu ve const farkli ise
        objenin ozelliklerini belirtirken 3 konuya dikkat cekmeliyiz
        1-Obje costructor'in oldugu class'da olusur
        2-Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
            bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
            orada da bulunamazsa CTE verir

            Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        3-Aranan ozellik method ise
        degeri yazdirmadan once
        overriding edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdiririz

         */

        BMuhasebe yh1=new EYanHizmetler();

        System.out.println(yh1.gunlukMesai); //gunluMesai variable old icin Muhasebe class'indan alir 8
        System.out.println(yh1.saatUcreti); // saatUcreti variable old icin Muhasebe class'indan alir 10
        yh1.maas(); //aramaya Muhasebe'den baslar(data turu Muhasebe old icin) ama override edildigi icin child class'da o yuzden YanHizmetler'de calisir
        yh1.ozelSigorta(); //aramaya Muhasebe'den baslar ama overide edilmis mi diye kontrol edilir, burda edilmedigi icin Muhasebe'den alir
        yh1.sigorta(); //Muhasebe'den aramaya baslar orda olmadigi icin parent olan Personel'e bakar
                        // ama override edilmis mi diye kontrol edilir child class'larda edilmedigi icin Personel'den calistirir
        System.out.println(yh1.isim); //variable olduklari icin Personel'den calistirir
        System.out.println(yh1.soyisim); //variable olduklari icin Personel'den calistirir
        System.out.println(yh1.departmant); //variable olduklari icin Personel'den calistirir
       // System.out.println(yh1.issizlikSigorta);//Aramaya Muhasebe'den baslayip sonra parent class'a bakariz orda da yoksa CTE verir
                                                    //Bulamadigimiz icin override edemez

    }
}
