package day08_whileLoop_scope;

import java.util.Locale;

public class C03_IsmiIstenenFormataCevirme {

    public static void main(String[] args) {

        // Kullanicidan ismini isteyin
        // Ismi, ismin ilk harfi buyuk, diger harfleri kucuk olacak sekilde duzenleyip kaydedin
        // Eger kullanici birden fazla isim girerse, her ismin ilk harfi buyuk olmali
        // ornek : ali mert ==> Ali Mert , AYSE CAN => Ayse Can

        String isim = "ALI KEMAL";

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

        System.out.println(duzenlenmisIsim);
    }
}
