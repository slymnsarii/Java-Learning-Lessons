package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};

        //Array'in tamamini yazdiralim

        System.out.println(Arrays.toString(sayilar)); //[1, 2, 3, 4, 5, 6, 7]//Java otomatik olarak , ve bosluk birakiyor

        //Array'in tum elementlerini yazdirin

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+" "); //1 2 3 4 5 6 7
        }
        System.out.println("");
        //Java'nin virgulleri nasil yaptigini gostermek icin
        for (int i = 0; i < sayilar.length; i++) {
            if (i< sayilar.length-1){
                System.out.print(sayilar[i]+", ");
            }else {
                System.out.println(sayilar[i]);
            }

        }
    }
}
