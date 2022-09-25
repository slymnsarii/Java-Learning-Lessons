package day26_constructor1;

import day25_constructor.Car;

public class Araba {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public    int yil;
    public   int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
       /*
       burda yukaridaki variable'lara ArabaRunner'imdaki araba2 objesinde
       ne girersem burda olusturdugum method'da direk atansin diye
       method'daki argumentleri Araba class'indaki variable'lara atadim
       Boylece dinamik olarak daha once atanmis degerler yerine
       benim istedigim degerler olacak
        */
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    public Araba(){

    }
      /*
        biz herhangi bir constructor olusturdugumuzda
        Java default constructor'i siler
        eger biz projemizde bir sorun yasanmasini istemiyorsak
        mutlaka default constructor yerine
        parametresiz bir constructor olusturmaliyiz
         */


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar");
    }
    }




