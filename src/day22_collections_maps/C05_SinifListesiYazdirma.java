package day22_collections_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C05_SinifListesiYazdirma {

    public static void main(String[] args) {

        // 10.sinif'daki ogrencilerin
        // No, isim, soyisim ve subelerini bir liste olarak yazdirin

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);

        /*
                {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
                }
         */

        // Hem key, hem de value'dan bazi bilgiler gerektigi icin
        // Tum ogrencileri gozden gecirip
        // 10.sinifta olanlarin istenen bilgilerini yazdirmaliyiz

        // 1- Tum ogrencilere ulasabilmek icin Tum key'leri bir Set olarak kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107]

        // 2- Tum key'leri tek tek ele alip, o key'e ait value'u incelemek
        //    ve sartlara uyanlarin bilgilerini yazdirmak icin bir for-each loop olusturalim

        System.out.println("No Sube  Isim Soyisim");
        for ( Integer eachKey : ogrenciKeySeti
             ) { // 101

            String value = ogrenciMap.get(eachKey); // "Ali-Can-11-H-MF"

            // 3- Ogrenci value'su bir butun olarak String yapildigindan
            //    tek tek bilgilere ulasmak icin - kullanarak split edelim

            String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

            // 4- Artik bizden istenen sartlari kontrol edebilir
            //    ve o sartlari saglayan ogrencilerin
            //    istenen bilgilerini yazdirabiliriz

            if (valueArr[2].equals("10") ){
                System.out.println(
                      eachKey + "   "  +   // no
                      valueArr[3] + "  " +   // sube
                      valueArr[0] + "  " +  // isim
                      valueArr[1] // soyisim
                );
            }
        }









    }
}
