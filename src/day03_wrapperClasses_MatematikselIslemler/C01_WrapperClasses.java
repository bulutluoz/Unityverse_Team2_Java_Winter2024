package day03_wrapperClasses_MatematikselIslemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        int sayi = 20;

        String str = "Java";

        // Primitive data turlerinin hazir method'lari yoktur
        // Java primitive'ler ile kullanilabilecek bazi hazir method'lar
        // olusturmus ve primitive'ler ile ayni isimlerdeki class'lara koymustur

        // int primitive, Integer wrapper class

        Integer sayi2 = 30;

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Long.MAX_VALUE); // 9223372036854775807
        System.out.println(Short.MIN_VALUE); // -32768

        // Wrapper class sayesinde String olarak verilen bir sayiyi Integer'a cevirebiliriz

        String sonuc1 = "123";
        String sonuc2 = "15";

        System.out.println(sonuc2 + sonuc1); // "15"+"123" ==> "15123"

        System.out.println((Integer.parseInt(sonuc1) + Integer.valueOf(sonuc2))); // 138


        char chr1 = 'a';
        char chr2 = '5';
        char chr3 = '*';

        System.out.println(Character.toUpperCase(chr1)); // A
        System.out.println(Character.isDigit(chr2)); // true
        System.out.println(Character.isLowerCase(chr1)); // true
        System.out.println(Character.isUpperCase(chr1)); // false
        System.out.println(Character.isDigit(chr3)); // false


    }
}
