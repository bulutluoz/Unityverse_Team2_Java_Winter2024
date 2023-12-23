package day01_javaGiris;

public class C03_VariableaDegerAtama {

    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); // 20

        /*
            java'daki = isareti matemetikteki ='den farklidir

            Java'da = isaretinin adi asignment sign (atama isareti)

            = isaretinin sol tarafinda sadece variable ismi olur
            = isaretinin saginda ise DEGER bulunur
            Java once o satir itibariyle degeri hesaplar
            sonra buldugu degeri variable'a assign eder (atama yapar)
         */
        // 3 * a = 2 * a + 1 ; // sol tarafta hata veriyor : Variable expected

        a = 2 * a + 1 ;

        System.out.println(a); // 41


        a = a - 5 ;

        System.out.println(a); // 36

    }
}
