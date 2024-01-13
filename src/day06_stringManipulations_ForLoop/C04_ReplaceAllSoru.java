package day06_stringManipulations_ForLoop;

public class C04_ReplaceAllSoru {

    public static void main(String[] args) {

        // String olarak verilen sonuc sayisinda
        // sayi olmayan karakterleri temizleyip
        // bulunan sonucun 3'den fazla oldugunu test edin

        // ornek sonuc : 4 Products Found

        String sonucStr= "4 Products Found";

        sonucStr = sonucStr.replaceAll("\\D",""); // "4"

        int sonucSayisi = Integer.parseInt(sonucStr);// sayisal olarak kullanilabilecek 4 verir

        if (sonucSayisi > 3) System.out.println("test PASSED");
        else System.out.println("Test FAILED");


    }
}
