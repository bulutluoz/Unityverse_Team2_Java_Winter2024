package day14_immutableClasses_dateTime;

public class C04_EqualsVeCiftEsittirKarsilastirmasi {

    public static void main(String[] args) {

        /*
            String Pool , String Havuzu

            Java'da String olusturmak icin 2 yontem kullanabiliriz
            1- "" icinde direk deger atama
            2- new keyword kullanarak veya baska String variable'larla islem yaparak String olusturma
         */


        String str1 = "Ali"; // 1
        String str2 = "Ali"; // 1
        String str3 = new String("Ali"); // 2
        String str4 = "A" + "li"; // 1
        String s = "A";//1
        String t = "li";//1
        String str5 = s+t; // 2
        String str6 = s.concat(t); // 2
        String str7 = s.concat("li"); // 2
        // karsilastirma icin kullandigimiz "Ali" // 1

        // equals() metne odaklanir
        System.out.println(str1.equals(str2)); // Ali <==> Ali true
        System.out.println(str1.equals(str3)); // Ali <==> Ali true
        System.out.println(str1.equals(str4)); // Ali <==> Ali true
        System.out.println(str1.equals(str5)); // Ali <==> Ali true
        System.out.println(str1.equals(str6)); // Ali <==> Ali true
        System.out.println(str1.equals(str7)); // Ali <==> Ali true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali true

        System.out.println("=================");
        /*
         == hem metne, hem de referansa bakar
         String'de ayni metinleri karsilastirdigimizda
         her zaman true vermez, bazen false da verir

         Java yukarda yazdigimiz 1.yontemle yani "" icerisinde deger ile String olusturdugumuzda
         bu String'leri String Pool'a koyar

         EGER
         String pool'da olan iki String'in
         metinleri de ayni ise
         == ile karsilastirdigimizda sonuc true olur

         havuz disindaki iki String'i
         veya havuzda olan bir String ile disarda olan bir String'i == ile karsilastirirsaniz
         java false verir

         */

        System.out.println(str1 == str2); // Ali <==> Ali true   havuz -- havuz
        System.out.println(str1 == str3); // Ali <==> Ali false  havuz -- havuzda degil
        System.out.println(str1 == str4); // Ali <==> Ali true   havuz -- havuz
        System.out.println(str1 == str5); // Ali <==> Ali false  havuz -- havuzda degil
        System.out.println(str1 == str6); // Ali <==> Ali false  havuz -- havuzda degil
        System.out.println(str1 == str7); // Ali <==> Ali false  havuz -- havuzda degil
        System.out.println(str1 == "Ali"); // Ali <==> Ali true  havuz -- havuz
        System.out.println(str6 == str7); // Ali <==> Ali false  havuzda degil -- havuzda degil
    }
}
