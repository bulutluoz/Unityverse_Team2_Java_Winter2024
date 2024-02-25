package day19_abstractClass_interface;

public class C02_ChildOfKuralciOlmayanParent extends C01_KuralciOlmayanParent{

    public void method2(){
        System.out.println("Child class method2");
    }

    public void method4(){
        System.out.println("Child class method4");
    }
    public static void main(String[] args) {

        /*
            Klasik inheritance kullandigimizda
            tum kararlari child class verir
            - child class, istedigi class'i parent edinebilir
            - eger child isterse, kendisi hic bir method olusturmadan
              parent class'daki method'lari kullanabilir
            - child class isterse parent class'daki method'lari override edebilir
            - child class isterse, parent class'da olmayan yeni method'lar ekleyebilir
         */

        C02_ChildOfKuralciOlmayanParent obj = new C02_ChildOfKuralciOlmayanParent();
        obj.method1();
    }

}
