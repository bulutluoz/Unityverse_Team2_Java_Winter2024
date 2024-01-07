package day05_switchStatements_stringManipulations;

public class C15_IsEmpty_isBlank {

    public static void main(String[] args) {

        String s1 = "";

        String s2 = " ";

        String s3 = "    ";

        String s4 = "Ali Can";

        System.out.println(s1.isEmpty()); // true
        System.out.println(s2.isEmpty()); // false
        System.out.println(s3.isEmpty()); // false
        System.out.println(s4.isEmpty()); // false

        System.out.println(s2.isBlank()); // true
        System.out.println(s3.isBlank()); // true
        System.out.println(s4.isBlank()); // false
        System.out.println(s1.isBlank()); // true
    }
}
