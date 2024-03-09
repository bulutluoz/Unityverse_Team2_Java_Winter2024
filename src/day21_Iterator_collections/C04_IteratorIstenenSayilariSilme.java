package day21_Iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C04_IteratorIstenenSayilariSilme {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,34,7,12,4,5,14));

        // 10'dan kucuk olan sayilari iterator ile silin

        Iterator iterator = sayilar.iterator();

        while (iterator.hasNext()){

            Integer sayi = (Integer) iterator.next();

            if (sayi < 10){
                iterator.remove();
            }
        }

        // Iterator'da dikkat etmemiz gereken en onemli konu
        // Iterator'i nerede biraktigimizdir
        // bu soru icin dusunursek, yukardaki while loop
        // itarator'i en sona goturmustur
        // yani loop bittiginde iterator 14'un sagindadir
        // iterator'i bir daha kullanmak isterseniz
        // yeniden iterator olusturmalisiniz

        System.out.println(sayilar); // [34, 12, 14]

        // 30'dan buyuk sayilari da silin

        iterator = sayilar.iterator();

        while(iterator.hasNext()){

           Integer sayi = (Integer) iterator.next();

           if (sayi > 30){
               iterator.remove();
           }
        }

        System.out.println(sayilar); // [12, 14]

    }
}
