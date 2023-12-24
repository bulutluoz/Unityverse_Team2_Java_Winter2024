package day02_scanner_dataCasting;

import java.util.Scanner;

public class C11_DataCastingSoru {

    public static void main(String[] args) {
        //Soru 4- Kullanicidan iki double sayi alin,
        //        ilk sayiyi ikinci sayiya bolun
        //        ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tane ondalikli sayi giriniz");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


        System.out.println( "Sayilarin bolumu : " +    (int) (sayi1/sayi2)   );
    }
}
