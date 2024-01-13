package day06_stringManipulations_ForLoop;

public class C05_NullPointer {

    public static void main(String[] args) {

        // BAZEN variable'lari deger atamadan olusturmak ve deger atanmadigini bilmek isteriz

        String str1;

        // System.out.println(str1); // Variable 'str1' might not have been initialized
        // Java deger atanmamis bir variable'i yazdirmaniza veya kullanmaniza izin vermez

        String str2 = "";

        System.out.println("Str2'nin degeri : " + str2 + "dir");
        // yazdirma acisindan guzel oldu
        // ama ogrencilere isim atanmadigi halde, bir deger atanmis gorunuyor

        // Java bu durum icin COK SPESIFIK bir keyword gelistirmistir

        String str3 = null;
        // BU yazimin turkcesi :  str3'e deger atamadik, bunun farkindayiz,
        //                        str3'u yazdirmak istedigimizde str3'e deger atanmadigini goster

        System.out.println(str3); // null

        System.out.println(str3 + "Java"); // nullJava

        // null bir deger degil, isaretci(pointer)'dir

        // System.out.println(str3.replace("l", "a")); // NullPointerException

    }
}
