package day08_whileLoop_scope;

public class C06_Scope_LocalVariable {

    int sayiClass = 30;
    static int sayiClassStatic = 25;


    public static void main(String[] args) {

        /*
            1- Local variable bir method veya kod blogunun icinde olusturulur
               ve sadece olusturuldugu kod blogunda gecerli olur, baska yerden kullanilamaz
            2- Local variable'lar deger atanmadan deklare edilebilir
               ama deger atanmadan kullanilamaz
            3- Loop gibi bir kod blogunun icinde olusturulan variable'lar
               sadece o blokda gecerli olur.
               for loop bir method icinde olsa da
               for loop'un icinde olusturulan variable, loop'un disinda kullanilamaz
         */

        int sayiMain = 20;
        System.out.println(sayiMain); // 20
        // System.out.println(sayiMethod2);

        for (int i = 1; i <=5 ; i++) {
            String isim = "Java";
            System.out.println(isim); // Java
            System.out.println(sayiMain); // 20
        }

        // System.out.println(i);
        // System.out.println(isim);
    }


    public static void method1(){
        int sayiMethod1 = 30;
        //System.out.println(sayiMain);
        // System.out.println(sayiMethod2);
    }


    public void method2(){
        int sayiMethod2 = 40;
        //System.out.println(sayiMain);
    }
}
