package day23_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C06_MapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new HashMap<>();
        harfler.put("A",50);
        harfler.put("D",40);
        harfler.put("P",20);
        harfler.put("T",80);

        System.out.println(harfler); // {P=20, A=50, D=40, T=80}

        // A'nin degerini 30 yapin

        harfler.put("A",30);

        System.out.println(harfler); // {P=20, A=30, D=40, T=80}

        // T'nin degerini 25 azaltin

        int eskiDeger = harfler.get("T");

        harfler.put("T", eskiDeger-25);

        System.out.println(harfler); // {P=20, A=30, D=40, T=55}


        // Eger map'de varsa D'nin degerini 10 artirin

        if (harfler.containsKey("D")){

            harfler.put("D", harfler.get("D")+10);

        }

        System.out.println(harfler); // {P=20, A=30, D=50, T=55}

        // Eger map'de varsa E'nin degerini 10 artirin

        if (harfler.containsKey("E")){

            harfler.put("E", harfler.get("E")+10);

        }

        System.out.println(harfler); // {P=20, A=30, D=50, T=55}

        // Eger map'de yoksa E'yi degeri 10 olarak ekleyin

        if ( ! harfler.containsKey("E")){
            harfler.put("E",10);
        }

        System.out.println(harfler); // {P=20, A=30, D=50, T=55, E=10}

        // remove istenen kaydi siler ve value'sunu dondurur

        System.out.println(harfler.remove("P")); // 20

        System.out.println(harfler); // {A=30, D=50, T=55, E=10}

        System.out.println(harfler.remove("K")); // null

        System.out.println(harfler); // {A=30, D=50, T=55, E=10}

        // remove(K,V) method'u verilen key ve value dogru eslesirse siler
        // ve silip silmedigini bize true veya false olarak dondurur

        System.out.println(harfler.remove("D", 40)); // false

        System.out.println(harfler); // {A=30, D=50, T=55, E=10}

        System.out.println(harfler.remove("T", 55)); // true

        System.out.println(harfler); // {A=30, D=50, E=10}


        // replace(K,V) key'in value'sunu update eder
        // var olan elemantlerde put ile ayni islevi gerceklestirir
        // olmayan elemanlarda update yapmaz

        System.out.println(harfler.replace("A", 44)); // 30
        System.out.println(harfler); // {A=44, D=50, E=10}

        System.out.println(harfler.replace("B", 44)); // null
        System.out.println(harfler); // {A=44, D=50, E=10}

        System.out.println(harfler.replace("A", 44, 55)); // true
        System.out.println(harfler); // {A=55, D=50, E=10}

        System.out.println(harfler.replace("D", 40, 55)); // false
        System.out.println(harfler); // {A=55, D=50, E=10}

        // getOrdefault key'i bulursa valuesunu,
        // key'i bulamazsa method'da soyleen default value'u dondurur
        System.out.println(harfler.getOrDefault("A", 0)); // 55
        System.out.println(harfler.getOrDefault("B", 0)); // 00




    }
}
