package day16_encapsulation_inheritance;

public class C03_Pazarlama {

    private int satisTutari; // satis tutarina disardan deger atanabilsin
                            // atanan miktarlar otomatik olarak toplam satis tutarina eklensin
                            // ama atanan degerler veya satis miktarlari YAZDIRILAMASIN

    private int toplamSatisTutari;  // class disindan gorulebilsin
                                    // ama kimse bu variable'a atama yapamasin


    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }
}
