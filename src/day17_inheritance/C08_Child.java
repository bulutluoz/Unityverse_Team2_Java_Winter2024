package day17_inheritance;

public class C08_Child extends C07_Parent{

    String isim = "Child isim";
    String tel = "Child tel";
    public void method1(){
        System.out.println("Child method1");
    }
    public void method3(){
        System.out.println("Child method3");
    }
    public static void main(String[] args) {
        C08_Child obj = new C08_Child();
        obj.method4();
    }
    public void method4(){
       String isim = "Method isim";
       String dogumYeri = "Method dogum yeri";

       /*
            Java'da herhangi bir yerde
            bir class uyesine ulasmak isterseniz
            Java sirasi ile
                1- icinde bulundugumuz scope
                2- icinde bulundugumuz class
                3- parent class(lar)'a bakar
            ve ilk buldugunu kullanir

            eger this.classUyeIsmi  yazarsak, scope'a bakmadan 2.adima gecer
            eger super.classUyeIsmi  yazarsak scope ve class'a bakmadan 3.adima gecer

            aramaya basladigi yerden
            hep ileriye dogru gider
            bulamazsa CTE verir
            ama geriye donmez
        */

        method1(); // Child method1
        this.method1(); // Child method1
        super.method1(); // Parent method1

        method2(); // Parent method2
        this.method2(); // Parent method2
        super.method2(); // Parent method2

        method3(); // Child method3
        this.method3(); // Child method3
        // super.method3(); // CTE direk parent'a gider bulamaz

        System.out.println(tel); // Child tel , once scope, sonra class'a bakti
        System.out.println(this.tel); // Child tel, direk class'a bakti
        // System.out.println(super.tel); // CTE direk parent'a bakar bulamaz

        System.out.println(dogumYeri); // Method dogum yeri
        // System.out.println(this.dogumYeri); // CTE once class, sonra parent'a bakar bulamaz
        // System.out.println(super.dogumYeri); // CTE parent class bakar, bulamaz

        System.out.println(isim); //  Method isim
        System.out.println(this.isim); // Child isim
        System.out.println(super.isim); // Parent isim

        System.out.println(adres); // Parent adres ==> once scope,sonra class, sonra parent
        System.out.println(this.adres); // Parent adres ==> once class, sonra parent
        System.out.println(super.adres); // Parent adres ==> once parent


    }



}
