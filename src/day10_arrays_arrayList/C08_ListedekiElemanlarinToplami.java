package day10_arrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedekiElemanlarinToplami {

    public static void main(String[] args) {

        // Verilen Integer bir listedeki elemanlarin toplamini yazdiran bir method olusturun

        List<Integer> sayilarList = new ArrayList<>();

        sayilarList.add(3);
        sayilarList.add(5);
        sayilarList.add(7);
        sayilarList.add(4);
        sayilarList.add(3);

        listeToplaminiYazdir(sayilarList); // Listedeki sayilarin toplami : 22


    }

    public static void listeToplaminiYazdir(List<Integer> sayilar){

        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam += sayilar.get(i);
        }

        System.out.println("Listedeki sayilarin toplami : " + toplam);

    }
}
