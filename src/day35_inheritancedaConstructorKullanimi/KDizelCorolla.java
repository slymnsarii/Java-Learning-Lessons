package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{

    KDizelCorolla(){
        System.out.println("DizelCorolla parametresiz const");
    }

    KDizelCorolla(String isim){
        super(isim); //parametreli cont'in icine parametreli const call'i kendimiz yazdik o yuzden java yeni super(); olusturmaz
        System.out.println("DizelCorolla parametreli const");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1=new KDizelCorolla("Hasan");

    }
}
