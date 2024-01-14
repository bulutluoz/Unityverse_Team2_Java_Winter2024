package day07_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C01_ForLoop_MetniTerseCevirme {

    public static void main(String[] args) {

        // Soru 10 (interview)- Kullanicidan bir String isteyin
        //         ve String’i tersine cevirip kaydedin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();


        // tersten yazdirin

        for (int i = metin.length()-1 ; i >= 0 ; i--) {

            System.out.print(metin.charAt(i));
        }
        System.out.println("");

        // Metnin ters halini kaydedin

        String tersMetin = "";

        for (int i = metin.length()-1 ; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        System.out.println("Metnin ters hali : " + tersMetin);

        // Metnin bir palindrome olup olmadigini yazdirin
        // ornek :  madam , ey edip adanada pide ye , 1456541

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palindrome");
        }else System.out.println("Girilen metin palindrome degil");




    }
}
