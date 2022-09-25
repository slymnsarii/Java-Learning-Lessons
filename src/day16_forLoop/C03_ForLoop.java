package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

         */

        int baslangic = 10, bitis = 30;
        for (int i = baslangic; i <= bitis; i++) {

            if (i < bitis) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
            }

        }
    }
}
