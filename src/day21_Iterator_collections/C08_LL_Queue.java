package day21_Iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C08_LL_Queue {

    public static void main(String[] args) {

        // Queue'da FIFO gecerlidir
        // eklemeler her zaman sona yapilir,
        // silmeler ise bastan olur

        Queue<Integer> sayilar3 = new LinkedList<>();

        sayilar3.add(20);
        sayilar3.add(15);
        sayilar3.add(5);
        sayilar3.add(22);

        System.out.println(sayilar3); // [20, 15, 5, 22]

        System.out.println(sayilar3.remove()); // 20

        System.out.println(sayilar3); // [15, 5, 22]


        Queue<Integer> sayilar4 = new LinkedList<>();

        // bos queue'da remove kullanilirsa NoSuchElementException verir
        // sayilar4.remove(); // NoSuchElementException


        // element ve peek ikisi de
        // queue'nun basindaki elemani silmeden bize getirir
        // aralarindaki fark bos queue'da calistirilinca
        // element exception firlatir, peek ise null dondurur
        System.out.println(sayilar3.element()); // 15
        System.out.println(sayilar3.peek()); // 15

        System.out.println(sayilar3); // [15, 5, 22]

        // System.out.println(sayilar4.element()); //  NoSuchElementException
        System.out.println(sayilar4.peek());// null


        // remove() ve poll() ikisi de bastaki elemani silip bize getirir
        // farklari bos queue'da calistirilinca ortaya cikar
        System.out.println(sayilar3.poll()); // 15
        System.out.println(sayilar3); // [5, 22]

        System.out.println(sayilar4.poll()); // null
        // System.out.println(sayilar4.remove()); // NoSuchElementException


        // offer(), add() gibi sona eleman ekler
        // aralarindaki fark
        // add() her durumda elemani eklerken
        // offer() eklemeyi teklif eder ama kapasite sinirlamasi varsa
        // eklenmeyebilir
        System.out.println(sayilar3.offer(44));

        System.out.println(sayilar3); // [5, 22, 44]

    }
}
