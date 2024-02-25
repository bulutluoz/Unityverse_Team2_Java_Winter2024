package day19_abstractClass_interface;

public interface C14_ParentInterface {

    /*
        Bir interface'e sonradan method eklenir mi ?

        Bir interface'e sonradan method eklemek
        interface acisindan HIC BIR SORUN olusturmaz

        ANCAK....
        Bir interface'e yeni bir abstract method eklendiginde
        o interface'i daha onceden implement etmis olan TUM CLASS'lari
        gozden gecirip, yeni eklenen method'u o class'lara uyarlamak zorunda kaliriz

        Ozellikle uzun zamandir devam eden projelerde
        bu tur eklemeler ciddi problemlere yol acabilir

        Java developer'lardan gelen talepler cercevesinde
        Java8 ile interface'lere bir istisna getirmistir.

        Java, Interface'e sonradan eklenen method'un
        child class'lar tarafindan implement edilme zorunlulugunun olmamasi icin
        ozel iki keyword kullanilarak isaretlenen method'larin
        body'si olmasina izin vermistir.

     */

    public void method1();

    public void method2();

    public void method3();

    public default void method4(){
        System.out.println("Interface'deki default olarak isaretlenen method");
    }

    public static void method5(){
        System.out.println("Interface'deki static olarak isaretlenen method");
    }



}
