package day06_stringManipulations_ForLoop;

import java.util.Scanner;

public class C12_ForLoopSoru {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //         Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Baslangic degeri olarak pozitif bir tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis degeri olarak pozitif bir tamsayi giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis < baslangic || bitis<0 || baslangic<0 ){

            System.out.println("Baslangic ve bitis degerleri uygun degil");

        }else {

            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i ;
            }
            System.out.println("Toplam : " + toplam);
        }



    }
}
