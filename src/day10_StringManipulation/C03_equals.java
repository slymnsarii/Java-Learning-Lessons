package day10_StringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali CAN";
        String str3="Ali Can"+"";
        String str4="Ali Can";
        String str5=new String("Ali Can"); //n-primitive old. new String olarak yazabiliriz

        System.out.println(str1==str2); //false
        System.out.println(str1==str3); //true
        System.out.println(str1.equals(str3)); //true

        System.out.println(str1==str5); //false
        System.out.println(str1.equals(str5)); //true

        System.out.println(str1.equals(str4)); //true

        System.out.println(str3.equals(str5)); //true metinsel ifadeler ayni old. icin kesinlikle true olur
        System.out.println(str3==str5); //false

        /*
        String'lerde ayni String olsa bile == her zaman calismaz
        emin olmak isterseniz equals method'unu kullanmalisiniz

        equals() kullandigimizda dikkat edecegimiz TERK SEY metinlerin bire bir ayni olmasidir,
        ayni ise kesinlikle true, farklilik varsa kesinlikle false

        str1-str3 ve str1-str4 equals() ile yazarsan mutlaka true cikar
         */
    }
}
