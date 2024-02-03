package day12_constructors;

public class C06_ConstructorCall {

    C06_ConstructorCall(){

        // C06_ConstructorCall(); // Method call expected
        // isim() seklinde yazim method call icin kullanildigindan
        // constructorlar icin farkli bir kullanim olusturulmustur.

        // constructor call icin this(parametreler)

        this("Ali");  // bu class'da string parametreli constructor calissin

        System.out.println("Parametresiz constructor calisti");
    }

    C06_ConstructorCall(String str){
        System.out.println("Parametreli constructor calisti");
    }

    C06_ConstructorCall(int sayi){
        System.out.println("Parametreli constructor calisti");
    }


    public static void main(String[] args) {

        method1();

        C06_ConstructorCall obj = new C06_ConstructorCall();

    }


    public static void method1(){
        methdod2();
        System.out.println("method1 calisti");

    }

    public static void methdod2(){
        System.out.println("method2 calisti");
    }

    void C06_ConstructorCall(String kelime){

    }
}
