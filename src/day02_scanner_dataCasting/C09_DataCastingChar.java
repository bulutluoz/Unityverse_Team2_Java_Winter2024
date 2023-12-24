package day02_scanner_dataCasting;

public class C09_DataCastingChar {

    public static void main(String[] args) {

        // char data turu ozel bir data turudur
        // char data turu ascii table'i kullanir
        // ve her karakterin ascii tablosunda matematiksel bir karsiligi vardir
        // EGER bir char variable'i MATEMATIKSEL islemde kullanirsaniz
        // ASCII table'daki degeri ile isleme girer


        System.out.println('a' < 'f'); // 97 < 102 gibi islem yapar ve sonuc true yazdirir

        System.out.println( 'b' + 'd'); // 98 + 100 gibi dusunur ve sonuc 198 yazdirir

        System.out.println(     (char) ('a' + 1)      ); // b

        char chr = 100;

        System.out.println(chr); // d

        System.out.println( '1' + '2'); // 49 + 50 = 99

    }
}
