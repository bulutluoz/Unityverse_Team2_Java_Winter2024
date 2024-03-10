package day22_collections_maps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C02_TekrarlardanKurtulma {

    public static void main(String[] args) {

        // Soru :  Verilen bir array’deki
        //         tekrar eden elementleri silerek,
        //         her element’den sadece bir tane olacak sekilde yeni bir array olusturun.


        Integer[] sayilar = {2,5,6,2,5,3,4,6,5,3,2,6,5,6,5,6,5};

        Set<Integer> sayiSeti = new HashSet<>();
        sayiSeti.addAll(Arrays.asList(sayilar));

        System.out.println("Set olarak tekrarsiz sayilar : "+ sayiSeti); //  [2, 3, 4, 5, 6]

        sayilar = new Integer[sayiSeti.size()]; // [null, null, null, null, null]

        // sayilar array'ine
        // sayiSeti'ndeki elementleri atamamiz gerekir
        // Ancak Set index desteklemez ama array'de index olmadan atama yapamayiz
        // bu durumda index kullanmadigindan
        // for-each loop tercih edip, ayrica index'i takip etmeliyiz

        int index = 0;

        for (Integer each : sayiSeti
             ) {
            sayilar[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(sayilar));
        // Array'in son hali : [2, 3, 4, 5, 6]

    }
}
