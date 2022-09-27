package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {

        int a=10000;
        int b=50;
        int sayac=1;
        while (sayac<100){

            /*
            try blogu yapmaya calistiginiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanilir
            catch'den sonraki parantez karsilasmayi bekledigimiz Exception turunu Java'ya soylemek icin kullanilir
            catch blogu :Java'ya soyledigimiz exception(istisnai durum) gerceklesirse Java'nin yapmasini istedigimiz islem

            catch blogunun onundeki paranteze karsilasmayi bekledigimiz exception'i yazabilir
            veya her turlu exception'da devreye girmesini istiyorsak
            tum exception'larin parent'i olan Exception yazabiliriz
             */

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("Payda 0 oldu, dikkatli ol");
            }


            b--;
            sayac++;
        }
    }
}
