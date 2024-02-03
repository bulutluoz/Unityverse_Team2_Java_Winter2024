package day11_arrayLists_forEachLoop;

public class C09_Hastane {

    /*
        -Bir class'dan bir obje olusturuldugunda,
         Java olusturuldugu class'daki tum instance variable'larin
         bir kopyasini alip obje ile ilisiklendirir

        -bir obje olusturuldugunda ona ilk deger atamasini yapan
         yapi class'daki Constructor'dir.

         C09_Hastane  pers2         =          new       C09_Hastane();
         class ismi  obje ismi  assignment   keyword      Constructor

        -Biz bir class olusturdugumuzda Java o class'dan obje olusturulabilmesi icin
         class'a default constructor koyar

        -Default constructor, gozle gorunmez,
         parametresizdir, ve body'si bostur.
         Biz her hangi bir gorunur constructor olusturdugumuzda
         java default constructor'i siler

        -Constructor java'ya ozgu olarak calisir
         sadece bizim constructor icinde yazdigimiz kodlar degil,
         arka planda java'nin yazdigi kodlari da calistirir

        -Constructor'lar da method'lar gibi () barindirirlar.
         bir kod blogunun constructor olabilmesi icin
         ikli sarti saglamasi gerekir
           1- ismi class ismi ile bire-bir ayni olmalidir
           2- return type olmamalidir
     */

    public C09_Hastane(){

    }

    public static String hastaneIsmi = "Yildiz Hastanesi";
    public static String bashekimIsmi = "Doktor Kemal";
    public static String hastaneAdresi = "Cankaya";

    public String persIsmi = "Isim belirtilmedi";
    public String persTel = "Tel girilmedi";
    public String persAdres = "Adres girilmedi";

    public void C09_Hastane(){
        // naming convention'a gore method isimleri kucuk harfle baslamalidir
        // ama buyuk harfle de yazsaniz Java CTE vermez
        // Method name 'C09_Hastane' is the same as its class name
        // seklinde uyari verir ama altini kirmizi cizmez
        // bu method'un constructor degil, method oldugunu return type'in olmasindan anlariz
    }

    // public Hastane(){
        // ismi class ismi ile ayni olmadigindan, constructor olamaz
        // return type olmayinca method da olamaz
        // Java CTE veriyor
        // Invalid method declaration; return type required
    // }

}
