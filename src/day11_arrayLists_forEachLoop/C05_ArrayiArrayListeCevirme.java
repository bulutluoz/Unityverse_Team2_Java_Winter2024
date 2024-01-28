package day11_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiArrayListeCevirme {

    public static void main(String[] args) {

        // Olusturmak istedigimiz liste uzun bir liste ise
        // elemanlari tek tek eklemek zahmetli bir is
        // bunun yerine istenen listeyi once array olarak tanimlayip,
        // sonra bu array'i list'e cevirebiliriz


        // Verilen urunler listesinde,
        // tekrar eden urunleri silip
        // listeyi duzenleyelim

        String[] urunler = {"Nutella","Pirinc","Ekmek","Seker","Sut","Sut","Seker","Cokoprens",
                            "mercimek","nohut","simit","beyaz peynir"}   ;

        // array'i list'e cevirmek icin 2 yontem var
        // 1- bir list olusturup, bir loop ile array'deki tum urunleri list'e kopyalayabiliriz

        List<String> urunlerListesi = new ArrayList<>();

        for (int i = 0; i < urunler.length ; i++) {

            urunlerListesi.add(urunler[i]);
        }

        System.out.println("Urunler Listesi : " + urunlerListesi);
        // Urunler Listesi : [Nutella, Pirinc, Ekmek, Seker, Sut, Sut, Seker, Cokoprens, mercimek, nohut, simit, beyaz peynir]


        // 2- hazir method kullanabiliriz
        //    Ancak hazir method kullaniminda 2 adet sorun vardir
        //    bu sorunlar, gorevimizi gerceklestirirken bizim icin problem olmuyorsa
        //    hazir method'u kullanabiliriz
        //    - Array'den cevirdigi icin bu listede ekleme-silme gibi
        //      uzunlugu degistiren method'lar KULLANILAMAZ
        //    - Hazir method ile cevrilen list ve kaynak array'i ilisiklendirir
        //      birinde yapilan degisikligi, otomatik olarak digerine de isler


        List<String> urunlerHazirMethodList = Arrays.asList(urunler);
        System.out.println("Hazir method ile cevrilen list : " + urunlerHazirMethodList);
        // Hazir method ile cevrilen list : [Nutella, Pirinc, Ekmek, Seker, Sut, Sut, Seker, Cokoprens, mercimek, nohut, simit, beyaz peynir]

        // urunlerHazirMethodList.remove("Sut"); // UnsupportedOperationException


        // hazir method kullanarak array'i list'e cevirdikten sonra
        // array'de bazi degisiklikler yapalim
        urunler[0] = "Sarelle";
        urunler[1] = "Bulgur";

        System.out.println("Array'de degisiklik yaptiktan sonra Hazir method ile cevrilen list : " + urunlerHazirMethodList);
        // Array'de degisiklik yaptiktan sonra Hazir method ile cevrilen list :
        // [Sarelle, Bulgur, Ekmek, Seker, Sut, Sut, Seker, Cokoprens, mercimek, nohut, simit, beyaz peynir]

    }
}
