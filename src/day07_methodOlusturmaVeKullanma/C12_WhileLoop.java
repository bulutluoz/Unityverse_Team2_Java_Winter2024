package day07_methodOlusturmaVeKullanma;

public class C12_WhileLoop {

    public static void main(String[] args) {

        /*
            baslangic ve bitis degerleri belli ise
            veya kac kere tekrar edecegini biliyorsak
            for loop daha avantajlidir
         */

        // 2 basamakli sayilari yanyan yazdirin

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");


        // ayni islemi while loop ile yapalim

        int sayi = 10;
        while (sayi<=99){
            System.out.print(sayi + " ");
            sayi++;
        }
    }
}
