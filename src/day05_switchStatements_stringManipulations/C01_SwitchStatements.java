package day05_switchStatements_stringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {

    public static void main(String[] args) {
        /*
            Bir switch statement'da verdigimiz degere uygun olan case devreye girer
            case calismaya basladiktan sonra,
            break gorunceye veya switch statement'in sonuna kadar calisir
         */

        // kullanicidan haftanin kacinci gunu oldugunu sayi olarak alin
        // gun ismini yazdirin
        // 1-7 arasindaki sayilardan farkli bir sayi girilirse
        // "yanlis gun numarasi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen haftanin kacinci gunu oldugunu giriniz..");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("yanlis gun numarasi");
        }


    }
}
