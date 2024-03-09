package day21_Iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,34,7,12,4,5,14));

        System.out.println(sayilar); // [2, 34, 7, 12, 4, 5, 14]


        // iterator kullanarak, sayilar listesindeki sayilari
        // sondan basa dogru yazdirin

        // 2,  34,  7,  12,  4,  5,  14

        ListIterator lit = sayilar.listIterator();

        // iterator olusturuldugunda en basta durur
        // elemanlari sondan basa dogru yazdirmak icin
        // once iterator'i en sona goturmeliyiz

        while (lit.hasNext()){
            lit.next();
        } // iterator en sona gitti


        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " ");
        }
        System.out.println("");
        // su anda lit en basta

        // 2,  34,  7,  12,  4,  5,  14

        // lit'i kullanarak, sayilar listesindeki tum elementleri 3 artirin

        while (lit.hasNext()){

            Integer sayi = (Integer) lit.next();

            lit.set(sayi + 3);

        }

        System.out.println(sayilar); // [5, 37, 10, 15, 7, 8, 17]


        // tum sayilari 2 katina cikarin
        // lit ensonda, ya yeni bir lit olusturmali veya sondan basa dogru gitmeliyiz

        while (lit.hasPrevious()){

            Integer sayi = (Integer) lit.previous();

            lit.set(sayi * 2);

        }

        System.out.println(sayilar); // [10, 74, 20, 30, 14, 16, 34]


















    }
}
