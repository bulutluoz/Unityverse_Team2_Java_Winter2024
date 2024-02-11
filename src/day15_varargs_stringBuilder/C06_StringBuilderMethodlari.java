package day15_varargs_stringBuilder;

import java.util.Arrays;

public class C06_StringBuilderMethodlari {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.replace(0,2,"Ha");

        System.out.println(sb); // Hava

        sb.delete(0,3);

        System.out.println(sb); // a

        sb.append("nkara");

        System.out.println(sb); // ankara

        sb.deleteCharAt(0).deleteCharAt(1);

        System.out.println(sb); // nara

        String kelime = "java";

        sb.append(kelime,2,3);

        System.out.println(sb); // narav

        sb.insert(1,"ar");

        System.out.println(sb); // nararav

        sb.insert(0,kelime,0,3);

        System.out.println(sb); // javnararav

        /*
            ONEMLI NOT : StringBuilder method'larindan calistiginda StringBuilder dondurenler
                         kalici degisiklik yapar
                         ama char, int, String ... dondurenler kalici degisiklik yapmaz
         */

        System.out.println(sb.substring(3)); // nararav
        System.out.println(sb.substring(3, 6)); // nar
        System.out.println(sb.subSequence(4,8)); // arar
        System.out.println(sb.indexOf("nar")); // 3
        System.out.println(sb.lastIndexOf("nar")); // 3

        System.out.println(sb); // javnararav


        // sb ana kelimesi iceriyor mu ?
        // eger bir method'un String'de oldugunu biliyorsak
        // ve StringBuilder'da yoksa
        // StringBuilder'i String'e cevirip, String method'unu kullanabiliriz

        System.out.println(sb.toString().contains("ana")); // false

        // sb'yi karakterlerine ayirip bir array'e kaydedin

        String[] karakterler = sb.toString().split("");
        System.out.println(Arrays.toString(karakterler));
        // [j, a, v, n, a, r, a, r, a, v]
    }
}
