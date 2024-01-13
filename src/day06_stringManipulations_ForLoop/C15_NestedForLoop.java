package day06_stringManipulations_ForLoop;

import java.util.Scanner;

public class C15_NestedForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan satir ve sutun sayisini alip
           asagidaki sekli olusturun

           ornek  : satir = 3, sutun = 7
           output :

                    * * * * * * *
                    * * * * * * *
                    * * * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();
        System.out.println("Sutun sayisini giriniz...");
        int sutunsayisi = scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) { // satirlar

            for (int j = 1; j <=sutunsayisi ; j++) { // sutunlar

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
