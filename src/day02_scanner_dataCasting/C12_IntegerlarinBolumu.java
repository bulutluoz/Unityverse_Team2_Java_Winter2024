package day02_scanner_dataCasting;

public class C12_IntegerlarinBolumu {

    public static void main(String[] args) {

        int sayi1 = 24;
        int sayi2 = 6;

        System.out.println( sayi1 / sayi2 ); // 4


        sayi2 = 9;

        System.out.println( sayi1 / sayi2 ); // 2,666 ==> 2

        // bolunen iki sayinin ikisi de int ise
        // java da sonucun int kismini yazdirir

        sayi2 = 5;
        System.out.println( sayi1 / sayi2 ); // 24 / 5 = 4,8 ==> 4



        double dbl1 = 5;

        double dbl2 = 67.6;


        System.out.println(sayi1 / dbl1 ); // 24 / 5.0 = 4.8

        System.out.println( dbl2 / sayi2); // 67.6 / 5 = 13.52


        System.out.println( sayi1 / sayi2 );  // 24 / 5  = 4.8 ==>4
        // sonucu ondalikli olarak gormek istersek sayilardan birini double'a cast etmeliyiz

        System.out.println( (double)sayi1 / sayi2 ); // 4.8

    }
}
