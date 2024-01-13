package day06_stringManipulations_ForLoop;

import java.util.Scanner;

public class C06_StringManipulationsSoru {

    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir cumle alin
        //          - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //          - cumlede is geciyorsa, "calismak guzeldir"
        //          - ikisini de iceriyorsa "Hem ev lazim hem is"
        //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        if (metin.contains("ev") && metin.contains("is")) System.out.println("Hem ev lazim hem is");
        else if (metin.contains("is")) System.out.println("calismak guzeldir");
        else if (metin.contains("ev")) System.out.println("home home sweet home");
        else System.out.println("cok calisman lazim");
    }
}
