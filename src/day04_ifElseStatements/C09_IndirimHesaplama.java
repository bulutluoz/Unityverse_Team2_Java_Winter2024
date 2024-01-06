package day04_ifElseStatements;

import java.util.Scanner;

public class C09_IndirimHesaplama {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa ve 10 urunden fazla alirsa %20,
        //        10 urun veya daha az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15,
        //        10 urun veya daha az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urunun liste fiyatini girin");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Lutfen aldiginiz urun sayisini giriniz");
        int urunSayisi = scanner.nextInt();

        System.out.println("Musteri kartiniz var mi ? E : Evet, H: Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0); // kullanici kucuk veya buyuk girebilir
                                        // biz toUpperCase() ile kullanicinin girdigini buyuk harf yaptik

        if (kartVarMi == 'E' && urunSayisi > 10){
            System.out.println("%20 indirimli toplam fiyat : " + listeFiyati*urunSayisi* 80 / 100);
        } else if (kartVarMi == 'E' ) {
            System.out.println("%15 indirimli toplam fiyat : " + listeFiyati*urunSayisi* 85 / 100);
        } else if (kartVarMi == 'H' && urunSayisi>10) {
            System.out.println("%15 indirimli toplam fiyat : " + listeFiyati*urunSayisi* 85 / 100);
        } else if (kartVarMi == 'H' ) {
            System.out.println("%10 indirimli toplam fiyat : " + listeFiyati*urunSayisi* 90 / 100);
        }else {
            System.out.println("Lutfen tekrar deneyin");
        }


    }
}
