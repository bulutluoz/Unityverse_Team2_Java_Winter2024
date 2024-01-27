package day10_arrays_arrayList;

import java.util.Arrays;

public class C01_ArrayinUzunlugunuDegistirmek {

    public static void main(String[] args) {

        int[] arr = {2,9,4};

        System.out.println(arr[0]); // 2
        arr[2] = 6;

        System.out.println(Arrays.toString(arr)); // [2, 9, 6]


        // varolan array'e 4.eleman olarak 8 ekleyin

        // arr[3] = 8; // ArrayIndexOutOfBoundsException

        // varolan 6 elementini silip, array'i 2 elemandan olusan bir hale donusturun

        /*
            Array'i olustururken 2 seyi deklare etmek zorundayiz
            1- Array'in icine koyacagimiz elementlerin data turu int[] , String[]
            2- Array'in icine koyacagimiz element sayisi
                int[] arr1 = {3,6,7,8}  ==> arr1'in length'i 4 olacak
                int[] arr2 = new int[5] ==> [0, 0, 0, 0, 0]

            Belirlenen uzunluk yeni eleman ekleyerek artirilamaz,
            veya eleman silinerek length azaltilamaz

            Array'in uzunlugunu degistirmek istersek
            array'e yeniden bir deger atamamiz gerekir
         */

        System.out.println(Arrays.toString(arr)); // [2, 9, 6]

        // eger 4.eleman olarak 10 eklemek istersek


        // ya once 4 eleman alabilecek yeni bir deger atamasi yapar,
        // sonra degerleri tek tek atama yapariz

        arr = new int[4]; // [0, 0, 0, 0]
        arr[0] = 2;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;

        System.out.println(Arrays.toString(arr)); // [2, 9, 6, 10]

        // arr'ye 5.element olarak 3 ekleyelim
        // Bunu kodlarla yapacaksak, once yeni bir array olustururuz

        int[] yeniArr = new int[arr.length+1]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        }


        System.out.println(Arrays.toString(yeniArr)); // [2, 9, 6, 10, 0]

        yeniArr[4] = 3;

        System.out.println(Arrays.toString(yeniArr)); // [2, 9, 6, 10, 3]

        arr = yeniArr;

        System.out.println("arr'nin son hali : " + Arrays.toString(arr));
        // arr'nin son hali : [2, 9, 6, 10, 3]


        // arr'nin sonundaki 3 elemanini silip arr'yi 4 elemanli hale getirelim
        // arr = {2, 9, 6, 10};

        int[] yeniArr2 = {2,9,6,10};
        arr = yeniArr2;

    }
}
