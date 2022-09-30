package day40_final;

public class DChildOfAbstract extends CAbstract{
    @Override
    void carpma() {
        /*
        Abstract class'lar child class'larin sahip olmasi gereken mecburi ozellikleri belirlerler
        (Gunluk hayatimizdaki standartlar gibi)
        Abstract bir class'i parent edinen tum child'lar
        parent abstract class'daki tum abstract method'lari override etmek zorundadirlar
        icinde islem yapmasan da olur ama bu method'lar mutlaka bu class'da olmalidir
         */
    }

    @Override
    void bolme() {

    }
}
