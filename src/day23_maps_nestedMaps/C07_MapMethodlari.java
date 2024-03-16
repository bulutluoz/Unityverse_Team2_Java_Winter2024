package day23_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C07_MapMethodlari {

    public static void main(String[] args) {
        Map<String,Integer> harfler = new HashMap<>();
        harfler.put("A",50);
        harfler.put("D",40);
        harfler.put("P",20);
        harfler.put("T",80);

        System.out.println(harfler); // {P=20, A=50, D=40, T=80}

        // Eger map'de key olarak C yoksa, value'su 20 olarak C'yi ekleyin

        if (!harfler.containsKey("C")){
            harfler.put("C",20);
        }

        System.out.println(harfler); // {P=20, A=50, C=20, D=40, T=80}


        // Eger map'de key olarak Y yoksa, value'su 24 olarak Y'yi ekleyin

        System.out.println(harfler.putIfAbsent("Y", 24)); // null
        System.out.println(harfler); // {P=20, A=50, C=20, D=40, T=80, Y=24}

        // varsa eklemez ve olan value'yu dondurur
        System.out.println(harfler.putIfAbsent("A", 22)); // 50
        System.out.println(harfler); // {P=20, A=50, C=20, D=40, T=80, Y=24}

        // P'nin degerini 2 katina cikarin

        harfler.compute("P", (k,v) -> 2*v);
        System.out.println(harfler); // {P=40, A=50, C=20, D=40, T=80, Y=24}

        // C'nin degerini yarisindan 1 fazla yapin

        harfler.compute("C", (a,b)-> b/2 + 1);
        System.out.println(harfler); // {P=40, A=50, C=11, D=40, T=80, Y=24}

        // F'nin degerini 2 katina cikarin

        // harfler.compute("F",(k,v)-> 2*v); // NullPointerException


        // Eger F varsa degerini 2 katina cikarin

        System.out.println(harfler.computeIfPresent("F", (k, v) -> v * 2)); // null
        System.out.println(harfler); // {P=40, A=50, C=11, D=40, T=80, Y=24}

        // Eger A varsa degerini 5 azaltin

        System.out.println(harfler.computeIfPresent("A", (k, v) -> v - 5)); // 45
        System.out.println(harfler); // {P=40, A=45, C=11, D=40, T=80, Y=24}

        // Eger map'de E yoksa degeri 20 olarak map'e ekleyin


        System.out.println(harfler.computeIfAbsent("E", v -> 20)); // 20
        System.out.println(harfler); // {P=40, A=45, C=11, D=40, T=80, E=20, Y=24}

        // bu haliyle putIfAbsent() ile ayni islevi yapar
    }
}
