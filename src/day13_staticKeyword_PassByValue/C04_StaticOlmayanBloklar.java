package day13_staticKeyword_PassByValue;

public class C04_StaticOlmayanBloklar {
    /*
        static olmayan bloklar
        bir obje olusturulmak istendiginde
        obje olusturulmadan once yapilacak islem varsa
        halletmek icin kullanilir

        diger bir deyisle
        obje olusturulacaksa, static olmayan blok calisir
        obje olusturulmazsa calismaz

     */

    C04_StaticOlmayanBloklar(){
        System.out.println("Constructor calisti");
    }

    {
        System.out.println("static olmayan blok calisti");
    }

    {
        System.out.println("static olmayan 2.blok calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");

        C04_StaticOlmayanBloklar obj1 = new C04_StaticOlmayanBloklar();
        C04_StaticOlmayanBloklar obj2 = new C04_StaticOlmayanBloklar();

    }


}
