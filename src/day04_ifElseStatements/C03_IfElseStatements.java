package day04_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scanner.next().charAt(0);

        // 1. yontem, < , > ile kontrol
        //    buyuk harf olmasi icin A ile Z arasinda olmalidir

        if (girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("Buyuk harf");
        }else {
            System.out.println("Buyuk harf degil");
        }

        // 2.yontem Character Wrapper class'indan hazir method kullanabiliriz

        if (Character.isUpperCase(girilenKarakter)){
            System.out.println("Buyuk harf");
        }else{
            System.out.println("Buyuk harf degil");
        }
    }
}
