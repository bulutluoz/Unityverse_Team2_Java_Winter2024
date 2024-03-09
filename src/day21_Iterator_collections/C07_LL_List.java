package day21_Iterator_collections;

import java.util.LinkedList;
import java.util.List;

public class C07_LL_List {

    public static void main(String[] args) {

        // constructor LinkedList secilse de
        // data turu List oldugundan
        // tum List'lerin ortak ozelliklerini gosterir
        // bizim daha once arrayList'de gordugumuz ayni ozellikler
        // burda da var

        List<Integer> sayilar1 = new LinkedList<>();

        sayilar1.add(10);
        sayilar1.add(20);
        sayilar1.add(0,40);

        System.out.println(sayilar1); // [40, 10, 20]


        List<Integer> sayilar2 = new LinkedList<>();

        sayilar2.add(10);
        sayilar2.add(50);

        sayilar1.retainAll(sayilar2);   // sayilar1'de olup, sayilar2'de olmayan elemanlari
                                        // sayilar1'den siler
                                        // yani ortak elemanlar haric, diger elemanlari siler

        System.out.println(sayilar1); // 10
        System.out.println(sayilar2); // [10, 50]




    }
}
