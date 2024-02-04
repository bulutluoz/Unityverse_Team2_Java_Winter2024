package day13_staticKeyword_PassByValue;

public class C06_PassByValue {

    public static void main(String[] args) {

        // verilen bir string'i
        // ilk harfi buyuk, kalanlar kucuk olacak sekilde duzenleyip
        // yeni halini bize donduren bir method olusturun

        String metin = "cankaya";

        System.out.println(metniDuzenle(metin)); // Cankaya

        System.out.println("orjinal metin : " + metin); //  orjinal metin : cankaya

    }

    public static String metniDuzenle(String metin){

        metin = metin.substring(0,1).toUpperCase() +
                metin.substring(1).toLowerCase();

        return metin;
    }
}
