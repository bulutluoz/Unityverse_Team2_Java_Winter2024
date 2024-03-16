package day23_maps_nestedMaps;

import java.util.ArrayList;
import java.util.List;

public class C02_ListdeFarkliDataTurleriKullanma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        // sayilar.add(8.4);
        // sayilar.add(true);
        // sayilar.add("Ali");

        int[] arr = {3,6,8};
        // sayilar.add(arr);


        List<Object> nesneler = new ArrayList<>();
        nesneler.add(5);
        nesneler.add(8.4);
        nesneler.add(true);
        nesneler.add("Ali");
        nesneler.add(arr);

        System.out.println("Nesneler : " + nesneler);
        // Nesneler : [5, 8.4, true, Ali, [I@668bc3d5]


        // 0.index'deki sayinin pozitif olup olmadigini yazdirin

        if ( (Integer)nesneler.get(0) > 0){
            System.out.println("Sayi pozitif");
        }else{
            System.out.println("Sayi pozitif degil");
        } // Sayi pozitif


        // 3.index'deki String'i buyuk harflerle yazdirin

        System.out.println(((String) nesneler.get(3)).toUpperCase()); // ALI
    }
}
