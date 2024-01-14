package day07_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C13_KullanicininGirdigiSayilariToplama {

        public static void main(String[] args) {

                // kullanicidan toplanmak uzere sayilar alin
                // toplam 500 oldugunda veya gectiginde
                // islemi bitirip, toplami yazdirin

                Scanner scanner = new Scanner(System.in);
                double toplam = 0;

                while (toplam < 500 ){
                        System.out.println("Toplanmak uzere sayi giriniz...");
                        double sayi = scanner.nextDouble();
                        toplam += sayi;
                }

                System.out.println("Girilen sayilarin toplami : " + toplam);

        }
        }
