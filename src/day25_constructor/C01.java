package day25_constructor;

public class C01 {
    /*
    Java OOP concept kullandigi icin olusturulan her bir class'in
    ihtiyac oldugunda obje uretebilmesine uygun dizayn etmistir
    ama her class'dan obje uretilmeyebilir

    bunun icin Java ihtiyac halinde kullanilmasi icin
    her class'da default bir constructor koymustur

    bu default constructor Class'dan obje olusturuldugunda otomatik olarak calisir

    ornegin bu Class'da constructor gorunmemesine ragmen
    C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik

    OZET:
    1-Bizim bir obje olusturmak icin mutlaka constructor'a ihtiyacimiz var
    2-Constructor'a ihtiyacimiz olan ozel parametreleri yazmazsak Java bize standart urun uretip yollar
    3-Bir Class'da gorunurde bir constructor yoksa bile Java gorunmeyen bir sekilde ihtiyac halinde Java,
    o default constructor'i devreye sokar
     */

    int sayi;

    public void deneme(){
        System.out.println("C01 deneme method'u calistir");
    }
}
