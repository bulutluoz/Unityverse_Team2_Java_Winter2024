package day12_constructors;

public class C02_Car {
    // bir araba satis sitesi icin
    // bir uygulama yaptigimizi dusunelim

    String marka = "marka girilmedi";
    String model = "model girilmedi";
    String renk = "renk girilmedi";
    int yil = 1900;
    int fiyat ;



    // Java tum class'larda default cons. olusturur
    // ama biz yil ve fiyat degerlerini girebilecegimiz
    // bir constructor istiyordsak,
    // bunu kendimiz olusturmaliyiz

    // ANCAK biz gorunur bir constructor olusturdugumuzda
    // Java'nin default cons'i sildigini UNUTMAMALIYIZ
    // Yani biz gorunur bir constructor olusturdugumuzda
    // baska bir hataya sebep olmamak icin
    // default cons. yerine PARAMETRESIZ bir cons. da olusturmaliyiz

    C02_Car(){  // bunu default cons'in yerine olusturduk

    }

    C02_Car(int yl, int fyt){

    }





    // menu/code/generate/toSting secip
    // class'daki variable'lardan olmasini istediklerimizi
    // isaretliyoruz
    @Override
    public String toString() {
        return "Car ozellikler : " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }
}
