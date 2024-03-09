package day21_Iterator_collections;

public class C01_Error {


    public static void main(String[] args) {

        method1();


        // String str = 23 ; // Bir syntax hatasi vardir ve duzeltmemiz icin Java bizi uyariyor
        String str = 23+"" ; // 11.satirda alti kirmiz cizilen satir duzeltilebilir
                             // ve bu durumda kod normal olarak calismaya devam eder
    }




    public static void method1(){

        // method1();

        // burada method1'in icinden tekrar method1() cagrildigindan
        // tam bir sonsuz dongu olusur

    }
}
