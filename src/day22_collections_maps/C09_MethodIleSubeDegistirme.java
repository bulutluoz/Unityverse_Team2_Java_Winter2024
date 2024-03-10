package day22_collections_maps;

import java.util.Set;

public class C09_MethodIleSubeDegistirme extends OgrenciMap{

    public static void main(String[] args)  {

        // sinif ve eski subesi verilen ogrencileri
        // verilen yeni sube'ye geciren bir method olusturun

        // 11 H --> B  11 H deki butun ogrencileri 11-B 'ye tasiyacak

        System.out.println("map'in ilk hali : "+ ogrenciMap);

        subeDegistir(11,"H","B");

        subeDegistir(11,"M","A");

        System.out.println("map'in son hali : "+ ogrenciMap);



    }

    public static void subeDegistir(int sinif, String eskiSube , String yeniSube){

        // update yapabilmek icin key ve value'yu birlikte kullanmaliyiz

        // 1- butun key'leri kaydet

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- her bir ogrenciyi kontrol etmek icin for-each loop olusturalim

        for ( Integer eachKey : ogrenciKeySeti
             ) { // 102

            // 3 - gelen key'e ait eski value'yu kaydedelim

            String eskiValue = ogrenciMap.get(eachKey); // "Veli-Cem-10-K-TM"

            // 4- eski value'yu kontrol ve update yapabilmek icin split yapalim

            String[] eskiValueArr = eskiValue.split("-"); // [Veli, Cem, 10, K, TM]

            // 5- sartlari kontrol edip, uyanlari update edelim

            if ( (sinif+"").equals(eskiValueArr[2]) &&  eskiSube.equalsIgnoreCase(eskiValueArr[3])){
                eskiValueArr[3] = yeniSube;
            }

            // 6- guncelledigimiz array'i map'e kaydedebilmek icin
            //    array'i valuer formatinda birlestirelim

            String yeniValue = String.join("-",eskiValueArr);

            // 7 - key ve yeni value'yu kullanarak map'i update edelim

            ogrenciMap.put(eachKey,yeniValue);
        }

    }
}
