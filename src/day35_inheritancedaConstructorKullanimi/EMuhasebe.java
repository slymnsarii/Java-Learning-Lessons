package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{

    EMuhasebe(){
        System.out.println("Muhasebe parametresiz const");
    }

    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli const");
    }
}
