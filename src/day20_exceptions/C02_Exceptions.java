package day20_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exceptions {

    public static void main(String[] args) {

        // kullanicidan bir metin ve bir tane pozitif tamsayi alin
        // girilen metindeki , girilen index'deki karakteri yazdirin
        // input : Ali , 1   Output ==> l


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        int sayi = 0;
        try {

            System.out.println("Lutfen pozitif bir tamsayi giriniz...");
            sayi = scanner.nextInt();

        } catch (InputMismatchException e) {

            // System.out.println(e.getMessage()); // null
            // e.printStackTrace(); // tum hata mesajini yazdirir
            // System.out.println(e.toString()); // java.util.InputMismatchException
            System.out.println("Tamsayi girmelisiniz...");
        }


        try {
            System.out.println("Metindeki verilen index'deki karakter : " + metin.charAt(sayi));
        } catch (StringIndexOutOfBoundsException e) {

            // System.out.println(e.getMessage()); // String index out of range: 7
            // e.printStackTrace();
            System.out.println("index " + metin.length() + "'den kucuk olmalidir");
        }

    }
}
