package day04_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgenin 3 kenarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }



    }
}
