package day05_switchStatements_stringManipulations;

public class C09_Contains {

    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.contains("a")); // str a icerir mi ? true

        System.out.println(str.contains(" ")); // true

        System.out.println(str.contains("ndi")); // true

        System.out.println(str.contains("acan")); // false

        System.out.println(str.contains("a can")); // true


    }
}
