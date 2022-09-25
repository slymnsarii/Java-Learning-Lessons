package day21_Arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {

        int sayilar[]={5,7,1,6,5,7,4,3,9};
        //Array'i Arrays class'ini kullanarak natural sirali hale getiririz
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); //[1, 3, 4, 5, 5, 6, 7, 7, 9]
    }
}
