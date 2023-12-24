package day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_ScannerKullanimi {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini alip
        // tamami buyuk harf olacak sekilde yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        // String isimSoyisim = scan.next(); // kullanicinin girdigi metnin ilk bosluga kadar olan kismini alir
                                          // Orn : kullanici Ali Can girerse, bu method sadece Ali'yi alir

        String isimSoyisim = scan.nextLine(); // girilen satirdaki tum metni alir

        System.out.println(isimSoyisim.toUpperCase());
    }
}
