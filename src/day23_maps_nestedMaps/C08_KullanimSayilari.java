package day23_maps_nestedMaps;

import java.util.*;

public class C08_KullanimSayilari {
    public static void main(String[] args) {

        // Verilen harfler listesinde
        // herbir harfi ve kacar defa kullanildigini bir map olarak yazdirin

        List<String> harfler = new ArrayList<>(Arrays.asList("a","b","b","z","k","z","k","b","k"));

        // a=1, b=3, z=2, k=3

        Map<String ,Integer> kullanimSayiMap = new TreeMap<>();

        for (String each: harfler
             ) {

            kullanimSayiMap.computeIfPresent(each , (k,v) -> v+1);
            kullanimSayiMap.computeIfAbsent(each,v->1);

        }

        System.out.println(kullanimSayiMap); // {a=1, b=3, k=3, z=2}


    }
}
