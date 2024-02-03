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

        System.out.println(car2);
        // Car ozellikler : marka='marka girilmedi', model='model girilmedi', renk='renk girilmedi', yil=2000, fiyat=5000

        C02_Car car3 = new C02_Car(2020,17000);

        System.out.println(car3);
        // Car ozellikler : marka='marka girilmedi', model='model girilmedi', renk='renk girilmedi', yil=2020, fiyat=17000

        C02_Car car4 = new C02_Car();
        System.out.println(car4);
        // Car ozellikler : marka='marka girilmedi', model='model girilmedi', renk='renk girilmedi', yil=1900, fiyat=0



        // marka, model ve fiyat bilgilerini girebilecegimiz
        // bir constructor olusturalim

        C02_Car car5 = new C02_Car("Mercedes","E200",10000);

        System.out.println(car5);
        // Car ozellikler : marka='Mercedes', model='E200', renk='renk girilmedi', yil=1900, fiyat=10000



        // tum ozellikleri barindiran bir constructor kullanalim

        C02_Car car6 = new C02_Car("Nissan","Micra","Kirmizi",2021,13000);
        System.out.println(car6);
        // Car ozellikler : marka='Nissan', model='Micra', renk='Kirmizi', yil=2021, fiyat=13000







    }
}
