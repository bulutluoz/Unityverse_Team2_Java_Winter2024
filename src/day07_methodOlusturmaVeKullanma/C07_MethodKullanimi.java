package day07_methodOlusturmaVeKullanma;

public class C07_MethodKullanimi {

    public static void main(String[] args) {

        // verilen iki sayinin carpimini yazdirin
        System.out.println(C05_MethodOlusturma.carpimSonucu(7, 8)); // 56

        // farkli sekillerde verilmis olan isim ve soyismi
        // ilk harfleri buyuk, kalanlar kucuk olacak sekilde yazdirin

        System.out.println(C06_MethodOlusturma.isimSoyisimDuzenle("KEMal", "OZDEmir")); // Kemal Ozdemir

        // farkli sekillerde verilmis olan isim ve soyismi
        // ilk harfleri buyuk, kalanlar kucuk olacak sekilde duzenleyip kaydedin

        String duzenlenmisIsim = C06_MethodOlusturma.isimSoyisimDuzenle("YAKUP", "Tastan");

        System.out.println(duzenlenmisIsim); // Yakup Tastan

    }
}
