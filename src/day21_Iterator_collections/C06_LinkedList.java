package day21_Iterator_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C06_LinkedList {

    public static void main(String[] args) {

        // LinkedList 3 tane interface'i implement etmistir
        // dolayisiyla o interface'lerdeki tum method'lari override etmistir


        LinkedList<Integer> sayilar1 = new LinkedList<>();

        List<Integer> sayilar2 = new LinkedList<>();
        // Tum List'lerle ortak ozellikleri tasir

        Deque<Integer> sayilar3 = new LinkedList<>();
        // Tum Deque'lerle ortak ozellikleri tasir

        Queue<Integer> sayilar4 = new LinkedList<>()

                ;
        // Tum Queue'larla ortak ozellikleri tasir
    }
}
