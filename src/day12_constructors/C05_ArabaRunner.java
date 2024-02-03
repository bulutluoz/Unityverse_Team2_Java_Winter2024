package day12_constructors;

public class C05_ArabaRunner {

    public static void main(String[] args) {

        // araba1'in ozellikleri nelerdir ?

        C04_Araba araba1 = new C04_Araba();

        System.out.println(araba1);
        // Araba ozellikleri : marka='marka girilmedi', model='Corolla', renk='renk girilmedi', yil=1900, fiyat=0


        C04_Araba araba2 = new C04_Araba(2020,17500);

        System.out.println(araba2);
        // Araba ozellikleri : marka='marka girilmedi', model='model girilmedi', renk='renk girilmedi', yil=2020, fiyat=10000

    }
}
