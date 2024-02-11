package day15_varargs_stringBuilder;

public class C05_StringBuilderlarinKarsilastirilmasi {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        System.out.println( sb1 == sb2  ); // false

        System.out.println(sb1.equals(sb2)); // false

        // metni ayni ile olsa iki sb == veya equals ile karsilastirilirsa false verir

        System.out.println( sb1.compareTo(sb2)); // 0

        // compareTo() ile karsilastirilan sb'larin metinleri ayni ise sonuc 0 olur


        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Hava");
        StringBuilder sb5 = new StringBuilder("Jaka");
        StringBuilder sb6 = new StringBuilder("Taka");

        System.out.println(sb3.compareTo(sb4)); // 2

        System.out.println(sb3.compareTo(sb5)); // 11

        System.out.println(sb4.compareTo(sb6)); // -12

        // farkli kelimeler compareTo() ile karsilastirilirsa
        // bastan itibaren tum index'deki harfleri kontrol eder
        // farkli harf bulunduran ilk index'deki
        // iki harfin arasinda kac harf bulundugunu yazdirir


    }
}
