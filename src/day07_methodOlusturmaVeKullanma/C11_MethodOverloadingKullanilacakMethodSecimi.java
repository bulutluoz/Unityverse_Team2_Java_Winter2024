package day07_methodOlusturmaVeKullanma;

public class C11_MethodOverloadingKullanilacakMethodSecimi {

    public static void main(String[] args) {

        toplama(5,6); // toplama int int ==> Iki int'in toplami : 11
        // oncelikle signature %100 ayni olani kullanir

        toplama('a','b'); // toplama char char ==> Iki int'in toplami : 195

        toplama(5,9.6); // toplama int double ==> int ve double'in toplami : 14.6

        toplama(4.5f, 9); // toplama float int ==> Iki double'in toplami : 13.5

        toplama(5,3.4F); // toplama int float ==> int ve double'in toplami : 8.400000095367432

    }

    public static void toplama (int sayi1, int sayi2){

        System.out.println("Iki int'in toplami : " + (sayi1 + sayi2));

    } // toplama int int

    public static void toplama (int sayi1, double sayi2){

        System.out.println(" int ve double'in toplami : " + (sayi1 + sayi2));
    }// toplama int double

    public static void toplama (double sayi1, double sayi2){

        System.out.println("Iki double'in toplami : " + (sayi1 + sayi2));

    }// toplama double double
}
