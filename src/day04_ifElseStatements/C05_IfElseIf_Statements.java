package day04_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseIf_Statements {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bolunuyorsa "3'un kati"
        // sayi 5 ile bolunuyorsa "5'in kati"
        // hem 3 hem 5 ile bolunuyorsa "3 ve 5'in kati"
        // hicbirine bolunmuyorsa "lutfen tekrar deneyin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) System.out.println("3 ve 5'in kati");
        else if (girilenSayi % 5 == 0) System.out.println("5'in kati");
        else if (girilenSayi % 3 == 0) System.out.println("3'un kati");
        else System.out.println("lutfen tekrar deneyin");


    }
}
