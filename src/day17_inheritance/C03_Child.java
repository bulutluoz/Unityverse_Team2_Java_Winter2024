package day17_inheritance;

public class C03_Child extends C02_Parent{

    C03_Child(){ super();
        System.out.println("Child constructor calisti");
    }

    String isim = "Child isim";
    String dogumYeri = "Child dogum yeri";
    int yas = 20;

    public static void main(String[] args) {

        C03_Child child1 = new C03_Child();

        child1.isim = "Ali";
        System.out.println(child1.isim); // Ali
        System.out.println(child1.dogumYeri); // Child dogum yeri
        System.out.println(child1.yas); // 20

        // child class'dan olusturulan obje
        // sadece kendi class'indaki ozellikleri kullanmakla kalmaz
        // parent class(lar)'daki ozelliklere de sahip olur

        System.out.println(child1.tel); // Parent telefon
        System.out.println(child1.adres); // Adres GP

        /*
            Bir class'dan obje olusturulup,
            ilk deger atamalarinin yapilabilmesi icin
            mutlaka constructor calismalidir

            Child class'da olusturulan bir objenin
            parent class(lar)daki ozellikleri de tasiyabilmesi icin
            parent class(lar)daki constructor'lar calismalidir

            java bunu saglayabilmek icin
            su mekanizmayi olusturmustur

            ---- Extends keyword kullanan bir class'da
                 olusturulan HER CONSTRUCTOR'in ilk satirinda
                 MUTLAKA constructor call OLMALIDIR

                 Eger kodu yazan kisi
                 ilk satira gorunur bir constructor call yazmissa
                 java yazilan constructor call'u kullanir
                 ama gorunur bir constructor call yoksa
                 JAVA default olarak super(); yaz

                 kullanilan constructor
                 parametreli de olsa,
                 java'nin default olarak koydugu constructor call
                 parametresiz super(); olacaktir----
         */
    }
}
