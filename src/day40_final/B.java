package day40_final;

final public class B extends A{
    public static void main(String[] args) {

        B obj=new B();
        obj.isim="Alp";

        System.out.println(A.OKUL);

        System.out.println(Integer.MIN_VALUE);//Java bunlari final olarak olusturmustur
        System.out.println(Integer.MAX_VALUE);

        /*
        Bir class final olarak belirlenirse
        o class inherit edilemez
         */
    }
}
