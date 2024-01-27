package day10_arrays_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarlariSil {

    public static void main(String[] args) {

        // verilen bir int array'de
        // tekrar eden sayilari silip
        // array'i her elemanin unique oldugu bir hale getirin

        int[] arr = {2,3,4,5,4,2,2,4,5,4,2,1,3,5,1};

        List<Integer> tekrarsizList = new ArrayList<>();


        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println(tekrarsizList); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 4, 2, 2, 4, 5, 4, 2, 1, 3, 5, 1]

        // array'den eleman silemeyiz ama array'e yeni bir deger atayabiliriz

        arr = new int[tekrarsizList.size()]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        Arrays.sort(arr);
        System.out.println("Array'in tekrarsiz hali : " + Arrays.toString(arr));


    }
}
