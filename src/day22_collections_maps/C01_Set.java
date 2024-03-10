package day22_collections_maps;

import java.util.*;

public class C01_Set {

    public static void main(String[] args) {

        Set<Integer> sayilar = new HashSet<>();

        sayilar.add(25);
        sayilar.add(30);
        sayilar.add(25);
        sayilar.add(15);
        sayilar.add(25);

        System.out.println(sayilar); // [25, 30, 15]

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(2,4,6,4,6,4,6,8,6,2,4,6));

        Set<Integer> sayiSeti = new TreeSet<>();
        sayiSeti.addAll(sayiList);

        System.out.println("Listenin unique elementlerden olusan hali : "+ sayiSeti);

        Set<String> isimler = new HashSet<>();

        System.out.println(isimler.hashCode()); // [] ==> 0

        isimler.add("ali");

        System.out.println(isimler.hashCode()); // ["ali"] ==> 96670

        isimler.remove("ali");

        System.out.println(isimler.hashCode()); // [] ==> 0

        isimler.add("Ali");

        System.out.println(isimler.hashCode()); // ["Ali"] ==> 65918

        isimler.add("Veli");

        System.out.println(isimler.hashCode()); // ["Ali","Veli"] ==> 2728458
    }
}
