package day19_abstractClass_interface;

public abstract class C03_KuralciAbstractParent {

    /*
        Eger Parent class'in kural koymasini istiyorsaniz, yapisini degistirmek zorundasiniz

        Bir Class'in child class'larini,
        belirledigi method'lari bulundurmaya MECBUR ETMESI icin
        parent class'in abstract yapida olmasi lazim

        Eger butun kurallari belirlemeyecekseniz,
        yani bazi method'lari uyarlamaya mecbur ederken,
        bazilarini child class'in inisiyatifine birakacaksaniz
        kismi abstraction uygulamalisiniz

        1- Kismi abstraction icin ABSTRACT CLASS'lar kullanilir

        2- Bir class'i abstract class haline getirmek icin
           class deklarasyonuna abstract yazmaniz yeterlidir

        3- Bir class'i abstract class yapinca,
           child class'larinin mutlaka bulundurmasini istedigi
           method'lari da abstract yapmalisiniz

         4- Eger abstraction'dan bahsediyorsak,
            bugune kadar kullandigimiz, abstract olmayan
            class ve method'lar icin CONCRETE tabiri kullanilir

         5- Bir class abstract bir class'i PARENT edinirse
            parent class'da kural koymak icin
            abstract(body'siz) olarak olusturulan tum method'lari
            concrete'lestirmelidir (body'li hale getirmelidir)

         6- Abstract class sadece kendini parent edinen
            ilk concrete class'i bu method'lari override etmeye zorlar
            concrete class'in child'lari olursa
            onlarin hic bir mecburiyeti olmaz

          7- Abstract bir class'in abstract child'i oldugunda
             bu child class da abstract oldugundan
             parent class'daki method'lari override etme mecburiyeti olmaz

          8- eger birbirini parent edinen
             birden fazla abstract class varsa
             bu abstract class'lardan sonra gelen ilk concrete class
             concrete'lestirilmemis method'lari
             concrete'lestirmelidir


     */

    // bu class'da child class'larin MUTLAKA OVERRIDE etmesini istedigimiz
    // method1 ve method2  (abstract method)
    // child class'larin isterse direk kullanabilecegi, isterse override edebilecegi
    // method3 ve method4 (concrete method)olsun

    public void method3(){
        System.out.println("parent method3");
    }

    public void method4(){
        System.out.println("parent method4");
    }

    public abstract void method1();// Abstract methods cannot have a body
    // abstract method'lar concrete method'lar gibi degildir
    // bir seye benzeteceksek,
    // abstract method'lar resmi gazetedeki kural belirleyen maddeler gibidir

    public abstract void method2(); // Abstract methods cannot have a body
}
