package day10_arrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {

    public static void main(String[] args) {

        int[] arr = {3,4,5,5,6,7,5,4,3,2,4};

        // Array'ler eleman ekleme ve eleman silme ozlellikleri olmadigindan
        // kullanimda cok tercih edilmezler
        // Java array ozelliklerini kullanan ama ekleme ve cikarma yapabildigimiz
        // ArrayList'i de olusturmustur.

        List<Integer> sayilarList = new ArrayList<>();

        System.out.println(sayilarList); // []

        sayilarList.add(3);
        sayilarList.add(5);
        sayilarList.add(7);
        sayilarList.add(4);

        System.out.println(sayilarList); // [3, 5, 7, 4]

        // 5 ile 7 arasina eleman olarak 10 ekleyelim

        sayilarList.add(2,10);

        System.out.println(sayilarList); // [3, 5, 10, 7, 4]

        List<Integer> ikinciList = new ArrayList<>();
        ikinciList.add(10);
        ikinciList.add(20);
        ikinciList.add(30);

        System.out.println(ikinciList); // [10, 20, 30]

        // sayilar listesinin sonuna ikinci listeyi ekleyin

        sayilarList.addAll(ikinciList);

        System.out.println(sayilarList); // [3, 5, 10, 7, 4, 10, 20, 30]

        // sayilar listesinin basina ikinci listeyi ekleyelim

        sayilarList.addAll(0,ikinciList);

        System.out.println(sayilarList); // [10, 20, 30, 3, 5, 10, 7, 4, 10, 20, 30]



    }
}
