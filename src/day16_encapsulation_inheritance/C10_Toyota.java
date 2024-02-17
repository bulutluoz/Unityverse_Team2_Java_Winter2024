package day16_encapsulation_inheritance;

public class C10_Toyota extends C09_Araba{

    // parent class'da olup, guncellelemek istediklerimiz
    String marka = "Toyota";
    String motor = "Toyota cevreci motor kullanir";

    // parent class'da olmayip
    // tum toyota araclarda oldugu icin buraya ekleyecegimiz ozellikler

    String lastik = "Toyota pirelli lastik kullanir";
    String guvenlik = "Toyota guvenlik standardi uygulanir";
    String cekis = "Toyota araclar onden cekislidir";

}
