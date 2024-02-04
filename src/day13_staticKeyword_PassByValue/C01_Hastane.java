package day13_staticKeyword_PassByValue;

public class C01_Hastane {

    public static String hastaneIsmi = "Yildiz Hastanesi";
    public static String bashekimIsmi = "Doktor Kemal";
    public static String hastaneAdresi = "Cankaya";

    public String persIsmi = "Isim belirtilmedi";
    public String persTel = "Tel girilmedi";
    public String persAdres = "Adres girilmedi";

    /*
        instance variable'lar obje'ye baglidir
        baska class'dan kullanilmak istendiginde
        objeIsmi.instancevariableIsmi seklinde kullanilir

        static variable'lar claas'a baglidir
        ve baska class'dan kullanilmak istendiginde
        classIsmi.staticVariableIsmi seklinde kullanilmalidir

        NOT : static bir variable'i
        baska class'dan kullanirken
        objeIsmi.staticVariableIsmi seklinde kullanirsaniz
        java size variable'i otomatik olarak getirmez
        ancak siz manuel olarak yazarsaniz
        kullanmaniza itiraz etmez
        intelliJ ise bu kullanimi sariya boyar
        ve static bir variable'a static olmayan yolla ulasmaya calisyorsunuz
        (Static member 'day13_staticKeyword_PassByValue.C01_Hastane.hastaneIsmi' accessed via instance reference )
        diye bizi uyarir

        static variable'lar class'a baglidirlar
        ve tum objeler icin ortak olduklarindan
        Java herbir obje icin static variable'in bir kopyasini olusturmaz
        Class'a bagli kek bir variable olusturur
        ve class'in tum objeleri bu static variable'a ulasabilirler

        Bunun negatif tarafi,
        bir obje static variable'in degerini degistirirse
        tum objeler icin degismis olur

        pozitif tarafi
        tek bir variable oldugu icin
        yonetmesi kolaydir ve
        hafizada az yer kaplar


     */
}
