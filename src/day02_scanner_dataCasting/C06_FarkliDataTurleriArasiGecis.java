package day02_scanner_dataCasting;

public class C06_FarkliDataTurleriArasiGecis {

    public static void main(String[] args) {

        boolean bl = true;
        boolean bl2 = false;

        char chr = 'e';

        byte byt = 12;
        short shr= 50;
        int int1 = 200;
        long lng = 1000;

        float fl = 23.4f;
        double dbl= 45.1;

        String str = "java";

        // bl = chr;
        // bl = int1;
        // bl = str;
        bl = bl2;
        // boolean bir variable'a sadace boolean deger atayabiliriz

        // str = bl;
        // str = chr ;
        // str = int1;

        // String data turundeki bir variable' sadece String degerler atayabiliriz


        dbl = byt;
        dbl = shr;
        dbl = int1;
        dbl = lng;
        dbl = fl;
        dbl = chr;

        lng = byt; // Auto widening
        lng = shr; // Auto widening
        lng = int1;// Auto widening
        lng = (long)fl; // explicit narrowing
        lng = (long)dbl;// explicit narrowing
        lng = chr;

        shr = byt;
        shr = (short)int1;
        shr = (short) lng;
        shr = (short) fl;
        shr = (short) dbl;
        shr = (short) chr;

    }
}
