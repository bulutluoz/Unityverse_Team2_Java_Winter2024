package day21_Iterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C09_LL_Deque {

    public static void main(String[] args) {

        // Deque : Double ended queue demektir
        // hemen hemen tum method'larin first ve last versiyonlari vardir

        Deque<Integer> sayilar5 = new LinkedList<>();

        sayilar5.add(10);
        sayilar5.add(20);
        sayilar5.add(15);

        System.out.println(sayilar5); // [10, 20, 15]

        sayilar5.addLast(40);
        sayilar5.addFirst(8);

        System.out.println(sayilar5); // [8, 10, 20, 15, 40]

        sayilar5.offer(23);

        System.out.println(sayilar5); // [8, 10, 20, 15, 40, 23]

        System.out.println(sayilar5.removeLast()); // 23
        // kac olduguna bakmaksizin en sondaki sayiyi siler ve bize getirir
        System.out.println(sayilar5); // [8, 10, 20, 15, 40]


        System.out.println(sayilar5.removeLastOccurrence(20)); // true
        // verilen sayinin sona en yakin olan kullanimini siler
        System.out.println(sayilar5); // [8, 10, 15, 40]

        // olmayan bir elemani remove edelim
        System.out.println(sayilar5.removeLastOccurrence(33)); // false
        System.out.println(sayilar5); // [8, 10, 15, 40]


        sayilar5.push(34);
        System.out.println(sayilar5); // [34, 8, 10, 15, 40]
        // addFirst() ile ayni islevi yapar, deque'in basina verdigimiz elemani ekler

        System.out.println(sayilar5.pop()); // 34
        // removeFirst() ile ayni islevi yapar
        System.out.println(sayilar5); // [8, 10, 15, 40]




    }
}
