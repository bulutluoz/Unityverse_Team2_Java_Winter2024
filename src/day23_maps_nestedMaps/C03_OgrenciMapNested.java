package day23_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_OgrenciMapNested {

    public static void main(String[] args) {

        //        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        //        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        //        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        //        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        //        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");


        Map<Integer,Map<String,String >> ogrenciNestedMap = new HashMap<>();

        // 101 numarali ogrencinin key ==>101
        //                         value ==> isim=Ali, soyisim=Can....

        // 101 numarali ogrenciyi ogrenci map'ine eklemek icin
        // oncelikle value map'ini olusturmaliyiz

        Map<String,String> ogrenci101Value = new HashMap<>();
        ogrenci101Value.put("Isim","Ali");
        ogrenci101Value.put("soyisim","Can");
        ogrenci101Value.put("Sinif","11");
        ogrenci101Value.put("Sube","H");
        ogrenci101Value.put("Bolum","MF");

        ogrenciNestedMap.put(101,ogrenci101Value);

        System.out.println(ogrenciNestedMap);
        // {101={Bolum=MF, Sube=H, Sinif=11, soyisim=Can, Isim=Ali}}


        // 101 numarali ogrencinin ismini yazdiralim

        System.out.println(ogrenciNestedMap.get(101).get("Isim")); // Ali

        // subesini yazdir

        System.out.println(ogrenciNestedMap.get(101).get("Sube")); // H

        // bolumunu SAY yapin

        ogrenciNestedMap.get(101).put("Bolum","SAY");
        System.out.println(ogrenciNestedMap);


    }


}
