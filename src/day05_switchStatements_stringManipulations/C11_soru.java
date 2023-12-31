package day05_switchStatements_stringManipulations;

import java.util.Scanner;

public class C11_soru {

    public static void main(String[] args) {

        /*
            Bir soruda birden fazla sart varsa
            bagimsiz if cumleleri veya if - else if cumleleriyle soruyu cozebiliriz

            bagimsiz if cumleleri ile yapmanin avantaji:
            tum hatalari tek seferde soyler

            if - else if cumleleriyle yaparsak
            sadece 1 hatayi yazdirir,
            ama avantaji
            eger en sonda hicbir hata yoksa, sifre basarili yazdirabiliriz

         */

        // SORU : kullanicidan bir mail alin
        //        - mail @ icermiyorsa "gecersiz mail"
        //        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //        yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String girilenMail = scanner.nextLine();

        //        - mail @ icermiyorsa "gecersiz mail"

        if (!girilenMail.contains("@")){
            System.out.println("gecersiz mail");
        }

        //        - mail @gmail.com icermiyorsa, "mail gmail olmali"

        if (!girilenMail.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }

        //        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

        if (!girilenMail.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }

    }
}
