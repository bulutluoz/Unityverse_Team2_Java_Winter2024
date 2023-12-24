package day02_scanner_dataCasting;

import java.util.Scanner;

public class C05_Swap {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip kaydedin,
        //                     sonra kaydettiginiz variable'larin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi1 'i giriniz...");

        double sayi1 = scanner.nextDouble();

        System.out.println("Sayi2'yi giriniz...");

        double sayi2 = scanner.nextDouble();

        // once bos bir variable olusturalim
        double temp = 0;

        // sayi2'nin degerini temp'e atayalim

        temp = sayi2;

        // sayi1'in degerini sayi2'ye atayalim

        sayi2 = sayi1;

        // temp'in degerini sayi1'e atayalim

        sayi1 = temp;


        System.out.println("Verdiginiz sayilarin yerini degistirdim");
        System.out.println("Sayi1 : " + sayi1 + ", Sayi2 : " + sayi2 + " oldu.");
    }
}










