package day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_ScannerKullanimiChar {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //		girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz...");

        int yas = scanner.nextInt();

        System.out.println("Lutfen isminizi giriniz...");
        // String isim = scanner.nextLine(); ismin sadece ilk karakterini istediginden char olarak alalim
        scanner= new Scanner(System.in);
        char isimIlkHarf = scanner.nextLine().charAt(0); // istenen index'deki karakteri getirir

        System.out.println("Lutfen soyisminizi giriniz...");

        String soyisim = scanner.nextLine();

        System.out.println("girilen bilgile : " + isimIlkHarf +" "+ soyisim + ", "+yas);

    }
}
