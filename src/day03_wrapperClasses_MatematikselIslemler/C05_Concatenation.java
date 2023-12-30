package day03_wrapperClasses_MatematikselIslemler;

public class C05_Concatenation {

    public static void main(String[] args) {

        int s1 = 5;
        int s2 = 3;
        String s3 = "java";
        String s4 = "candir";
        String s5 = " ";
        String s6 = "";


        // Sadece yukardaki variable'lari kullanarak
        // asagidaki metinleri yazdirin

        // java candir 53

        System.out.println(s3+s5+s4+s5+s1+s2);  // java candir 53

        // java 8

        System.out.println(s3+s5+(s1+s2)); // java 8

        // 15 java

        System.out.println(s1*s2+s5+s3); // 15 java

        // 8 java

        System.out.println(s1+s2+s5+s3); // 8 java

        // 35 Java

        System.out.println(s6+s2+s1+s5+s3); // 35 java

        System.out.println(s2+s6+s1+s5+s3); // 35 java

        // 5335

        System.out.println(s6+s1+s2+s2+s1); // 5335

    }
}
