package day13_staticKeyword_PassByValue;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane pers1 = new C01_Hastane();

        System.out.println(pers1.persIsmi); // Isim belirtilmedi
        System.out.println(pers1.persAdres); // Adres girilmedi
        System.out.println(pers1.persTel); // Tel girilmedi


        System.out.println(pers1.hastaneIsmi); // Yildiz Hastanesi

        System.out.println(C01_Hastane.hastaneIsmi); // Yildiz Hastanesi

        pers1.persIsmi = "Ali";
        pers1.persAdres = "Cankaya";
        pers1.persTel = "5322343434";

        pers1.hastaneIsmi = "Cankaya Hastanesi";

        System.out.println(pers1.persIsmi); // Ali
        System.out.println(pers1.persAdres); // Cankaya
        System.out.println(pers1.persTel); // 5322343434

        System.out.println(pers1.hastaneIsmi); // Cankaya Hastanesi

        C01_Hastane pers2 = new C01_Hastane();

        System.out.println(pers2.persIsmi); // Isim belirtilmedi
        System.out.println(pers2.persAdres); // Adres girilmedi
        System.out.println(pers2.persTel); // Tel girilmedi

        System.out.println(pers2.hastaneIsmi); // Cankaya Hastanesi

        pers2.persIsmi = "Ayse";
        pers2.persAdres = "Sincan";
        pers2.persTel = "5442343434";

        pers2.hastaneIsmi = "Sincan Hastanesi";


        System.out.println(pers2.persIsmi); // Ayse
        System.out.println(pers2.persAdres); // Sincan
        System.out.println(pers2.persTel); // 5442343434

        System.out.println(pers2.hastaneIsmi); // Sincan Hastanesi
        System.out.println(pers1.hastaneIsmi); // Sincan Hastanesi


    }
}
