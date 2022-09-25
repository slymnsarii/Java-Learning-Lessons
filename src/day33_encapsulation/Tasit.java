package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
        //normalde private olan tasit turune baska class'dan ulasamayacagim icin, bu method'un icerisinde; bu method
        //bu class'daki private bilgilere ulasabilir ve tasitTuru'ne ulasiyor onu ordan alip burda donduruyor(return)
        //yani normalde private variable'a ulasamazdim, ama onun yerine  o class'daki public araciya ulastim
        //public araci kendi class'indaki private bilgiyi aldi TasitRunner'a getirdi

        //Yani getter method'u da tek satirlik islem yapiyor, baska class'larin private oldugu icin erisemedigi
        //tasitTuru bilgisini, class icinden alip istenen farkli class'lara return ediyor.

        //Yani getter ve setter'lar private oldugu icin erisim izni olmayan bilgileri, diger class'larin erisimine aciyorlar
    }

    public void setTasitTuru(String tasitTuru) {
              this.tasitTuru = tasitTuru; //eger atanacak deger ile variable ismi ayni ise this kullaniriz
        // bu instance tasitTuru  = bu method'un bize gonderdigi parametre
        //return olmadigi icin bu method'un cagrildigi TasitRunner class'inda yazdirilamaz
        //1 satirlik islem var:Gonderdigimiz argument'i("Tir") instance'a atama
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
        //boolean variable'lar icin olusturulan getter methodlarinin ismi isVariablaIsmi seklinde olur
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
