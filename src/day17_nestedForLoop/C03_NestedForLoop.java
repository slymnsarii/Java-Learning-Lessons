package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen en ve boy degerine gore
        *'lardan olusan bir dikdortgen olusturalim
        yukseklik:3 boy:4
        ****
        ****
        ****
         */

        //dış loop 1'den yukseklige kadar gidecek(satır)(4satir)
        //ic loop 1'den baslayip boya kadar gidecek(sutun)(8sutun)
        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
