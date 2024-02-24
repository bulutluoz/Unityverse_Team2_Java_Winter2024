package day18_inheritance_pollyMorphism;

public class C03_AvciKuslar extends C02_Kuslar{
    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        C03_AvciKuslar kartal1 = new C03_AvciKuslar();
        // Constructor ve data turu ayni ise, o class'a gider ilk buldugumuzu kullaniriz

        kartal1.omur(); // Ha yasar ve olurler
        kartal1.solunum(); // Ku Akcigerle solunum yapar
        kartal1.cogalma(); // Ku Yumurtayla cogalirlar
        kartal1.kanat(); // Ku kanatlidirlar
        kartal1.hareket(); // Av Ucarlar
        kartal1.gaga(); // Av sivri gagalidir
        kartal1.pence(); // Av Pencelidir
        kartal1.beslenme(); // Av etle beslenir



        C02_Kuslar kartal2 = new C03_AvciKuslar();
        // Objeyi AvciKuslar'dan olusturuyoruz ama
        // Kuslar class'indaki tum objelerin sahip oldugu ozellikleri kullanmak istiyoruz
        // aramaya kuslar class'indan (data turu) baslar, bulamazsa CTE verir
        // bulursa hemen kullanmaz, constructor'in oldugu class'a kadar
        // daha guncel bilgi var mi diye kontrol eder

        kartal2.omur(); // Ha yasar ve olurler
        kartal2.solunum(); // Ku Akcigerle solunum yapar
        kartal2.cogalma(); // Ku Yumurtayla cogalirlar
        kartal2.kanat(); // Ku kanatlidirlar
        kartal2.hareket(); // Av Ucarlar
        kartal2.gaga(); // Av sivri gagalidir
        //kartal2.pence(); // CTE Aramaya Kuslar'dan baslar ve pence() bulamaz
        kartal2.beslenme(); // Av etle beslenir



        C01_Hayvanlar kartal3 = new C03_AvciKuslar();

        kartal3.omur(); // Ha yasar ve olurler
        kartal3.solunum(); // Ku Akcigerle solunum yapar
        kartal3.cogalma(); // Ku Yumurtayla cogalirlar
        //kartal3.kanat(); // CTE Aramaya Hayvanlar'dan baslar ve kanat() bulamaz
        kartal3.hareket(); // Av Ucarlar
        //kartal3.gaga(); // CTE Aramaya Hayvanlar'dan baslar ve gaga() bulamaz
        //kartal3.pence(); // CTE Aramaya Hayvanlar'dan baslar ve pence() bulamaz
        kartal3.beslenme(); // Av etle beslenir


        C02_Kuslar kus1 = new C02_Kuslar();

        kus1.omur(); // Ha yasar ve olurler
        kus1.solunum(); // Ku Akcigerle solunum yapar
        kus1.cogalma(); // Ku Yumurtayla cogalirlar
        kus1.kanat(); // Ku kanatlidirlar
        kus1.hareket(); // Ha Hareket ederler
        kus1.gaga(); // Ku gagalidir
        //kus1.pence(); // CTE Aramaya Kuslar'dan baslar ve pence() bulamaz
        kus1.beslenme(); // Ha beslenir


        C01_Hayvanlar kus2 = new C02_Kuslar();

        kus2.omur(); // Ha yasar ve olurler
        kus2.solunum(); // Ku Akcigerle solunum yapar
        kus2.cogalma(); // Ku Yumurtayla cogalirlar
        // kus2.kanat(); // CTE Aramaya hayvanlar'dan baslar ve kanat() bulamaz
        kus2.hareket(); // Ha Hareket ederler
        // kus2.gaga(); // CTE Aramaya hayvanlar'dan baslar ve gaga() bulamaz
        // kus2.pence(); // CTE Aramaya hayvanlar'dan baslar ve pence() bulamaz
        kus2.beslenme(); // Ha beslenir
















    }

}
