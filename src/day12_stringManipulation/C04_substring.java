package day12_stringManipulation;

public class C04_substring {
    public static void main(String[] args) {

        String str="Java cok yasa";

        System.out.println(str.substring(3,4)); //a

        System.out.println(str.substring(5,7)); //co

        System.out.println(str.substring(6,6)); //"" hiclik olur 6'dan basla 6 dahil, ama 6.dahil degil o yuzden hiclik

        System.out.println("===");

        //System.out.println(str.substring(6,2)); //syntax hatasi(alti cizilmiyor) yok ama calisirken hata verir
                                                // StringIndexOutOfBoundsException

     //   String str2=23; //CTE(Compile Time Error) hatasi
                        //Kirmizi cizmiyorsa Run'da hata veriyorsa RTE(Run Time Error)


    }
}
