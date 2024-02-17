package day16_encapsulation_inheritance;

public class C08_Child extends C07_Parent{

    String adres = "Child adres";
    String tel = "3122345678";

    public static void main(String[] args) {

        C08_Child child = new C08_Child();

        // 1- child class'daki tum objeler
        //    baslangic itibariyle parent class'daki
        //    tum ozelliklere sahip olurlar

        child.methodParent(); // Parent class'daki method calisti

        System.out.println(child.isim); // Parent isim


        // 2- child class isterse
        //    parent class'daki ozellikleri kendisine uyarlayabilir

        System.out.println(child.adres); // Child adres


        // 3- child class isterse
        //    parent class'da olmayan
        //    child class'a ozel, yeni ozellikler ekleyebilir

        System.out.println(child.tel); // 3122345678
    }
}
