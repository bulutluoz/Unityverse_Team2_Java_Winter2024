package day10_arrays_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C10_ListedekiElemanlariUpdateEtme {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Gokhan");
        isimler.add("Canan");
        isimler.add("Gokturk");

        System.out.println(isimler);  // [Deniz, Gokhan, Canan, Gokturk]

        // 1.index'deki ismi Eren yapin

        isimler.set(1,"Eren");

        System.out.println(isimler); // [Deniz, Eren, Canan, Gokturk]

        // Eger isimleri siralamak istersek

        Collections.sort(isimler);
        System.out.println(isimler); // [Canan, Deniz, Eren, Gokturk]

        List<String> isimler2 = new ArrayList<>();
        isimler2.add("Deniz");
        isimler2.add("Eren");
        isimler2.add("Canan");
        isimler2.add("Gokturk");

        System.out.println(isimler2); // [Deniz, Eren, Canan, Gokturk]

        System.out.println(isimler.equals(isimler2)); // false

        Collections.sort(isimler2);
        System.out.println(isimler); // [Canan, Deniz, Eren, Gokturk]
        System.out.println(isimler2);// [Canan, Deniz, Eren, Gokturk]

        System.out.println(isimler.equals(isimler2)); // true

        isimler.set(1,"Vildan");
        System.out.println(isimler); // [Canan, Vildan, Eren, Gokturk]
        System.out.println(isimler2);// [Canan, Deniz, Eren, Gokturk]

        isimler.retainAll(isimler2);

        System.out.println(isimler); // [Canan, Eren, Gokturk]
        System.out.println(isimler2);// [Canan, Deniz, Eren, Gokturk]




    }
}
