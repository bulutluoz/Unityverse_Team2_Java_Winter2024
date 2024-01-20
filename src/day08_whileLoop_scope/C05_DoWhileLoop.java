package day08_whileLoop_scope;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //        Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //        ve bunlarin toplaminin kac oldugunu yazdirin
        //        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //        bu negatif sayiyi, sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        int sayilarinToplami= 0 ;
        int pozitifSayiAdedi = 0;

        do {

            System.out.println("Toplanmak uzere pozitif tamsayi giriniz, bitirmek icin 0'a basin");
            girilenSayi= scanner.nextInt();

            if (girilenSayi > 0){
                sayilarinToplami += girilenSayi;
                pozitifSayiAdedi++;
            } else if (girilenSayi < 0) {
                System.out.println("Negatif sayi giremezsiniz...");
            }

        }while (girilenSayi != 0);

        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, toplamlari : " + sayilarinToplami);

    }
}
