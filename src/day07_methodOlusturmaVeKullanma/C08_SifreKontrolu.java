package day07_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C08_SifreKontrolu {

    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip,
        //          asagidaki sartlari kontrol edin ve gecerli sifre girilene kadar tekrar sifre isteyin
        //          sifre kontrolunu bir method'da yapip,
        //          sifre gecerli ise true, sifre gecersiz ise false dondurun
        //          sifre gecerli olunca "sifre basariyla kaydedildi" yazdirin ve islemi bitirin

        //          method'da yapilacaklar
        //          kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          eger tum sartlari saglarsa true, hata varsa false dondurun
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <1000 ; i++) {
            System.out.println("Lutfen sifrenizi giriniz...");
            String sifre = scanner.nextLine();

            boolean kontrolSonucu = sifreKontrolEt(sifre);

            if (kontrolSonucu == true){
                System.out.println("Sifreniz basariyla kaydedildi..");
                break;
            }
        }

        System.out.println("Sifre islemi bitti...");
    }

    public static boolean sifreKontrolEt(String sifre){

        boolean sifreGecerliMi = true; // bu bizim flag'imiz, hata bulursak bunu false yapicaz

        //          - ilk harf kucuk harf olmali

        char ilkHarf= sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("Ilk karakter kucuk harf olmali");
            sifreGecerliMi = false;
        }

        //          - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (sonKarakter<'0' || sonKarakter>'9'){
            System.out.println("Son karakter rakam olmali");
            sifreGecerliMi = false;
        }

        //          - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sifreGecerliMi = false;
        }

        //          - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sifreGecerliMi = false;
        }

        return sifreGecerliMi;

    }
}
