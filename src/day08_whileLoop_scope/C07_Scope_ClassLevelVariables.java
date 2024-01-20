package day08_whileLoop_scope;

public class C07_Scope_ClassLevelVariables {

    static String strStatic  = "Java";
    String strInstance = "Candir";
    static String str;
    static char chr;
    static boolean bl;
    static int sayi;

    /*
        1- Class level'da olusturulan variable'lar
           static variable ve instance variable olmak uzere ikiye ayrilir
           instance variable, static olmayan variable demektir.
        2- Class level'da olusturulan variable'larin scope'u tum class'dir
           yani bu variable'lar tum class'dan kullanilabilirler
           Ancak bu konuda static keyword de rol oynar
        3- Class level variable'lar deger atanmadan deklare edilebilir ve kullanilabilir
           Eger class level bir variable'a class'i olusturanlar deger atamazsa
           java data turune gore default degerler atar
            String ve diger non-primitive'ler ==> null
            sayisal primitive'ler ==> 0
            boolean ==> false
            char ==> hiclik
     */

    public static void main(String[] args) {

        System.out.println(strStatic);
        // System.out.println(strInstance);
        System.out.println("str : "+str); // null
        System.out.println("chr : "+chr); // hiclik
        System.out.println("bl : " + bl); // false
        System.out.println("sayi : " + sayi); // 0
    }

    public static void method1(){
        strStatic = "Hava";
        //strInstance= "Guzeldir";
    }

    public void method2(){
        strStatic = "Tava";
        strInstance = "Mukemmeldir";
    }
}
