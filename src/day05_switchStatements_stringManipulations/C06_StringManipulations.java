package day05_switchStatements_stringManipulations;

public class C06_StringManipulations {

    public static void main(String[] args) {

        String str = "Ali Uzunkavaklaraltindayataruyumazoglu";

        // son harfi yazdirin

        System.out.println(str.length()); // 38

        System.out.println(  str.charAt(str.length()-1)    ); // u

        // sondan 5.harfi yazdirin

        System.out.println(str.charAt(str.length()-5)); // z


    }
}
