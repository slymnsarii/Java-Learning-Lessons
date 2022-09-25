package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *

         */

        //3 tane * yaz yan yana
        for (int i = 1; i <=3 ; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        //4 tane * yan yana yazin
        for (int i = 1; i <=4 ; i++) {
            System.out.print("* ");
        }

        System.out.println("");

        //bu tur durumlarda ic ice(nested) loop kullanmak gerekir

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
                
            }
            System.out.println("");

        }
    }
}
