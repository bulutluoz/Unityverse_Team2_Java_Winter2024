package day14_immutableClasses_dateTime;

public class C03_ImmutableClasses {

    public static void main(String[] args) {


        String str = "Ali";

        str = "Veli";

        System.out.println(str); // Veli

        str = str.toUpperCase();

        System.out.println(str); // VELI

        str.replaceAll("\\w","*");



        // Asagidaki islemde java kac String objesi olusturur

        String abc = "";

        for (int i = 1; i <=20 ; i++) {

            abc += i;
        }

        System.out.println(abc);

        // 1234567891011121314151617181920

    }
}
