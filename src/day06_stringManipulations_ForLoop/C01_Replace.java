package day06_stringManipulations_ForLoop;

public class C01_Replace {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.replace('a', 'A')); // JAvA CAndir

        System.out.println(str.replace("a", "Q")); // JQvQ CQndir

        System.out.println(str.replace("a", "TTT")); // JTTTvTTT CTTTndir

        System.out.println(str.replace("va", " lalala ")); // Ja lalala  Candir

        // sadece ilk a degissin istersek
        System.out.println(str.replaceFirst("a", "PPP")); // JPPPva Candir

        // a'lari silin

        System.out.println(str.replace("a", "")); // Jv Cndir


    }
}
