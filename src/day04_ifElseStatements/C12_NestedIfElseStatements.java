package day04_ifElseStatements;

import java.util.Scanner;

public class C12_NestedIfElseStatements {

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

        /*
            Nested if else
            daha kisa oldugu icin degil
            daha anlasilir oldugu icin tercih edilen bir yontemdir

            Eger degisken sayiniz birden fazla ise
            once birini ana degisken kabul edip
            ona gore bir if-else statement olusturalim

            Bu soru icin cinsiyet ana degisken olsun
         */

        if (cinsiyet.equalsIgnoreCase("kadin")){
            // bu bolume kadin suzgeci tarafindan yakalananlar gelecek
            // bu if blogunda yazacagimiz kodlar SADECE kadinlari ilgilendirmeli

            if (yas<20 || yas>70){
                System.out.println("Yas girisi hatali");
            } else if (yas>=60) {
                System.out.println("Kadin 60 yasindan buyuk, emekli olabilir...");
            }else{
                System.out.println("Kadin 60 yasindan kucuk, emekli olmasi icin " + (60-yas) + " yil daha calismasi lazim");
            }


        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            // bu bolume erkek suzgeci tarafindan yakalananlar gelecek
            // bu bolumdeki kodlar sadece erkekler icin yazilmali
            if (yas<20 || yas>70){
                System.out.println("Yas girisi hatali");
            } else if (yas>=65) {
                System.out.println("Erkek 65 yasindan buyuk, emekli olabilir...");
            }else{
                System.out.println("Erkek 65 yasindan kucuk, emekli olmasi icin " + (65-yas) + " yil daha calismasi lazim");
            }

        }else{
            System.out.println("Lutfen kadin veya erkek degeri giriniz");
        }

    }
}
