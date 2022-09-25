package day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen 2 integer'i toplayip sonucunu yazdiran bir method olusturalim

        int input1=10;
        int input2=20;

        //method 4 adimda olusturulur
        //1.adim:method call
        //2.adim:argument eklenmesi gerekiyorsa ekleyelim
        //       eger method'un return type'i void'den farkli olacaksa
        //       bir variable olusturup, method call'u assign edelim

        topla(input1,input2); //1.adim


    }

    public static void topla(int input1, int input2) { //2.adim

        //3.adim:method deklarasyonunda degistirilmesi gereken
        //bolumleri degistir(access modifier(private,public..), return type(void..) ... vb)

        //4.adim:eger return type void disinda bir seyse
        //return keyword'u ve donecek degeri hesaplamaliyiz
        System.out.println("Girilen 2 sayinin toplami : "+(input1+input2));

    }
}
