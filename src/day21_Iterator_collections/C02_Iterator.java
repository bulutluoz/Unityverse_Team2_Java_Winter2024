package day21_Iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        // Java'da coklu eleman barindiran her yapi index'i desteklemez
        // biz index olmadan listede kalici degisiklik yapamiyoruz
        // Index olmadan kalici degisiklik yapabilmemiz icin
        // Java Iterator ve ListIterator'i olusturmustur

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1,2,5,8,4));

        System.out.println(sayilar); // [1, 2, 5, 8, 4]


        // sayilar listesindeki cift sayilari silin

        for (int i = 0; i < sayilar.size() ; i++) {

            Integer kontrolEdilenSayi =  sayilar.get(i);

            if (kontrolEdilenSayi % 2  == 0 ){
                sayilar.remove(kontrolEdilenSayi);
                i--;
            }
        }

        System.out.println(sayilar); // [1, 5]



        sayilar = new ArrayList<>(Arrays.asList(1,2,5,8,4));

        // INDEX KULLANMADAN
        // sayilar listesindeki sayilari 2 artirin
        // input : 1,2,5,8,4   output : 3,4,7,10,6

        for (Integer each : sayilar
             ) {

            each += 2;
            System.out.print(each + " ");

        }

        System.out.println("");
        System.out.println( "for each loop'dan sonra sayilar listesi : "+ sayilar);


    }
}
