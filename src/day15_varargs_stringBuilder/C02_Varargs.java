package day15_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        islem(2,"ali",3,4,5,6,7); // 2 + 3 + 7 ==> 12
        islem(5,"b",1); // 5 + 1 + 1 ==> 7
        // islem(3,"Java"); // ArrayIndexOutOfBoundsException c'ye eleman yazilmadigindan bos bir array degerini alir

        // verilen sayilardan, ilk sayi haric tamamini toplayip
        // toplam isleminin sonucu ile ilk sayinin carpimini yazdiran bir method olusturun

        islem2(2,3,4,5,6,7); // 2 * (3+4+5+7) ==> 50

        islem2(2,3); // 2 * 3 ==> 6

        islem2(4); // 4 * 0 ==> 0   geriye kalanlar array'i [] bos bir array olur, ama method'da ilk deger 0 atandigi icin

    }


    public static void islem (int a, String b , int... c){

        System.out.println(a + b.length() + c[c.length-1]);
    }

    public static void islem2(int ilkSayi, int... geriyeKalanlar){

        int geriyeKalanlarinToplami = 0;

        for ( int each: geriyeKalanlar
             ) {
            geriyeKalanlarinToplami += each;
        }

        System.out.println(ilkSayi * geriyeKalanlarinToplami);
    }
}
