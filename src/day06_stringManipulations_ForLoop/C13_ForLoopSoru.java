package day06_stringManipulations_ForLoop;

import java.util.Scanner;

public class C13_ForLoopSoru {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak tam sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Baslangic degeri olarak bir tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis degeri olarak bir tamsayi giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (baslangic < bitis){

            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i ;
            }


        }else { // bitis <= baslangic

            for (int i = bitis; i <= baslangic ; i++) {

                toplam += i;
            }

        }

        System.out.println("Verilen sayilarin arasindaki tum sayilarin toplami : " + toplam);


    }
}
