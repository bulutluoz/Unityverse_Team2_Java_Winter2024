package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_ScannerKullanimi {
    public static void main(String[] args) {

        // Java'da kullanicidan deger almak icin Scanner kullaniriz
        // bu islemi yapmak icin 3 adim atmaliyiz

        // 1.adim : Scanner objesi olusturacagiz

        Scanner scanner = new Scanner(System.in);

        // 2.adim : Kullaniciya ne istedigini soyle

        System.out.println("Lutfen bir tamsayi giriniz");

        // 3.adim : scanner objesini kullanarak, kullanicdan istediginiz degeri alin
        //          ve uygun bir variable'a kaydedin

        int girilenSayi = scanner.nextInt();

        // kullanicinin girdigi sayinin 5 katini yazdirin

        System.out.println("Girdiginiz sayinin 5 kati : " + girilenSayi * 5);


    }
}
