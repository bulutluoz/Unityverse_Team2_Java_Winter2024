package day05_switchStatements_stringManipulations;

public class C07_Equals_EqualsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";
        String str4 = "ALi";
        String str5 = "ALI ";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str2.equals(str3)); // false
        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.equals(str5)); // false

        System.out.println("=========");

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str2.equalsIgnoreCase(str3)); // true
        System.out.println(str3.equalsIgnoreCase(str4)); // true
        System.out.println(str3.equalsIgnoreCase(str5)); // "ALI"  "ALI "  false

        System.out.println("=========");
        // equals yerine == kullanilabilir mi ?

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = new String("Ali");
        String s4 = "A" + "li";
        String s5 = "A";
        String s6 = "li";
        String s7 = s5 + s6;

        System.out.println(s1 == s2); // Ali == Ali    true
        System.out.println(s1 == s3); // Ali == Ali    false
        System.out.println(s1 == s4); // Ali == Ali    true
        System.out.println(s1 == s7); // Ali == Ali    false

        // == hem metne, hem de referansa baktigi icin SIMDILIK String'leri karsilastirirken KULLANMAYACAGIZ

        System.out.println(s1.equals(s2)); // Ali ==> Ali true
        System.out.println(s1.equals(s3)); // Ali ==> Ali true
        System.out.println(s1.equals(s4)); // Ali ==> Ali true
        System.out.println(s1.equals(s7)); // Ali ==> Ali true

        // equals() metne odaklanir, buyuk kucuk harf dikkate alinarak metin ayni ise TRUE verir
        // Eger buyuk-kucuk harf dikkate almadan metni karsilastirmak istersek
        // equalsIgnoreCase() kullaniriz.

    }
}
