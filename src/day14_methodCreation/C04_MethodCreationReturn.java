package day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Verilen isim ve soyismin ilk harfi buyuk
        geriye kalanlari * seklinde degistirip
        bize bu halini donduren bir method olusturalim
        Not:programin ilerleyen kisimlarinda isim ve soyisimi bu sekilde kullanmak istiyoruz
         */

        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);//Bunu yaparsan onceden return type'i void yapiyordu ama simdi String yapti
                                                //Alta yazacagim soutlari yazmadan once  return'de yazacak olan//E*** B******
        System.out.println(isim + " "+ soyisim); // Enes Bozkurt
        System.out.println(gizliIsim); // E*** B******

    }

    public static String isimGizle(String isim, String soyisim) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyisim);

        return isim+" "+soyisim; // bunu methodun icerisinde de yazdirabilirsin ama bu methodun amaci bir degisiklik yapip
                                //degisiklik halini dondurmek
    }
}
