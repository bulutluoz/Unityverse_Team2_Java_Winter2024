package day19_abstractClass_interface;

public class C09_ChildOfInterface implements C08_Interface{


    @Override
    public void method1() {

    }
    @Override
    public void method2() {

    }
    @Override
    public void method3() {

    }
    @Override
    public void method4() {

    }


    public static void main(String[] args) {

        System.out.println(SAYI1); // 10
        System.out.println(SAYI4); // 40

        // sayi2 = 30;
        // Cannot assign a value to final variable 'sayi2'

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Short.MIN_VALUE); // -32768
    }
}
