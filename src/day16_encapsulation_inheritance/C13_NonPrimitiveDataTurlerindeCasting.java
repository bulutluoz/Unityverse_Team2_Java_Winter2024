package day16_encapsulation_inheritance;

public class C13_NonPrimitiveDataTurlerindeCasting {

    public static void main(String[] args) {

        int sayi = 10;

        double dbl = sayi; // otomatik genisletme

        byte byt = (byte) sayi;  // explicit narrowing


        // Non-Primitive'lerde casting sadece
        // Parent-Child class'lar arasinda olabilir

        Integer sayi2 = 20;

        // Double dbl2 = sayi2;

        // Short shrt = sayi2;

        Object obj = sayi2; // Object has-a Integer  Auto - widening

        Integer sayi3 = (Integer) obj; // Integer Is-a Object  explicit narrowint


        C11_Corolla corolla1 = new C11_Corolla();
        C10_Toyota corolla2 = new C11_Corolla(); // Corolla is-a Toyota
        C09_Araba corolla3 = new C11_Corolla(); //  Corolla is-a Araba
        Object corolla4 = new C11_Corolla(); // Corolla is-a Object
    }
}
