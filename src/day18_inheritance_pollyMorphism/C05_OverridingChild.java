package day18_inheritance_pollyMorphism;

public class C05_OverridingChild extends C04_OverridingParent{

    /*
        Overriding child class'daki bir method'un parent class'i
        override = gecersiz kilmasidir
     */

    public void method1(){
        // child class'daki method'un
        // override edebilmesi icin parent class'daki method ile
        // isimleri ve signature'lari ayni olmalidir
        System.out.println("Child method1");
    }

    @Override
    public void method2() {
        /*
            override icin method'u kendimiz olusturmak zorunda degiliz
            istersek menu'den generate/ override methods secerek
            override edecekl method'u olusturabiliriz

            Override method'u intelliJ'ye olusturtunca
            intelliJ @Override notasyonu kullanir
            bu notasyon mecburi degildir
            ama faydali bir ozelligi vardir

            Eger @Override notasyonu kullanirsak
            bu notasyon parent class'daki overridden method'u kontrol eder
            o method silinirse veya override islemini engelleyecek sekilde bir degisiklik yapilirsa
            CTE verir
         */
    }


     public void method3(){
        /*
            Her ne kadar signature dahil olmasa da
            ovverriding icin access modifier da onemlidir

            Child class'daki overriding method'un access modifier'i
            parent class'daki overridden method'un access modifier'indan
            daha kisitlayici olamaz
         */
    }
}
