package day04_ifElseStatements;

import java.util.Scanner;

public class C07_BirimCevirme {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        //         ve cevirmek istedigi birimi sorun,
        //         istedigi birim metre veya santimetre ise cevirip yazdirin,
        //         yoksa “istediginiz birim sisteme kayitli degil” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km olarak giriniz");

        double mesafeKm = scanner.nextDouble();

        System.out.println("Lutfen cevirmek istediginiz birimi giriniz");

        String istenenBirim = scanner.next();

        if (istenenBirim.equalsIgnoreCase("metre")){

            System.out.println("Girilen mesafe metre olarak : " + mesafeKm * 1000 + " metredir.");

        } else if (istenenBirim.equalsIgnoreCase("santimetre")) {

            System.out.println("Girilen birim santimetre olarak : " + mesafeKm*1000*100 + " santimetredir." );
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}
