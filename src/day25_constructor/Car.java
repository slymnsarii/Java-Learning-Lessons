package day25_constructor;

public class Car {
    /*
    Bu class bizim kaliphanemiz
    Bir araba olusturmak icin ihtiyacimiz olan
    variable ve method'lari bu class'da belirleriz

    sonra farkli class'larda araba olusturmamiz gerekirse
    bu class'dan bir obje olusturup
    burada belirlenen variable ve method'lara gore
    araba uretiriz
     */

    public String marka="Marka belirtilmedi"; // bu bizim kalibimiz oldugu icin buna atama yapmak zorunda degiliz
                 //ama eger parametre olarak marka girmediyse biz default deger olarak bir sey yazabiliriz(null yerine)
   public String model="Model belirtilmedi";
 public    int yil; //matematiksel islem yapmayacagim icin String olarak girebilirdim ama belli yil
                                        //araliklarini kapsayabilsin diye int yapalim
  public   int fiyat; //fiyat'a gore siralama yapamayiz String yaparsam, o yuzden int yaptik


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar");
    }
}
