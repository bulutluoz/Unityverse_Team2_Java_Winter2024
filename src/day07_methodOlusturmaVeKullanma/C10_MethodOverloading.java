package day07_methodOlusturmaVeKullanma;

public class C10_MethodOverloading {

    public static void main(String[] args) {

        String str = "Method olusturma";

        System.out.println(str.substring(3)); // hod olusturma

        System.out.println(str.substring(3,6)); // hod

        /*
            Bir class'da ayni isimde birden fazla method olabilir
            Ancak ismi ayni oldugu gibi, herseyi ayni olursa Java hangisini calistiracagini bilemez


            Bunun onune gecmek icin Java'da ayni isimde birden fazla methd olusturuldugunda
            parametre sayisi veya parametrelerin data turleri farkli olmalidir

            Method ismi ayni oldugu halde,
            method SIGNATURE'i farkli olan method'larin kullanilmasina
            METHOD OVERLOADING denir

            Method signature : method ismi + parametrelerin data turleri
            ornegin asagidaki method'lar icin signature
            toplama int int
            toplama int int int
            toplama double int
            toplama int double
         */

        toplama(6,8); // Iki int'in toplami : 14
        toplama(4,7,9); // Uc int'in toplami : 20
        toplama(5.6,8); // double ve int'in toplami : 13.6
        toplama(6,8.9); // int ve double'in toplami : 14.9

    }

    public static void toplama (int sayi1, int sayi2){

        System.out.println("Iki int'in toplami : " + (sayi1 + sayi2));
    }

    public static void toplama (int a, int b, int c){

        System.out.println("Uc int'in toplami : " + (a + b + c)); // Uc int'in toplami : 20
    }

    public static void toplama (double sayi1, int sayi2){

        System.out.println("double ve int'in toplami : " + (sayi1 + sayi2));
    }

    public static void toplama (int sayi1, double sayi2){

        System.out.println(" int ve double'in toplami : " + (sayi1 + sayi2));
    }
}
