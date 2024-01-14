package day07_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C09_TamBolenlerSayisiniBulma {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //        Girilen sayinin pozitif tam bolenleri sayisini bulup
        //        bize donduren bir method olusturun.
        //        ornek : input : 10    1,2,5,10 ==> 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        System.out.println(pozitifBolenSayisiBul(girilenSayi));


    }

    public static int pozitifBolenSayisiBul(int sayi){

        int sayac = 0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i == 0){
                sayac++;
            }
        }

        return sayac;
    }
}
