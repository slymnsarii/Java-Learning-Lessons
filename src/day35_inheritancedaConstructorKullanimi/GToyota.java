package day35_inheritancedaConstructorKullanimi;

public class GToyota {

    GToyota(){
        System.out.println("Toyota parametresiz const");
    }

    GToyota(String isim){
        //super(isim); burda extends olmadigi icin burda super(); constructor call'i Java kabul etmez
        System.out.println("Toyota parametreli const");
    }

}
