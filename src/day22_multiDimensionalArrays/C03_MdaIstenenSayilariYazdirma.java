package day22_multiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {

        /*
        Verilen 2 katli bir multi-dimentional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz

        int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        [0][0] + [1][1] + [2][2] + .....
         */

        int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        int istenenToplam=0;

        //2 kat array oldugu icin 2 katli for loop olustururuz
        for (int i = 0; i < sayilar.length ; i++) { //outer
            for (int j = 0; j < sayilar[i].length; j++) { //inner


                if (i==j){
                    System.out.println(sayilar[i][j]);
                    istenenToplam+=sayilar[i][j];

                }
                
            }

        }

        System.out.println("istenen toplam : "+istenenToplam);//12


    }
}
