package day23_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C09_TreeMapMethodlari {

    public static void main(String[] args) {

        TreeMap<String,Integer> harfler = new TreeMap<>();
        harfler.put("A",50);
        harfler.put("D",40);
        harfler.put("P",20);
        harfler.put("T",80);

        System.out.println(harfler); // {A=50, D=40, P=20, T=80}

        // TreeMap elemanlari sirali olarak tuttugu icin
        // bastaki, sondaki element
        // veya bir elementten oncekiler veya sonrakiler gibi secimler yapabiliriz

        System.out.println(harfler.subMap("D", "T")); // {D=40, P=20}
        System.out.println(harfler.subMap("B", "T")); // {D=40, P=20}
        System.out.println(harfler.subMap("D", "S")); // {D=40, P=20}
        System.out.println(harfler.subMap("D",true, "T",true)); // {D=40, P=20, T=80}
        System.out.println(harfler.subMap("D",false, "T",true)); // {P=20, T=80}

        // verilen key'den baslayarak, map'in sonuna kadar olan kismi dondurur
        System.out.println(harfler.tailMap("D")); // {D=40, P=20, T=80}
        System.out.println(harfler.tailMap("D",false)); // {P=20, T=80}

        // bastan verilen key'e kadar olan map
        System.out.println(harfler.headMap("D")); // {A=50}
        System.out.println(harfler.headMap("D",true)); // {A=50, D=40}
        System.out.println(harfler.headMap("S")); // {A=50, D=40, P=20}

        // {A=50, D=40, P=20, T=80}
        // verilen key'den buyuk olan ilk key'i dondurur
        System.out.println(harfler.higherKey("D")); // P  >
        System.out.println(harfler.higherEntry("D")); // P=20  >
        // verilen key'den kucuk olan ilk key'i dondurur
        System.out.println(harfler.lowerKey("D")); // A  <
        System.out.println(harfler.lowerEntry("K")); // D=40   <


        // verilen key'e esit veya buyuk olan ilk key'i dondurur
        System.out.println(harfler.ceilingKey("D")); // D   >=
        System.out.println(harfler.ceilingKey("K")); // P  >=

        // verilen key'e esit veya kucuk olan ilk key'i dondurur

        System.out.println(harfler.floorKey("P")); // P
        System.out.println(harfler.floorKey("R")); // D

        // PollFirst() ilk entry'yi siler ve bize dondurur
        System.out.println(harfler.pollFirstEntry()); // A=50
        System.out.println(harfler); // {D=40, P=20, T=80}

        System.out.println(harfler.descendingMap()); // {T=80, P=20, D=40}

        // harfler = harfler.descendingMap();
        // treeMap natural order kullandigi icin
        // descending olarak kaydedilen bir map'i treeMap'e atayamazsiniz




    }
}
