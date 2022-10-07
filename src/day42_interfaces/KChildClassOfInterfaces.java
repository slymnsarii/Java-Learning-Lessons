package day42_interfaces;

public class KChildClassOfInterfaces implements I01_Interfaces,I02_Interfaces{

    /*
    Bir class'i bir interface'e child yapmak icin imlement keyword kullanilir
    imlements dedikten sorna virgul yazarak istedigimiz kadar interface ekleyebiliriz
    Bir interface bir class'i parent edinemez
    class--extends-->class, class--implements-->interface, interface--extends-->interface

     */



    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI); //20
        System.out.println(I01_Interfaces.SAYI); //30
        System.out.println(ISIM); //Yildiz Koleji //ISIM variable'indan bir tane oldugu icin karisiklik olmaz
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
