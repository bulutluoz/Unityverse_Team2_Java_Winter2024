package day04_ifElseStatements;

import java.util.Scanner;

public class C08_EmeklilikHesaplama {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri ,
        //         Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        System.out.println("Lutfen cinsiyetinizi giriniz...");
        String cinsiyet = scanner.next();

        if (cinsiyet.equalsIgnoreCase("kadin") && yas>=60){
            System.out.println("Kadin 60 yasindan buyuk, emekli olabilir...");
        } else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60){
            System.out.println("Kadin 60 yasindan kucuk, emekli olmasi icin " + (60-yas) + " yil daha calismasi lazim");
        } else if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
            System.out.println("Erkek 65 yasindan buyuk, emekli olabilir");
        } else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
            System.out.println("Erkek 65 yasindan kucuk, emekli olmasi icin " + (65-yas) + " yil daha calismasi lazim");
        }else {
            System.out.println("Girilen degerler hatali");
        }


    }
}
