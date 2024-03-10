package day22_collections_maps;

import java.util.HashMap;
import java.util.Map;

public class C04_MapOlusturma {

    public static void main(String[] args) {

        /*
            Bir map olusturmadan once , su kararlari vermeliyiz
            1- Hangi bilgiler tutulacak   ==> Okul no, isim, soyisim, sinif, sube, bolum
            2- hangi bilgi unique key olacak ==> Okul No
            3- Geriye kalan tum bilgiler nasil tek bir value haline getirilecek ==> String
            4- Bu String icinde bilgiler hangi sira ile tutulacak ? ==> isim, soyisim, sinif, sube, bolum
            5- Value'de bilgiler arasinda hangi ayirav olacak ? ==> -
         */

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

        // Map'deki tum Key'leri bir Set olarak verir
        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 107]

        // Eger bir key'in map'de olup olmadigini kontrol etmek istersek

        System.out.println(ogrenciMap.containsKey(105)); // true
        System.out.println(ogrenciMap.containsKey(110)); // false

        // map'deki tum value'leri elde etmek istersek

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        // Ismi Ali olan bir ogrenci var mi ?
        // Burada Value'u  bir String olarak olusturduk
        // String'in icindeki bilgileri degil, butun olarak bir ogrenci value'sunu aratabiliriz

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.containsValue("Veli-Cem-10-K-TM")); // true

        // bir key'e ait value'yu gormek icin

        System.out.println(ogrenciMap.get(105)); // Sevgi-Cem-11-M-TM
    }
}
