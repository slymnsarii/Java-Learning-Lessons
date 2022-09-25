package day17_nestedForLoop;

public class C10 {
    public static void main(String[] args) {

        boolean dogruMU=false;
        int sayi=15;

        while (!dogruMU){

            if (sayi>20){ //sart saglandiginda while loop'un condition'u false olmali
                System.out.println("Bu islem tamam");
                dogruMU=true;
            }else { //sart saglanmadigi muddetce while loop'un kontrol ettigi degisken degismeli
                System.out.println("istenen sart saglanamadi " +sayi);
                sayi++;
            }
        }
    }
}
