package day17_inheritance;

public class C11_AvciKuslar extends C10_Kuslar{

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";

    /*
        Java bir ozelligi
        variable olarak olusturmak ile
        method olarak olusturma arasinda bir kullanim farki kabul eder

        Bu farklilik bize istedigimizi yapma adina esneklik hakki verir

        Ozellikler variable olarak olusturulursa
        1- Eger data turu ve constructor ayni ise
           o class'dan aramaya baslariz ve ilk buldugumuz
           ozelligi kullaniriz

        2- Eger data turu ve constructor farkli ise
           aramaya data turu olan class'dan baslariz
           ve ilk buldugumuz ozelligi kullaniriz

     */

    public static void main(String[] args) {

        C11_AvciKuslar kartal1 = new C11_AvciKuslar();

        System.out.println(kartal1.omur); // Ha Yasar ve Olurler

        System.out.println(kartal1.solunum); // Ku Akcigerle
        System.out.println(kartal1.cogalma); // Ku Yumurta ile
        System.out.println(kartal1.kanat); // Ku Kanatlidirlar

        System.out.println(kartal1.hareket); // Av ucarlar
        System.out.println(kartal1.beslenme); // Av etle beslenir
        System.out.println(kartal1.gaga); // Av Sivri gagalidir
        System.out.println(kartal1.pence); // Av pencelidir


        C10_Kuslar kartal2 = new C11_AvciKuslar();
        // kartal'in butun kuslarla birlikte sahip oldugu ozellikleri
        // gormek istersek, obje bu sekilde olusturulabilir

        System.out.println(kartal2.omur); // Ha Yasar ve Olurler

        System.out.println(kartal2.solunum); // Ku Akcigerle
        System.out.println(kartal2.cogalma); // Ku Yumurta ile
        System.out.println(kartal2.kanat); // Ku Kanatlidirlar

        System.out.println(kartal2.hareket); // Ha hareket eder
        System.out.println(kartal2.beslenme); // Ha beslenirler
        System.out.println(kartal2.gaga); // Ku gagalidir
        // System.out.println(kartal2.pence); // aramaya kuslardan baslar ve pence bulamaz


        C09_Hayvanlar kartal3 = new C11_AvciKuslar();
        // kartal'in butun hayvanlarla ortak ozelliklerini gormek istiyoruz

        System.out.println(kartal3.omur); // Ha Yasar ve Olurler

        System.out.println(kartal3.solunum); // Ha nefes alirlar
        System.out.println(kartal3.cogalma); // Ha cogalirlar
        // System.out.println(kartal3.kanat); // aramaya hayvanlar'dan baslar ve bulamaz

        System.out.println(kartal3.hareket); // Ha hareket eder
        System.out.println(kartal3.beslenme); // Ha beslenirler
        // System.out.println(kartal3.gaga); // aramaya hayvanlar'dan baslar ve bulamaz
        // System.out.println(kartal3.pence); // aramaya hayvanlar'dan baslar ve bulamaz



















    }

}
