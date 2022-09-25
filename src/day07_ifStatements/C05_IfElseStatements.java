package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if (harf>='a' && harf<='z' || harf>='A' && harf<='Z'){
            System.out.println("girilen karakter bir harftir");
        }else {
            System.out.println("girilen karakter harf degildir, yeni karakter giriniz");
        }
    }
}
