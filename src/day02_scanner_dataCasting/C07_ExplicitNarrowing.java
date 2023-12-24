package day02_scanner_dataCasting;

public class C07_ExplicitNarrowing {

    public static void main(String[] args) {

        // Auto widening yaptigimizda variable degeri ayni kalir
        // sadece ondalikli sayi olan float veya double'a cevirirseniz
        // sayinin sonuna .0 gelir
        byte by1 = 23;

        int in1 = by1;

        System.out.println("int'a cevrilen by1 : " + in1); // 23

        long ln1 = by1;

        System.out.println("long'a cevrilen by1 : " + ln1); // 23


        double dbl1 = by1;

        System.out.println("long'a cevrilen by1 : " + dbl1); // 23.0


        // AMMA explicit narrowing yaptigimizda
        //  - eger sayi daraltilan data turunun sinirlari icinde ise sayida degisim olmaz
        //  - eger sinirlarin icinde degilse degerde kayiplar veya degisimler olabilir

        int in2 = 100;

        byte by2 = (byte)in2;

        System.out.println("byte'a cevrilen in2 : " + by2); // 100

        short sh1 = (short)in2;

        System.out.println("short'a cevrilen in2 : " + sh1); // 100

        double dbl2 = 23.56;

        int in3 = (int)dbl2;

        System.out.println("int'a cevrilen dbl2 : " + in3); // 23


    }
}
