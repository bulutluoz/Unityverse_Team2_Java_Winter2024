package day10_arrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_Remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Gokhan");
        isimler.add("Canan");
        isimler.add("Gokturk");

        System.out.println(isimler); // [Deniz, Gokhan, Canan, Gokturk]

        System.out.println(isimler.remove("Deniz")); // true
        System.out.println(isimler.remove("Vildan")); // false

        System.out.println(isimler); // [Gokhan, Canan, Gokturk]

        System.out.println(isimler.remove(2)); // Gokturk
        // System.out.println(isimler.remove(5)); // IndexOutOfBoundsException

        System.out.println(isimler); // [Gokhan, Canan]


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(9);

        System.out.println(sayilar); // [5, 3, 6, 1, 9]

        System.out.println(sayilar.remove(3)); // 1

        System.out.println(sayilar); // [5, 3, 6, 9]

        // index kullanmadan eleman olan 5'i silin

        // sayilar.remove(5); // IndexOutOfBoundsException

        Integer silinecekSayi = 5;
        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [3, 6, 9]


        List<Integer> silineceklerListesi = new ArrayList<>();
        silineceklerListesi.add(3);
        silineceklerListesi.add(5);

        System.out.println(sayilar.removeAll(silineceklerListesi));
        // sayilar listesi bu komut ile degisirse true,
        // sayilar listesi degismezse, yani hic bir sayi silemediyse false doner

        System.out.println(sayilar); // [6, 9]

    }
}
