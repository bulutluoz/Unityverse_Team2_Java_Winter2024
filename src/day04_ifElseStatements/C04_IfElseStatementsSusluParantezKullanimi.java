package day04_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatementsSusluParantezKullanimi {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir karakter isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen karakteri yazdirin

        /*
            Bir if-else statement'da if ve else body'si icin {} kullanmak ZORUNLU DEGILDIR

            Ancak {} kullanilmadiginda dikkatli olmak gerekir,
            cunku {} kullanilmadiginda Java if body'si ve else body'si olarak
            tek bir satir kullanmaniza izin verecektir

            ilk satirdan sonraki satirlar, if else cumlesinin disinda kaldigindan
            her durumda calisacaklardir
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1 karakter giriniz");
        char girilenKarakter = scanner.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter<='z'){
            System.out.println("Kucuk harf girdiniz");
            System.out.println("Harfinizin buyuk hali : " + Character.toUpperCase(girilenKarakter));
        }else{
            System.out.println("Kucuk harf girmediniz");
            System.out.println("Girdiginiz karakter : " + girilenKarakter);
        }
    }
}
