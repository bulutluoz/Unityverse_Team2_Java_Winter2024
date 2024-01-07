package day04_ifElseStatements;

public class C15_Ternary {

    public static void main(String[] args) {

        int sayi = 10;

        // sayi cift ise "cift sayi", degilse "tek sayi yazdirin"

        System.out.println( sayi%2==0 ? "cift sayi" : "tek sayi" );


        // sayi tek basamakli ise "rakam", degilse "sayi" yazdirin

        System.out.println(sayi>=-9 && sayi<=9 ? "rakam" : "sayi");


        // sayi 3'un kati ise "3'un kati" yazdirin,
        // 3'un kati degilse sayiyi 3 ile carpip sonucunu yazdirin

        System.out.println(sayi%3==0 ? "3'un kati" : sayi*3 );

        /*
            DIKKAT EDILMESI GEREKEN KONULAR
            1- ternary tek basina kullanilamaz,
               ya direk yazdirmalisiniz
               veya bir variable'a atama yapmalisiniz

            2- eger sartin true vermesi durumunda elde edilen sonucun data turu ile,
               sartin false vermesi durumunda elde edilen sonucun data turu farkli olursa
               atama yapmamiz mumkun olmaz, sadece yazdirabiliriz
         */

        // sayi>0 ? sayi+5 : sayi-5 ;  // Altini kirmizi cizer ve kod calismaz

        System.out.println(sayi>0 ? sayi+5 : sayi-5 ); // ya direk yazdirmali

        sayi = sayi>0 ? sayi+5 : sayi-5 ; // veya atama yapmaliyiz


        sayi = 0 ;
        // eger sayi pozitifse 2 katina cikarin
        // pozitif degilse "pozitif degil" yazdirin.

        System.out.println((sayi > 0 ? sayi * 2 : "pozitif degil"));

    }
}
