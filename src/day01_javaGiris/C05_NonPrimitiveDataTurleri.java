package day01_javaGiris;

public class C05_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        /*
            java'da non primitive variable'larin tamami
            bir class'dan olusturulur
            ve o class'da var olan hazir method'lari kullanabilir

            AMMA primitive data turleri ozel ve basit data turleridir
            bir class'dan olusturulmadiklari icin
            hazir method'lari olmaz

         */

        String str = "Java Candir";

        int sayi = 20;

        double dbl = 3.4 ;

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str); // Java Candir


    }
}
