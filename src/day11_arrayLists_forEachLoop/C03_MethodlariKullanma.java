package day11_arrayLists_forEachLoop;

import java.util.List;
import java.util.Scanner;

public class C03_MethodlariKullanma {

    public static void main(String[] args) {

        // Kullanicidan isimler alarak bir liste olusturun
        // Kullanici Q'ya basincaya kadar isim almaya devam edin
        // Kullanici Q'ya bastiginda istenmeyen bir harf girmesini isteyin
        // listeden girilen harfi iceren isimleri silin
        // ve listeyi son haliyle kaydedin

        List<String> isimler = C02_KullaniciyaListeOlusturtma.listeOlustur();

        Scanner scanner = new Scanner(System.in);

        String girilenHarf = "";

        do {
            System.out.println("Istenmeyen harfi giriniz...");
            girilenHarf = scanner.nextLine();
        }while(girilenHarf.length() != 1);

        isimler = C01_ListedenIstenmeyenElemanlariSilme.istenmeyenIsimleriTemizle(isimler,girilenHarf);

        System.out.println(isimler);

    }
}
