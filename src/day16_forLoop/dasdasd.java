package day16_forLoop;



public class dasdasd {
    public static void main(String[] args) {
       // Girilen bir stringdeki a harfi sayısını bulunuz.
        //        ama  c harfine  gelirse döngüden çıkılsın

        String kelime="Java'da calismak cok guzel";
        char harf='a';
        int toplam=0;

        for (int i = 0; i <kelime.length() ; i++) {

            if (harf==kelime.charAt(i)){
                toplam++;

            }else if ('c'==kelime.charAt(i)){
                i=i+kelime.length();
            }


        }
        System.out.println("toplam = " + toplam);
    }
}
