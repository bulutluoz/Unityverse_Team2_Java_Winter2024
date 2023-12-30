package day03_wrapperClasses_MatematikselIslemler;

public class C03_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 20;

        sayi++;

        System.out.println(sayi); // 21

        sayi += 5;

        System.out.println(sayi); // 26

        sayi /= 2;

        System.out.println(sayi); // 13

        sayi--;

        System.out.println(sayi); // 12


        int a = 10;

        // once a'yi yazdirin, sonra a'yi 1 artirin

        System.out.println("a'nin degeri : " + a); // a'nin degeri : 10

        a++;

        // bu satira geldigimizde a'nin degeri 11

        // System.out.println("artirdiktan sonra a : " + a); // artirdiktan sonra a : 11


        a= 10;

        // once a'nin degerini 1 artirin,
        // sonra a'nin degerini b isminde olusturacaginiz variable'a atayin

        a++;

        int b = a ;

        // bu satir a : 11    b: 11
    }
}
