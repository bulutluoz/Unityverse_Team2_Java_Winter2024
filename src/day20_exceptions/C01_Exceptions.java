package day20_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        /*
            java kodlarimizi calistirirken
            bir hata ile karsilastiginda kod yazan kisinin
            bu hatayi ongorup, java'ya bir cozum yolu uretip uretmedigine bakar

            eger kod yazari bu hatayi ongormus
            ve java'ya yapmasi gerekeni soylemisse
            java kendisine soyleneni yapar
            ve normal calismasina devam eder

            bazi hatalari if statement'lar ile
            kontrol altina alabiliriz (handle edebiliriz)
            if-else ile cozemeyecegimiz durumlar icin
            Java try-catch (/ finally) bloklarini olusturmustur
         */

        // kullanicidan iki tamsayi isteyip
        // sayilarin bolumunu yazdirin

        Scanner scanner = new Scanner(System.in);

        int sayi1 = 0;
        int sayi2 = 0;
        try {
            System.out.println("Birinci tamsayiyi giriniz...");
            sayi1 = scanner.nextInt();

            System.out.println("Ikinci tamsayiyi giriniz...");
            sayi2 = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("Tamsayi girmelisiniz...");

        }

        if (sayi2 != 0){
            System.out.println( sayi1 / sayi2 );
        }else {
            System.out.println("Ikinci sayi 0 olamaz");
        }

        System.out.println("Kod sorunsuz calisirsa bu satiri gorursunuz");
    }
}
