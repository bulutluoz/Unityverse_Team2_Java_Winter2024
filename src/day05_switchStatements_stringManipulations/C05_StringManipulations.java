package day05_switchStatements_stringManipulations;

import java.util.Locale;

public class C05_StringManipulations {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // str'i kucuk harf olarak yazdirin
        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str); // Java Candir

        // String'de atama yapmazsaniz, method ile yapilan degisiklikler KALICI OLMAZ
        // yaptiginiz degisikligin kalici olmasini isterseniz ATAMA yapmalisiniz

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        // Bazen buyuk kucuk harf donusumunde local alfabeye sadik kalinmasi istenebilir
        // ornegin JAVA CANDIR'i kucuk harfe cevirirsek I yerine i gelir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır

        // ilk harfi yazdirin
        System.out.println(str.charAt(0)); // J

        // bastan 3. harfi yazdirin

        System.out.println(str.charAt(2)); // V

        // son harfi yazdirin
        System.out.println(str.charAt(11 - 1)); // R

        // sondan 3.harfi yazdirin

        System.out.println(str.charAt(11-3)); // D

        // String'de olmayan bir index kullanilirsa Exception olusur

        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException

        // String sayi = 20; // Compile Time Error

        String sayi = "20a";

        // String olarak verilen sayinin 2 katini yazdirin

        System.out.println( Integer.parseInt(sayi) * 2   ); // NumberFormatException
        // Calismaya basladiktan sonra ortaya ciktigi icin
        // Run Time Error


    }
}
