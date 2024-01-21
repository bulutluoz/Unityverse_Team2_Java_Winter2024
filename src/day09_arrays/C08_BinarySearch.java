package day09_arrays;

import java.util.Arrays;

public class C08_BinarySearch {

    public static void main(String[] args) {

        int[] arr = {3,6,1,8,15,4,7};

        System.out.println(Arrays.binarySearch(arr,4)); // -2

        System.out.println(Arrays.binarySearch(arr,15)); // -8

        System.out.println(Arrays.binarySearch(arr,1)); // -1

        System.out.println(Arrays.binarySearch(arr, 7)); // -4

        // Binarysearch bize aradigimiz elemanin ilk kullaniminin index'ini verir
        // ANCAK binarysearch'in saglikli calismasi icin once sort yapmalisiniz

        Arrays.sort(arr); //

        System.out.println(Arrays.toString(arr)); // [1, 3, 4, 6, 7, 8, 15]

        System.out.println(Arrays.binarySearch(arr,4)); // 2

        System.out.println(Arrays.binarySearch(arr,15)); // 6

        System.out.println(Arrays.binarySearch(arr,1)); // 0

        System.out.println(Arrays.binarySearch(arr, 7)); // 4

        // olmayan bir elemani aratsak
        // olmayan elemanlarin olmadigini vurgulamak icin basa - koyar
        // ve olsaydi HANGI SIRADA olacagini bulup onu yazdiriyor

        System.out.println(Arrays.binarySearch(arr, 2)); // -2

        System.out.println(Arrays.binarySearch(arr, 5)); // -4

        System.out.println(Arrays.binarySearch(arr, 10)); // -7

        System.out.println(Arrays.binarySearch(arr, 13)); // -7

        System.out.println(Arrays.binarySearch(arr, 17)); // -8

        System.out.println(Arrays.binarySearch(arr, -7)); // -1
    }
}
