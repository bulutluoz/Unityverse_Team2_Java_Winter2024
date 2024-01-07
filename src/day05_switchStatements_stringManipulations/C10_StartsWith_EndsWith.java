package day05_switchStatements_stringManipulations;

public class C10_StartsWith_EndsWith {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.contains("a")); // true

        System.out.println(str.startsWith("a")); // false

        System.out.println(str.endsWith("a")); // false

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Java Can")); // true
        System.out.println(str.startsWith("Java Candir")); // true
        System.out.println(str.startsWith("")); // true

        System.out.println("=========");

        System.out.println(str.endsWith("r")); // true
        System.out.println(str.endsWith("Candir")); // true
        System.out.println(str.endsWith("Java Candir")); // true
        System.out.println(str.endsWith("")); // true

        System.out.println("=========");
        // eger 2 parametre kullanirsak
        // once 2.parametrede verilen index'e gore substring alir
        // sonra alinan metnin istenen baslangic ile baslayip baslamadigini kontrol eder

        System.out.println(str.startsWith("a",1)); // true
        // ava Candir

        System.out.println(str.startsWith("dir",6));  // false
        // andir

        System.out.println(str.startsWith("a",3)); // true
        // a Candir

    }
}
