package day03_wrapperClasses_MatematikselIslemler;

import java.util.Scanner;

public class C02_Modulos {

    public static void main(String[] args) {

        System.out.println((125 % 8)); // 5

        System.out.println(123746241 % 17 ); // 11

        System.out.println(534341 % 3 ); // 2


        int sayi = 2341 ;

        System.out.println(sayi % 10 ); // 1

        System.out.println(sayi = sayi / 10 ); // 2341 / 10 ==> 234,1 degil 234 verir

        System.out.println(sayi % 10 ); // 234 % 10 ==> 4

        System.out.println(sayi = sayi / 10 ); // 234 / 10 ==> 23

        System.out.println(sayi % 10); // 23 % 10 ==> 3

        System.out.println(sayi = sayi / 10 ); // 23 / 10 ==> 2

        sayi = 1567;

        System.out.println(sayi / 1000); // 1,567 ==>  1

        System.out.println(sayi / 100 ); // 15,67 ==> 15





        // kullanicidan bir sayi alin ve birler basamagini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayinin birler basamagi : "+ girilenSayi % 10 ); // 6





    }
}
