package day20_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_MultipleExceptions {

    public static void main(String[] args) {

        String str = "Java";
        int sayi1 = 20;
        int sayi2 = 5;
        int sayi3 = 0;

        // System.out.println( sayi1 / str); // Operator '/' cannot be applied to 'int', 'java.lang.String'

        System.out.println( sayi1 / sayi2 ); // 4

        // System.out.println(  sayi1 / sayi3 ); // ArithmeticException

        /*
            Exception turleri arasinda da parent-child iliskisi olanlar vardir

            Exceptions class'i tum exception'larin parent'idir
            Exceptions ikiye ayrilir

            1- RunTimeExceptions / Unchecked
            2- Compile Time'da anlasilabilen exceptions // Checked

            Java compile time'da variable'larin degerleriyle degil
            data turleriyle degerlendirme yapar

            eger data turu acisindan kullanimda sorun varsa
            veya compile time exception riskini farkederse
            kod'un altini cizer ve duzeltilmeden kodu calistirmaz

            eger data turlerinde degil, variable'in degerinde sorun varsa
            Java bunu calistirmadan farkedemez
            Calistirdiktan sonra soruna bagli olarak
             - NullPointerException
             - StringIndexOutOfBoundsException
             - ArithmethicException
             - ArrayIndexOutOfBoundsException
             gibi RunTimeException'in child'i olan exception'lar olusur.

         */

        // Eger birbiri ile parent child iliskisi olmayan
        // birden fazla exception ihtimali varsa
        // bunlari farkli 4 yontemle kontrol altina alabiliriz

        // 1- ikisini ayri ayri try catch'ler ile kontrol altina alabiliriz

        // 2- tek bir try, birden fazla catch cumlesi kullanabiliriz

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        int sayi = 0;

        /*
        try {
            System.out.println("Lutfen pozitif bir tamsayi giriniz...");
            sayi = scanner.nextInt();
            System.out.println("Metindeki verilen index'deki karakter : " + metin.charAt(sayi));
        } catch (InputMismatchException e) {
            System.out.println("istenen sayi icin tamsayi girmelisiniz...");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("verdiginiz sayi metnin uzunlugundan buyuk");
        }

         */

        // 3- tek bir try ve potansiyel exception'lari kapsayan
        //    parent exception ile tek bir catch kullanabiliriz

        try {
            System.out.println("Lutfen pozitif bir tamsayi giriniz...");
            sayi = scanner.nextInt();
            System.out.println("Metindeki verilen index'deki karakter : " + metin.charAt(sayi));
        } catch (RuntimeException e) {
            System.out.println("istenen degerler uygun degil");
        }


        // 4- Isterseniz iki exception'i kontrol altina almak icin
        //    nested try-catch olusturabilirsiniz

    }
}
