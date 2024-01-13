package day06_stringManipulations_ForLoop;

import java.util.Scanner;

public class C11_ForLoopSoru {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan pozitif bir tamsayi alin,
        //        1’den girilen sayiya kadar(girilen sayi dahil)
        //        7 ile bolunebilen sayilari yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int bitisDegeri = scanner.nextInt();

        for (int i = 1; i <=bitisDegeri ; i++) {

            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
