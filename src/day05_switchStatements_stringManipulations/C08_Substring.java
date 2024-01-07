package day05_switchStatements_stringManipulations;

public class C08_Substring {

    public static void main(String[] args) {

        /*
            str.substring(basIndex) verilen basIndex'inden baslayarak, sona kadar tum karakterleri verir

            str.substring(basIndex,bitIndex) baslangic index'i dahil, bitis index'i haric olarak
                                             aradaki karakterleri verir
         */

        String str = "Java Candir";

        // str'in 3.karakterini yazdirin
        System.out.println(str.charAt(2)); // v

        // str'in 3.index'inden baslayarak sonuna kadar olan kismi yazdirin

        System.out.println(str.substring(3)); // a Candir

        // str'in 6.index'inden baslayarak sona kadar olan kismi yazdirin

        System.out.println(str.substring(6)); // andir

        // str'in sondan 3.karakterini yazdirin

        System.out.println(str.charAt(str.length()-3)); // d

        // str'in son 5 karakterini yazdirin

        System.out.println(str.substring(str.length()-5)); // andir

        // sondan 1 karakteri substring ile yazdirin

        System.out.println(str.charAt(str.length()-1)); // r
        System.out.println(str.substring(str.length()-1)); // r

        // eger substring de length'i yazarsak hiclik verir
        System.out.println(str.substring(str.length())); // hiclik yazdirir

        // eger baslangic index'i olarak length'den buyuk bir sayi yazarsak

        //System.out.println(str.substring(20)); // StringIndexOutOfBoundsException
                                                        // String index out of range: -9


        str = "Java Candir, Can";

        System.out.println(str.substring(5,8)); // Can

        System.out.println(str.substring(2,7)); // va Ca

        System.out.println(str.substring(6,10)); // andi

        // eger baslangic index'i ile bitis index'i ayni olursa hiclik yazdirir

        System.out.println(str.substring(3,3)); // hiclik

        // eger baslangic index'i ile bitis index'i arasinda 1 fark olursa,
        // baslangic index'indeki karakteri getirir

        System.out.println(str.substring(2,3)); // v
        System.out.println(str.substring(1,2)); // a
        System.out.println(str.substring(0,1)); // J

        // baslangic index'i bitis index'inden buyuk olursa calistiginda hata verir

        // System.out.println(str.substring(5,3)); // StringIndexOutOfBoundsException

    }
}
