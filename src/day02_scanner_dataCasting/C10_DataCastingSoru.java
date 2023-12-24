package day02_scanner_dataCasting;

import java.util.Scanner;

public class C10_DataCastingSoru {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin
        //         ve alfabede o harften sonraki 3 harfi yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf = scanner.next().charAt(0);


        System.out.println( (char)(girilenHarf + 1));
        System.out.println( (char)(girilenHarf + 2));
        System.out.println( (char)(girilenHarf + 3));

    }
}
