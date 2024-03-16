package day23_maps_nestedMaps;

import day22_collections_maps.OgrenciMap;

import java.util.Set;

public class C01_IstenenBilgilereUlasma extends OgrenciMap {

    public static void main(String[] args) {

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

        // MF bolumundeki ogrencilerin
        // no, isim, soyisim ve sinif bilgilerini yazdirin

        // 1- keyleri kaydet

        Set<Integer> ogrKeySeti = ogrenciMap.keySet();

        // 2- foreach loop ile key'leri elden gecir

        System.out.println("No  Isim Soyisim Sube");

        for (Integer eachKey : ogrKeySeti
             ) {

            // 3- for-each loop'un getirdigi key'in value'sunu kaydet

            String eachValue = ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF

            // 4- bilgilere ulasabilmek icin split ile array'e donustur

            String[] valueArr = eachValue.split("-"); // [Sevgi, Can, 10, K, MF]

            // 5- value'de istenen ozellik varsa, istenen bilgileri yazdir

            if (valueArr[4].equalsIgnoreCase("MF")){

                System.out.println(
                        eachKey+"  "+
                        valueArr[0] + "  "+
                        valueArr[1] + "  "+
                        valueArr[2]
                );
            }

            // Bolumu MF olanlari SAY yapin
            // 6- Array'de istenen degisikligi yap

            if (valueArr[4].equalsIgnoreCase("MF")){

                valueArr[4] = "SAY";
            }

            // 7- Array'deki update'i map'e kaydedebilmek icin
            //    array'deki bilgileri value formatina getirelim

            String yeniValue = String.join("-",valueArr);

            // 8- map'i update edelim

            ogrenciMap.put(eachKey,yeniValue);


        }

        System.out.println(ogrenciMap);

    }
}
