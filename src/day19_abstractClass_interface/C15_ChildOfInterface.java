package day19_abstractClass_interface;

public class C15_ChildOfInterface implements C14_ParentInterface{


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        // Implement edilen interface'de
        // static veya default keyword'u kullanilarak olusturulan
        // body'li method'larin farki, erisim bicimindedir

        // static keyword kullanan method'a static yol ile ulasabilirsiniz
        C14_ParentInterface.method5();

        // default keyword kullanan method'a ise obje olusturarak ulasabilirsiniz

        C15_ChildOfInterface obj = new C15_ChildOfInterface();
        obj.method4();
    }
}
