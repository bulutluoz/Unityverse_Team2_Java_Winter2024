package day02_scanner_dataCasting;

public class C08_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 15;

        byte by1 = (byte)sayi1;

        System.out.println("byte'a cevrilen 15 : " + by1); // 15


        int sayi2 = 126;

        byte by2 = (byte)sayi2;

        System.out.println("byte'a cevrilen 126 : " + by2); // 126



        int sayi3 = 128;

        byte by3 = (byte)sayi3;

        System.out.println("byte'a cevrilen 128 : " + by3); // -128


        int sayi4 = 130;

        byte by4 = (byte)sayi4;

        System.out.println("byte'a cevrilen 130 : " + by4); // -126


        int sayi5 = 256;

        byte by5 = (byte)sayi5;

        System.out.println("byte'a cevrilen 256 : " + by5); // 0


        int sayi6 = 515;

        byte by6 = (byte)sayi6;

        System.out.println("byte'a cevrilen 515 : " + by6); // 3
    }
}

















