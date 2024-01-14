package day07_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        /*
            Kullanicidan satir sayisini alip
            asagidaki sekli olusturun

            2
            3 4
            4 5 6
            5 6 7 8

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir numarasini giriniz...");
        int satirNo = scanner.nextInt();

        for (int i = 1; i <=satirNo ; i++) { // satirlari

            for (int j = 1; j <=i ; j++) { // sutunlari

                System.out.print(i+j + " ");
            }
            System.out.println("");
        }

    }
}
