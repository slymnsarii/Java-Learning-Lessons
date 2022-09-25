package day20_Arrays;

public class C01_LocalVariables {
//Local variable'lar method'larin icerisinde olusturulan variable'lardir
    //Hangi method'da olusturduysan o method'da kullanirsin

    public static void main(String[] args) {
        int sayi=10;
        //System.out.println(sayiMethod);   SayiMethod method1'de olusturulmus local variable'dir

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            
        }
      //  System.out.println(i); i loop'da olusturulmus local variable'dir
        //sadece loop icerisinde kullanilabilir

        //static int sayiStatic=20; static keyword sadece class level'da kullanilabilir,
        //method'larin icerisinde static variable TANIMLANAMAZ
        //Static variables class icerisindeki her yerden kullanilir


    }

    public static void method1(){
      //  System.out.println(sayi);
        //sayi main method'da olusturulmus local bir variable'dir ve sadece main method'da gecerlidir

        int sayiMethod=20;
    }
}
