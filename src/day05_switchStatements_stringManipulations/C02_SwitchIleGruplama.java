package day05_switchStatements_stringManipulations;

import java.util.Scanner;

public class C02_SwitchIleGruplama {

    public static void main(String[] args) {
        // kullanicidan haftanin kacinci gunu oldugunu sayi olarak alin
        // gunun hafta ici veya hafta sonu oldugunu yazdirin
        // 1-7 arasindaki sayilardan farkli bir sayi girilirse
        // "yanlis gun numarasi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen haftanin kacinci gunu oldugunu giriniz..");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("yanlis gun numarasi");
        }
    }
}
