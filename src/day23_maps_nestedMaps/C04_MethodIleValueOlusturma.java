package day23_maps_nestedMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C04_MethodIleValueOlusturma {

    public static void main(String[] args) {
        // {
        //     101={Bolum=MF, Soyisim=Can, Sube=H, Sinif=11, Isim=Ali},
        //     102={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=10, Isim=Veli},
        //     103={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=11, Isim=Ali},
        //     104={Bolum=MF, Soyisim=Can, Sube=H, Sinif=10, Isim=Ayse},
        //     105={Bolum=TM, Soyisim=Cem, Sube=M, Sinif=11, Isim=Sevg}
        //     }

        Map<Integer, Map<String,String>> nestedOgrenciMap = new HashMap<>();

        nestedOgrenciMap.put(101,ogrenciValueMap("Ali","Can","11", "H", "MF") );
        nestedOgrenciMap.put(102,ogrenciValueMap("Veli","Cem","10", "K", "TM") );
        nestedOgrenciMap.put(103,ogrenciValueMap("Ali","Cem","11", "K", "TM") );
        nestedOgrenciMap.put(104,ogrenciValueMap("Ayse","Can","10", "H", "MF") );
        nestedOgrenciMap.put(105,ogrenciValueMap("Sevg","Cem","11", "M", "TM") );

        System.out.println(nestedOgrenciMap);

        // Sinifi 11 olanlari 12, 10 olanlari 11 yapalim

        // 1- Tum ogrencilere ulasabilmek icin Key'leri kaydet

        Set<Integer> ogrenciKeySeti = nestedOgrenciMap.keySet();

        // 2- her bir key'i elden gecirmek icin bir for-each loop kullanalim

        for (Integer eachKey : ogrenciKeySeti
             ) {

            String eskiSinif = nestedOgrenciMap.get(eachKey).get("Sinif");


            if (eskiSinif.equals("10")){
                // sinifi 11 olarak update edelim
                nestedOgrenciMap.get(eachKey).put("Sinif","11");

            }else {
                nestedOgrenciMap.get(eachKey).put("Sinif","12");
            }

        }

        System.out.println(nestedOgrenciMap);




    }


    public static Map<String,String> ogrenciValueMap(String isim, String soyisim, String sinif, String sube, String bolum ){

        Map<String,String> ogrenciValueMap = new HashMap<>();
        ogrenciValueMap.put("Isim" , isim);
        ogrenciValueMap.put("Soyisim" , soyisim);
        ogrenciValueMap.put("Sinif" , sinif);
        ogrenciValueMap.put("Sube" , sube);
        ogrenciValueMap.put("Bolum" , bolum);

        return ogrenciValueMap;
    }
}
