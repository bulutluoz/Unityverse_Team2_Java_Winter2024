package day05_switchStatements_stringManipulations;

public class C13_indexOf_lastIndexOf {

    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        // cumlede top geciyorsa index'ini yazdirin

        System.out.println(str.contains("top")); // true

        System.out.println(str.indexOf("top")); // 4

        System.out.println(str.indexOf('a')); // 9

        System.out.println(str.indexOf("at")); // 9

        System.out.println(str.lastIndexOf('a')); // 20

        System.out.println(str.lastIndexOf("at")); // 20

        System.out.println(str.lastIndexOf("top")); // 4


        /*
            lastIndexOf() aramaya sondan baslar
            indexOf() ise aramaya bastan baslar
            ilk bulduklari arananMetnin index'ini bize verirler

            eger aranan metin String icerisinde sadece 1 tane varsa
            bastan veya sondan aratildiginda ayni index bulunacaktir
         */


        System.out.println(str.indexOf("x")); // -1

        System.out.println(str.lastIndexOf("q")); // -1

        System.out.println(str.indexOf("Java")); // -1

        System.out.println(str.lastIndexOf("Tava")); // -1


        // "Ali topu at, at Ali at";

        System.out.println(str.indexOf("at",10)); // 13  10.index'den sonraki ilk at'in indexini verir

        System.out.println(str.lastIndexOf('a',18)); // 13 18.index'den basa dogru a arar



    }
}
