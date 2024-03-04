package day20_exceptions;

public class C06_ClassCastException {

    public static void main(String[] args) {

        String str = "Java";

        // Integer sayi = str;


        Object obj = str ;  // String IS-A Object , otomatik genisletir

        Integer sayi  = (Integer) obj;  // Object HAS-A Integer, casting yapabiliriz


        // ClassCastException
        // class java.lang.String cannot be cast to class java.lang.Integer
    }
}
