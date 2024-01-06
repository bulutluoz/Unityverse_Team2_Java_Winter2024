package day04_ifElseStatements;

import java.util.Scanner;

public class C10_ElseBlogununGorevi {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin
        // sayi tek basamakli ise RAKAM
        // iki basamakli ise KUCUK SAYI
        // uc basamakli ise BUYUK SAYI yazdirin

        /*
            if- else if ... cumleleri else ile bitmek zorunda degildir

            ANCAK
            eger else ile bitmiyorsa, bazi degerler icin hicbir body calismayabilir
            bu durumda bazi degerler icin islem yapilmamis olur

            AMMA
            else ile bitiyorsa
            her durumda mutlaka calisacak bir kod blogu olacaktir
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi>=0 && girilenSayi<=9){
            System.out.println("RAKAM");
        } else if (girilenSayi>=10 && girilenSayi<=99) {
            System.out.println("KUCUK SAYI");
        } else if (girilenSayi>=100 && girilenSayi<=999) {
            System.out.println("BUYUK SAYI");
        }

    }
}
