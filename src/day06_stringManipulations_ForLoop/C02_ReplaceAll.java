package day06_stringManipulations_ForLoop;

public class C02_ReplaceAll {

    public static void main(String[] args) {

        String str = "J1a23v76a C98an12d0i4r6";

        // tek bir karakter veya bir metin degil de
        // tum sayilar, tum sayi olmayanlar gibi bir genelleme yaparak
        // karakterleri secmek isterseniz replace() yerine replaceAll() kullaniriz

        // Java'da bu tur genel ifadeleri regex (regular expressions) ile belirtiriz

        // sadece 1'i yok etmek istersek

        str = str.replace("1","");

        System.out.println(str); // Ja23v76a C98an2d0i4r6

        // butun sayilari yoketmek istersek

        str = str.replaceAll("\\d","");

        System.out.println(str); // Java Candir


    }
}
