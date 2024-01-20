package day08_whileLoop_scope;

import java.util.Locale;

public class C03_IsmiIstenenFormataCevirme {

    public static void main(String[] args) {

        // Kullanicidan ismini isteyin
        // Ismi, ismin ilk harfi buyuk, diger harfleri kucuk olacak sekilde duzenleyip kaydedin
        // Eger kullanici birden fazla isim girerse, her ismin ilk harfi buyuk olmali
        // ornek : ali mert ==> Ali Mert , AYSE CAN => Ayse Can

        String isim = "tarik kemal canli";

        // sadece ismin duzenlenmis halini yazdirmak istersek

        System.out.println(ismiDuzenle(isim));  // Ali Kemal Candan

        // 18.satirda atama yapmadan sadece yazdirdigimiz icin, isim variable'nin degeri degismedi

        System.out.println(isim); // ALI KEMAL CANDAN

        // Eger isim variable'inin degeri istenen haliyle kaydolsun diyorsak, atama yapmaliyiz

        isim = ismiDuzenle(isim);

        System.out.println("26.satirdan sonra isim kalici olarak degisti : " + isim);

    }

    public static String ismiDuzenle(String isim){

        int index = 0;
        String duzenlenmisIsim ="";

        while (index < isim.length()){

            if (index == 0){
                duzenlenmisIsim += isim.toUpperCase().charAt(0);
            } else if (isim.charAt(index-1) == ' ') {
                duzenlenmisIsim += isim.toUpperCase().charAt(index);
            } else if (isim.charAt(index)== ' ') {
                duzenlenmisIsim += " ";
            } else{
                duzenlenmisIsim += isim.toLowerCase().charAt(index);
            }

            index++;
        }

        return duzenlenmisIsim;
    }
}
