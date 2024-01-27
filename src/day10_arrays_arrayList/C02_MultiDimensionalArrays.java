package day10_arrays_arrayList;

import java.util.Arrays;

public class C02_MultiDimensionalArrays {

    public static void main(String[] args) {

        String [][] harfler = {{"a","g"},{"e","q","t","p"},{"q"},{"t","y","u"}};

        System.out.println(harfler[1][1]); // q

        System.out.println(harfler[3][2]); // u


        System.out.println(harfler[1]); // [Ljava.lang.String;@2752f6e2

        System.out.println(Arrays.toString(harfler[1])); // [e, q, t, p]


        System.out.println(harfler); // [[Ljava.lang.String;@e580929
        System.out.println(Arrays.toString(harfler));
        //[[Ljava.lang.String;@1cd072a9, [Ljava.lang.String;@2752f6e2, [Ljava.lang.String;@7c75222b, [Ljava.lang.String;@4c203ea1]
        System.out.println(Arrays.deepToString(harfler));
        // [[a, g], [e, q, t, p], [q], [t, y, u]]


    }
}
