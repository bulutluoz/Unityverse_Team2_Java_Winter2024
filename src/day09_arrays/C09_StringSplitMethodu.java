package day09_arrays;

import java.util.Arrays;

public class C09_StringSplitMethodu {

    public static void main(String[] args) {

        String str = "Bugun hava cok guzeldi, biz de guzel bir piknik yaptik";

        String[] virgulSplit = str.split(",");

        System.out.println(Arrays.toString(virgulSplit));
        // [Bugun hava cok guzeldi,  biz de guzel bir piknik yaptik]


        String[] guzelSplit = str.split("guzel");

        System.out.println(Arrays.toString(guzelSplit));
        // [Bugun hava cok , di, biz de ,  bir piknik yaptik]


        str= "Bugun hava cok guzel";

        // verilen str'i kelimelerine ayirin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Bugun, hava, cok, guzel]

        // verilen str'i karakterlerine ayirin

        String[] karakterler = str.split("");

        System.out.println(Arrays.toString(karakterler));
        // [B, u, g, u, n,  , h, a, v, a,  , c, o, k,  , g, u, z, e, l]


    }
}
