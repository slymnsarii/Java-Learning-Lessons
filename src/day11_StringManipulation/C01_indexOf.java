package day11_StringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        /*Verilen bir String'de Herhangi bir String veya char'in
        ilk kullanildigi index'i bize dondurur
         */

        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf('j')); //-1
        System.out.println(str.indexOf("mek")); //10

        //eger istedigimiz index'den sonrasini kontrol etmek istersek
        //o zaman ayni method'u iki parametreli olarak kullanabiliriz


        System.out.println(str.indexOf('g',6)); //6 //yazilan index'den baslar
        System.out.println(str.indexOf('g',6));
        //yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        //2. e'yi bulabilmek icin 1. e'nin index'ine ihtiyacim var

        int ilke=str.indexOf("e");
        System.out.println("ilk e = "+ilke);
        int ikincie=str.indexOf("e",ilke+1);
        System.out.println("ikinci e = "+ikincie);

        //eger 2.e varsa 3. e'nin olup olmadigini
        //ve varsa index'ini yazdiralim

        if (ikincie==-1){
            System.out.println("verilen str'da 2.e yok");
        }else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da 3.e yok");
            }else {
                System.out.println("verilen str'da 3.e'nin index'i : "+ucuncue);
            }
        }

    }
}
