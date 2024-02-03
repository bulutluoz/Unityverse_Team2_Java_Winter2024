package day12_constructors;

public class C03_CarRunner {

    public static void main(String[] args) {

        C02_Car car1 = new C02_Car();

        System.out.println(car1);
        // C02_Car{marka='marka girilmedi', model='model girilmedi', renk='renk girilmedi', yil=1900, fiyat=0}
        //Car ozellikler : marka='marka girilmedi', model='model girilmedi', renk='renk girilmedi', yil=1900, fiyat=0

        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.renk = "Mavi";
        car1.fiyat = 10000;


        System.out.println(car1);
        // Car ozellikler : marka='Toyota', model='Corolla', renk='Mavi', yil=1900, fiyat=10000


        // araba olusturulurken, yil ve fiyat degerlerini
        // girebilecegimiz bir constructor olusturalim

        C02_Car car2 = new C02_Car(2000, 5000);
    }
}
