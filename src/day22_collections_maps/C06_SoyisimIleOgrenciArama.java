package day22_collections_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class C06_SoyisimIleOgrenciArama {

    public static void main(String[] args) {

        // Soyadi Can olan ogrencilerin
        // sinif sube isim ve soyisimlerini bir liste olarak yazdirin

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        // 1- soruda sadece value bilgileri kullanildigi icin
        //    key'leri degil value'leri kaydedelim

        Collection<String> valueCollection = ogrenciMap.values();
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        // 2 - herbir value'yu ele alip istenen sartlari kontrol etmek
        //     ve sartlara uyanlarin bilgilerini yazdirmak icin
        //     for-each loop olusturalim

        for ( String eachValue : valueCollection
             ) { // Ali-Can-11-H-MF

            // 3- bu value'deki bilgilere ulasabilmek icin - ile split yapalim

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]


            // 4- array uzerinden kontrolleri yapip, istenen bilgiyi yazdirabiliriz

            if (valueArr[1].equalsIgnoreCase("Can")){

                System.out.println(
                  // sinif sube isim ve soyisim
                  valueArr[2] + "   " +  // sinif
                  valueArr[3] + "   " +  // sube
                  valueArr[0] + "   " +  // isim
                  valueArr[1]  // soyisim
                );
            }

        }










    }
}
