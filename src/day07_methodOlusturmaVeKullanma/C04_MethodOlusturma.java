package day07_methodOlusturmaVeKullanma;

public class C04_MethodOlusturma {

    public static void main(String[] args) {

        // verilen iki tamsayinin carpimini yazdiran bir method olusturun

        // olusturulan bir method'un calismasi icin cagrilmasi (method call) gerekir

        carpma(5,6); // 30

        carpma(-9,0); // 0

        carpma('a',4); // 388
        // method call'da yazilan degerlere argument,
        // method olusturulurken yazilan variable'lara parametre denir
        // argument'lerle parametre'lerin uyumlu olmasi gerekir


        // Verilen String ve int degerleri aralarinda bir bosluk birakarak yazdiran
        // bir method olustur

        birlestir("Java",15); // Java 15

        birlestir("ali",34); // ali 34

        birlestir("Can",45); // Can 45



    }// main method sonu

    public static void carpma(int sayi1, int sayi2){
        System.out.println(sayi1*sayi2);
    }

    public static void birlestir(String str , int sayi){

        System.out.println(str + " " + sayi);
    }


} // class sonu
