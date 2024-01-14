package day07_methodOlusturmaVeKullanma;

public class C03_MethodOlusturma {

    public static void main(String[] args) {

        String str = "Java";

        // System.out.println(str.length()); // 4

        int metinUzunlugu = str.length();


        String isim = "Ali";
        String soyisim = "can";

        // ismin tamami kucuk harf, soyismin tamami buyuk harf
        // olacak sekilde ismi kaydedin

        // System.out.println(isim.toLowerCase() + " " + soyisim.toUpperCase()); // ali CAN

        String istenenFormat = isim.toLowerCase() + " " + soyisim.toUpperCase();

        System.out.println(istenenFormat); // ali CAN
    }
}
