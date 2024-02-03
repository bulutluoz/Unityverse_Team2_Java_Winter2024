package day12_constructors;

public class C04_Araba {

    String marka = "marka girilmedi";
    String model = "model girilmedi";
    String renk = "renk girilmedi";
    int yil = 1900;
    int fiyat ;

    C04_Araba(){
        model = "Corolla";
    }

    C04_Araba(int yil, int fiyat){
        this.yil = yil;
        this.fiyat = 10000;
    }

    @Override
    public String toString() {
        return "Araba ozellikleri : " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }
}
