package day15_varargs_stringBuilder;

public class C04_StringBuilder {

    public static void main(String[] args) {

        String str = "Java";

        String str2 = new String("Tava"); // 'new String' is redundant

        System.out.println(str.length()); // 4

        // bos ve kapasitesi 16 olan
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length()); // 0

        // direk atama yaptigimiz, kapasitesi 16+ metin.length olan
        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2.length()); // 11
        System.out.println(sb2.capacity()); // 27


        // kapasitesi 5 olan bos bir
        StringBuilder sb3 = new StringBuilder(5);
        System.out.println(sb3.length()); // 0
        sb3.append("Veli");
        System.out.println(sb3.length()); // 4
        System.out.println(sb3.capacity()); // 5

        // hafizada bosuna yer isgal etmemesi icin
        // length ve capacity'yi esitlemek isterseniz

        sb3.trimToSize();

        System.out.println(sb3.length()); // 4
        System.out.println(sb3.capacity()); // 4

        sb3.append(" 1");

        System.out.println(sb3.length()); // 6
        System.out.println(sb3.capacity()); // 10

        sb3.trimToSize();

        System.out.println(sb3.length()); // 6
        System.out.println(sb3.capacity()); // 6


        System.out.println(sb2); // Java Candir

        System.out.println(sb2.reverse()); // ridnaC avaJ

        System.out.println(sb2); // ridnaC avaJ

        sb2.reverse();

        System.out.println(sb2); // Java Candir


        String str1 = "Hava guzel";
        // StringBuilder sb4 = str1;

        StringBuilder sb4 = new StringBuilder(str1);

        System.out.println(sb4); // Hava guzel

        // bir String ile bir StringBuilder'in metinlerinin ayni oldugunu nasil kontrol edebiliriz ?

        // System.out.println(   str1 == sb4  );
        // farkli data turlerindeki non-primitive'ler icin == KULLANILAMAZ

        System.out.println(str1.equals(sb4)); // java itiraz etmez ama her zaman false verir
        // Hava guzel <==> Hava guzel  ===> false

        // StringBuilder'i String ile karsilastirmak icin
        // once StringBuilder'i String'e cevirmeliyiz
        System.out.println(str1.equals(sb4.toString()));  // true

    }
}
