package day06_stringManipulations_ForLoop;

import java.util.Scanner;

public class C08_StringManipulationsSoru {

    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //          ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz...");
        String sifre = scanner.nextLine();

        // if-else if cumlelerinde sadece bir if body'si calisir
        // tum hatalari yazdirabilmek icin bagimsiz if cumleleri kullaniyoruz

        int sayac = 0;

        //          - ilk harf kucuk harf olmali

        char ilkHarf= sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("Ilk karakter kucuk harf olmali");
            sayac++;
        }

        //          - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (sonKarakter<'0' || sonKarakter>'9'){
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }


        //          - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }

        //          - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }


        if (sayac == 0){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
