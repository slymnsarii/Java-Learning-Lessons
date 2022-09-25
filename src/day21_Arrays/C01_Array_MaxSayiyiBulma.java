package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {
        
        //Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int sayilar[]={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0]; //maxSayi diye bir variable olusturduk buna bir deger atamaliydik o yüzden ilk elemani atadik
                                //hiclik olmazdi, 0'da atanmazdi cunku sayilar negatif olabilirdi
        for (int i = 1; i < sayilar.length; i++) { //1'den baslama sebebi 0.index'deki elemanı zaten atadık max olarak
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
            
        }


        System.out.println("Array'deki en buyuk sayi : "+maxSayi);
    }
}
