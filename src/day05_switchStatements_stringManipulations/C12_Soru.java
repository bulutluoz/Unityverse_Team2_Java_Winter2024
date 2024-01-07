package day05_switchStatements_stringManipulations;

import java.util.Scanner;

public class C12_Soru {

    public static void main(String[] args) {

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

        else if (!girilenMail.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }

        //        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

        else if (!girilenMail.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }

        else {
            System.out.println("Sifreniz basarili olarak kaydedildi");
        }
    }
}
