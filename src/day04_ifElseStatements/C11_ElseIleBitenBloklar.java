package day04_ifElseStatements;

import java.util.Scanner;

public class C11_ElseIleBitenBloklar {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi negatif ise "Sifirdan Kucuk"
        // sayi pozitif ise "Sifirdan buyuk"
        // sayi 0 ise "Notr" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi<0){
            System.out.println("Sifirdan kucuk");
        } else if (girilenSayi>0) {
            System.out.println("Sifirdan buyuk");
        }else {
            System.out.println("Notr");
        }
    }
}
