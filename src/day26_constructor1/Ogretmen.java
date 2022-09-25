package day26_constructor1;

public class Ogretmen {

    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih belirtilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    /*
    Bir class kaliphane olarak olusturulduysa direk o zaman burada Constructur'a ihtiyac duyariz
    Constructor olusturdugumda default constructor yok olacagi icin
    1-Constructor olustururken hic bir variable'i secmeden "Select one" secerek(hic parametre olmadan)
    default constructor yerine parametresiz constructor olustururuz
    2-sonra tamamini secip bir constructor olustururuz boylece this.'li olarak olustururum(tum parametreler)
    3-veya branslari dahil etmeden de bir constructor olusturabilirim(istedigim parametreler)
    4-Bir de toString method'u koyabiliriz ogretmenin ozelliklerini yazdirmak istersek
    her seferinde ugrasmamak icin
     */

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim=" + isim  +
                "\nsoyisim=" + soyisim  +
                "\ndogumTarihi=" + dogumTarihi  +
                "\nbrans=" + brans +
                "\nyanBrans=" + yanBrans ;
    }
}
