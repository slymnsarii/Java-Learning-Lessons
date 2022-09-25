package day34_inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir class varsa veya
    ilerde bir child class'i parent yapmak isteyenler olabilir diyorsaniz
    o zaman variable ve method'larin access modifier'ini "protected" yapmalisiniz
    Boylece bizim child class'larimiz bizden istifade ederken,
    child olmayanlar bizim variable ve method'larimiza baska class'lardan ulasamazlar
     */

    protected int persNo;
    protected String isim="Isim belirtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ucretini statusune gore alir");
    }
}
