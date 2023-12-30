package day03_wrapperClasses_MatematikselIslemler;

public class C04_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        // Java'da ++ ve -- islemi variable'dan once de yazilabilir

        int a = 20;

        a++;

        System.out.println(a); // 21


        a = 20;

        ++a;

        System.out.println(a); // 21

        // ++a ve a++'nin yazildigi satirdan bir sonraki satirda durumlari aynidir
        // ikisi de a'yi bir artirir


        // Farklari : yazildiklari satirda, birden fazla islem varsa
        // ++a : once artirmayi yap, sonra satirdaki diger islemi yap demektir
        // a++ : once satirdaki diger islemi yap, sonra artirmayi yap
        a= 20;
        System.out.println(a++); // 20 hem artirma, hem yazdirma
        System.out.println(a); // 21

        a= 20;
        System.out.println(++a); // 21
        System.out.println(a); // 21


        int c = 36;

        System.out.println(c++); // 36

        System.out.println(c); // 37


        int d = 25;

        System.out.println(--d); // 24

        System.out.println(d); // 24


        int e = 10;

        e--;

        System.out.println(e); // 9

        e++;
        e++;
        e++;

        System.out.println(e); // 12

        int k = 40;

        int l = k++;

        System.out.println(" k : " + k) ; // 41
        System.out.println(" l : " + l) ; // 40


        int m = 25;

        int n = ++m;

        System.out.println(" m : " + m); // 26
        System.out.println(" n : " + n); // 26

    }
}
