package day05_switchStatements_stringManipulations;

import java.util.Scanner;

public class C14_Soru {

    public static void main(String[] args) {

        //Soru 2 : Kullanicidan bir String ve aranacak metin alin.
        //         Aranan metnin String icerisinde kullanimini kontrol ederek
        //         asagidaki cumlelerden uygun olanini yazdirin.
        //  - String aranan metni icermiyor
        //	- Aranan metin String’de sadece 1 kere kullanilmis
        //	- Aranan metin String’de 1’den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen aranan metni giriniz");
        String arananMetin = scanner.nextLine();

        int ilkKullanimIndexi = cumle.indexOf(arananMetin);
        int sonKullanimIndexi = cumle.lastIndexOf(arananMetin);

        if (ilkKullanimIndexi == -1){
            System.out.println("String aranan metni icermiyor");
        } else if (ilkKullanimIndexi == sonKullanimIndexi) {
            System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
        }else{
            System.out.println("Aranan metin String’de 1’den fazla kullanilmis");
        }
    }
}
