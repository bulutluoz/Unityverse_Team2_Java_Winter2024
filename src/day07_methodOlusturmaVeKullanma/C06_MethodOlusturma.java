package day07_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C06_MethodOlusturma {

    public static void main(String[] args) {

        // Kullanicidan main method icinde ismini ve soyismini alin
        // isim ve soyismin ilk harflerini buyuk, geriye kalan harfleri kucuk olarak duzenleyip
        // "isim soyisim" olarak bize donduren bir method olusturun
        // main method'da aldiginiz isim ve soyismi method ile duzenleyip kaydedin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        String duzenliIsim = isimSoyisimDuzenle(isim,soyisim);

        System.out.println(duzenliIsim);




    }

    public static String isimSoyisimDuzenle(String isim, String soyisim){

        isim =  isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0,1).toUpperCase()+
                  soyisim.substring(1).toLowerCase();

        return isim + " " + soyisim;

    }
}
