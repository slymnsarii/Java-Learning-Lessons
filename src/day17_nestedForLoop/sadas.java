package day17_nestedForLoop;

public class sadas {
    public static void main(String[] args) {
        /*
        A*****
        AN****
        ANK***
        ANKA**
        ANKAR*
        ANKARA
         */

        String input="ANKARA";
        int u=input.length();

        for (int i = 0; i <u ; i++) {

            for (int k = 0; k <=i ; k++) {
                System.out.print(input.charAt(k)+" ");

            }
            for (int j = 0; j < u; j++) {
                if (i<j){
                    System.out.print("* ");
                }

            }

            System.out.println("");
        }

    }
}
