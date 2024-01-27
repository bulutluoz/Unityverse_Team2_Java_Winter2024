package day10_arrays_arrayList;

public class C03_ArraydekiTumElementleriKullanma {

    public static void main(String[] args) {

        int[] sayilar = {3,6,7,8,5};

        // sayilar array'indeki tum elementleri toplayin

        int sayilarToplami = 0;

        for (int i = 0; i <sayilar.length ; i++) {

            sayilarToplami += sayilar[i];
        }

        System.out.println(sayilarToplami); // 29

        sayilarToplami = 0;

        int[][] arr = {{1,2},{3,5,6},{1,4,7,8,5}};

        for (int i = 0; i < arr.length; i++) { // outer array'i kontrol eder
            for (int j = 0; j <arr[i].length ; j++) { // her bir inner array'deki elementleri kontrol eder

                sayilarToplami += arr[i][j];
            }

        }

        System.out.println(sayilarToplami); // 37
    }
}
