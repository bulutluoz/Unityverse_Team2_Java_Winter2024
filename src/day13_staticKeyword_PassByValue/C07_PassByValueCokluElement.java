package day13_staticKeyword_PassByValue;

import java.util.Arrays;

public class C07_PassByValueCokluElement {

    public static void main(String[] args) {

        // verilen bir array'in elemanlarini 2'ser artirip kaydeden
        // ve sonra yeni halini yazdiran bir method olusturun

        int[] arr = {3,4,5};

        elemanlari2Artir(arr); // Method'da yazdirilan sonuc : [5, 6, 7]

        System.out.println("method call'dan sonra main method'daki arr : " + Arrays.toString(arr));
        // method call'dan sonra main method'daki arr : [5, 6, 7]

    }


    public static void elemanlari2Artir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            arr[i] +=2;
        }

        System.out.println("Method'da yazdirilan sonuc : " + Arrays.toString(arr));
    }
}
