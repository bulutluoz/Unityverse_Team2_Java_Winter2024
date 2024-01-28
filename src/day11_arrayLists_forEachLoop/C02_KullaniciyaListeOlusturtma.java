package day11_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        //         Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        //         bir method olusturun.

        System.out.println(listeOlustur());

    }


    public static List<String> listeOlustur(){

        List<String> isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String girilenIsim="";


        do {

            System.out.println("Lutfen listeye eklemek icin isim giriniz...");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);
            }


        }while(!girilenIsim.equalsIgnoreCase("Q"));

        return isimler;

    }
}
