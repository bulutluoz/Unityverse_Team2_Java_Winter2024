package day06_stringManipulations_ForLoop;

import java.util.Scanner;

public class C03_ReplaceAllSoru {
    public static void main(String[] args) {

        // Kullanicidan bir metin alin
        // harfler ve tek space disinda kalan karakterleri silip
        // metni duzenleyin
        // ornek : input : J1^a2_3v+76a    C98a#n1%2d0i4r6  output : Java Candir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        metin = metin.replaceAll("\\d",""); // J^a_v+a    Ca#n%dir  sayilardan kurtulduk
        metin = metin.replaceAll("\\s+"," "); // fazla space'leri tek space haline getirdi
        metin = metin.replace(" ","1"); // space'i koruma altina almak icin yerine 1 atadik
        metin = metin.replaceAll("_","");
        metin = metin.replaceAll("\\W",""); // sayi,harf ve _ haric herseyi yok ettik
        metin = metin.replace("1"," ");

        System.out.println(metin);
    }
}
