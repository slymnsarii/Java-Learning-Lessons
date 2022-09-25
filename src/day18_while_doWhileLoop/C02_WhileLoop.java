package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin
        ve bu sayilarin toplamini yazdirin
         */

        int input=45456;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while (input>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;
        }
        System.out.println(temp+" sayisinin rakamlar toplami "+rakamlarToplami);
    }
}
