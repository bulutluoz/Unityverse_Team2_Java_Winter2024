package day03_wrapperClasses_MatematikselIslemler;

import java.util.Scanner;

public class C08_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ucgenin 3 kenarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0){ // Java 3'lu karsilastirma kabul etmez
                                         // ikili karsilastirmalar yapip
                                         // mantiksal operatorler && veya || ile birlestirmeliyiz

            System.out.println("Eskenar ucgen");
        }
    }
}
