package day08_whileLoop_scope;

import java.util.Scanner;

public class C04_KullanicidanSayiAlipToplama {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //        Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //        ve bunlarin toplaminin kac oldugunu yazdirin
        //        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //        bu negatif sayiyi, sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 10; // bu deger, while loop'un ilk calismasinda onemli olacak
                              // ama kullanicidan alinmadigi icin toplama eklenmeyecek
                              // dikkat etmemiz gereken en onemli konu,
                              // verdigimiz degerin loop'un calismasina engel olmamasidir
        int sayilarinToplami= 0 ;
        int pozitifSayiAdedi = 0;

        while (girilenSayi != 0 ){

            System.out.println("Toplanmak uzere pozitif tamsayilar girin, bitirmek icin 0'a basin");
            girilenSayi = scanner.nextInt();

            if (girilenSayi > 0){
                sayilarinToplami += girilenSayi;
                pozitifSayiAdedi++;
            } else if (girilenSayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }else { // geriye girilenSayi == 0
                // bir sey yapmamiza gerek yok, while loop basa donunce bitecek
            }

        }

        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, toplamlari : " + sayilarinToplami);
    }
}
