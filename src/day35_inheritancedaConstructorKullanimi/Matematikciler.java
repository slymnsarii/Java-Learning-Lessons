package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen{

    Matematikciler(){
        System.out.println("Matematik parametresiz const");
    }

    Matematikciler(String isim){
        this(); //bu class'daki parametresiz contructor'a git demek
        System.out.println("Matematik parametreli const");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }

    /*
    this() constructor call, icinde bulunulan class'daki contructorlari,
    super() constructor call ise parent call'da buluna const'lari cagirir

    this() veya super() parametre yapisina uygun const bulamazsa
    Java CTE verir

    constructor konusunda gordugumuz this.(nokta)
    o class'daki instance variable'lari refere ediyordu

    inheritance'da da super. vardir
    super. parent class'daki instance'lari refere eder
     */
}
