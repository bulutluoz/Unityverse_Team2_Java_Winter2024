package day11_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_NestedForEachLoop {
    public static void main(String[] args) {

        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //        ikisinde ortak olan elementleri ayri bir liste olarak veren
        //        bir program yazin.


        int[] arr1 = {3,6,8,9,10,3,8,5};
        int[] arr2 = {5,7,9,9,1,3,9,3,1,5};

        List<Integer> ortakElementlerListesi = new ArrayList<>();


        for (int eachArr1 : arr1
             ) {

            for (int eachArr2 : arr2
                 ) {

                if (eachArr1 == eachArr2 && !ortakElementlerListesi.contains(eachArr1)){
                    ortakElementlerListesi.add(eachArr1);
                }
            }
        }

        System.out.println(ortakElementlerListesi); //

    }
}
