package day10_arrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        System.out.println(harfler); // []

        System.out.println(harfler.size()); // 0

        System.out.println(harfler.isEmpty()); // true

        harfler.add("a");
        harfler.add("b");
        harfler.add("c");

        System.out.println(harfler); // [a, b, c]

        System.out.println(harfler.size()); // 3

        System.out.println(harfler.isEmpty()); // false

        System.out.println(harfler.contains("a")); // true

        System.out.println(harfler.contains("x")); // false


        // listedeki ilk elemani yazdirin

        System.out.println(harfler.get(0)); // a

        // listedeki son elemani yazdirin

        System.out.println(harfler.get(harfler.size()-1)); // c


    }
}
