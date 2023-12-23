package day01_javaGiris;

public class C04_PrimitiveDataTurleri {

    public static void main(String[] args) {

        char chr1 = 'b';
        char chr2 = 'x';
        // char chr3 = '-3'; // Too many characters in character literal
        // char chr4 = '23';
        char chr5 = ' '; // bosluk(space) de bir karakterdir
        // char chr6 = ' a'; // Too many characters in character literal
        char chr7 = '&';

        // char data turunde '' icinde tek bir karakter olmalidir
        // bu karakter harf, sayi ya da ozel karakter olabilir

        // char chr8 = u ;
        // char chr9 = "U"; // senden char bekliyorum ama String veriyorsun

        float flt1 = 9.8f ;
        float flt2 = 4.235F;
        System.out.println(flt1 / flt2); // 2.3140495


        double dbl1 = 20;
        double dbl2 = 3;
        System.out.println(dbl1 / dbl2); // 6.666666666666667

        dbl2 = 5 ;

        System.out.println(dbl1 / dbl2); //  4.0 bazen 3.99999999999999995 gibi bir sonuc verebilir


    }
}
