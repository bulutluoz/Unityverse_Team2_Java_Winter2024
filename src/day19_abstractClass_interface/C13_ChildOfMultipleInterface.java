package day19_abstractClass_interface;

public class C13_ChildOfMultipleInterface extends C10_ConcreteParent
                                          implements C11_Interface,C12_Interface  {


    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    public static void main(String[] args) {


        // Kullanmak istediginiz variable
        // birden fazla parent'da varsa
        // static yontemi kullanarak
        // classIsmi.varibleIsmi yazabiliriz
        System.out.println(C11_Interface.sayi);
        System.out.println(C10_ConcreteParent.sayi);
        System.out.println(C12_Interface.sayi);
        // sadece 1 interface de olan variable'lari ise
        // direk kullanabiliriz
        System.out.println(no);
        System.out.println(yas);
    }
}
