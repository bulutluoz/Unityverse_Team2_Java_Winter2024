package day22_collections_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C08_SoyisimIleOgrenciBulmaMethodIle {

    static Map<Integer, String> ogrenciMap = new HashMap<>();

    public static void main(String[] args) {
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        soyisimdenOgrenciListele("han");


    }

    public static void soyisimdenOgrenciListele(String soyisim){
        // Soyadi parametre olarak verilen ogrencilerin
        // no sinif sube isim ve soyisimlerini bir liste olarak yazdirin

        // 1- Tum key'leri kaydet
         Set<Integer> ogrenciKeySeti =  ogrenciMap.keySet();

         // 2- herbir key'i elden gecirmek icin bir for-each loop olusturalim

        for (Integer eachKey : ogrenciKeySeti
             ) { // 103

            // 3- for-each loop'un getirdigi key'e ait value'u kaydet
            String value = ogrenciMap.get(eachKey); // "Ali-Cem-11-K-TM"

            // 4- bilgilere ulasabilmek icin - ile split yapalim
            String[] valueArr = value.split("-"); // [Ali, Cem, 11, K, TM]

            // 5- istenen sarti saglayan ogrencileri if ile belirleyip
            //    yazdirilmasi gerekenleri yazdiralim
            if (valueArr[1].equalsIgnoreCase(soyisim)){
                System.out.println(
                       eachKey + "   "+ // no
                       valueArr[2]+ "   " + // sinif
                       valueArr[3]+ "   " + // sube
                       valueArr[0]+ " " + // isim
                       valueArr[1] // soyisim

                );
            }



        }

    }
}
