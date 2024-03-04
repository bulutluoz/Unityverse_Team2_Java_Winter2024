package day20_exceptions;

import java.util.Scanner;

public class C07_ThrowKeyword {

    public static void main(String[] args) {

        /*
            Throw keyword
            IHTIYAC DUYDUGUMUZDA bilerek ve isteyerek
            exception firlatmak icin kullanilir

            temel amac firlattigimiz exception'i try catch ile yakalayip
            kodumuzu istedigimiz sekilde planlamaktir.



         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yasinizi giriniz...");
        int yas = scanner.nextInt();

        try {
            if (yas < 0){

                throw new IllegalArgumentException("Yas negatif olamaz...");
            }
            System.out.println("Yas negatifse bu satir calismasin");

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Yas negatif oldugunda bu satir calissin");
        }


    }
}
