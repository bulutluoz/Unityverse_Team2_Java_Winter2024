package day21_Iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1,2,5,8,4));

        System.out.println(sayilar); // [1, 2, 5, 8, 4]

        // Iterator iterator = new Iterator();
        // 'Iterator' is abstract; cannot be instantiated
        // Iterator bir Interface oldugu icin direk obje olusturulamaz
        // bunun yerine kullanacagimiz coklu element barindiran yapi uzerinden obje olustururuz

        Iterator iterator = sayilar.iterator();
        // bir iterator olusturup, listenin en basina konumlandirir

        System.out.println(iterator.next()); // 1
        // iterator'i bis sonraki elemanin onune gecirir
        // ve uzerinden gectigi elemani iterator'a alir

        iterator.remove();
        // o an uzerinde olan sayiyi listeden siler
        // iterator uzerinde sayi kalmadi

        System.out.println(sayilar); // [2, 5, 8, 4]

        // Eger iterator'i yeniden hareket ettirmeden
        // bir kere daha remove() calistirirsak
        // IllegalStateException aliriz
        // iterator.remove();

        System.out.println(iterator.hasNext()); // true
        // bulundugu yer itibariyle
        // iterator'dan sonra eleman olup olmadigini
        // bize true veya false olarak bildirir


        while(iterator.hasNext()){ // iterator'in yaninda sayi oldugu muddetce loop calisacak

            iterator.next();
            iterator.remove();
        }

        System.out.println(sayilar);

    }
}
