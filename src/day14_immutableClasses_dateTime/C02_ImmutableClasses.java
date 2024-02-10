package day14_immutableClasses_dateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ImmutableClasses {

    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace("a", "b")); // Jbvb cbndir

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.replaceAll("\\s", "")); // Javacandir

        str.split("");

        System.out.println(str); // Java candir



        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5,6,7));

        System.out.println(sayilar); // [5, 6, 7]

        sayilar.add(3);

        sayilar.add(2,10);

        sayilar.set(0,19);

        System.out.println(sayilar); // [19, 6, 10, 7, 3]



        // Eger immutable olmayan ama metin kaydedebilecegimiz bir variable olusturmak isterseniz

        StringBuilder sb = new StringBuilder("Hava nasil?");

        sb.replace(0,4,"Tava");

        System.out.println(sb); // Tava nasil?




    }
}
