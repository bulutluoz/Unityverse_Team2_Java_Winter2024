package day13_staticKeyword_PassByValue;

public class C05_PassByValue {

    static int fiyat1 = 300;
    static int fiyat = 500;

    public static void main(String[] args) {
        /*
            PassByValue : method'lar arasinda bir variable gonderilmesi gerektiginde
                          (yani method'a gondermek icin variable ismini yazdigimizda)
                          o variable'in kendisinin DEGIL, value'sunun gonderilmesine denir

                          Bu bizim verecegimiz bir karar degildir.
                          yazilim dilleri kendilerinin
                          passByValue/passByReference oldugu deklare eder
                          biz de kodlarimizi buna gore yazariz
         */

        int fiyat = 100;

        // int fiyat = 200; // Variable 'fiyat' is already defined in the scope
        // String fiyat = "200"; // Variable 'fiyat' is already defined in the scope

        System.out.println(fiyat); // 100
        System.out.println(fiyat1); // 300

        // satis yaparken saticiya %10, %20 ve %30 indirim yetkisi verilmistir
        // her bir indirim miktari icin bir method olusturun
        // bu method'larda indirimli fiyati hesaplayip, yazdirin

        yuzde10IndirimYap(fiyat); // %10 indirimli fiyatiniz : 90
        System.out.println(fiyat); // 100
        yuzde20IndirimYap(fiyat); // %20 indirimli fiyatiniz : 80
        yuzde30IndirimYap(fiyat); // %30 indirimli fiyatiniz : 70
        System.out.println(fiyat); // 100

    }

    public static void yuzde10IndirimYap(int fiyat){

        fiyat = fiyat * 90 / 100;

        System.out.println("%10 indirimli fiyatiniz : " + fiyat);
    }

    public static void yuzde20IndirimYap(int fiyat){

        fiyat = fiyat * 80 / 100;

        System.out.println("%20 indirimli fiyatiniz : " + fiyat);
    }

    public static void yuzde30IndirimYap(int fiyat){

        fiyat = fiyat * 70 / 100;

        System.out.println("%30 indirimli fiyatiniz : " + fiyat);
    }

}
