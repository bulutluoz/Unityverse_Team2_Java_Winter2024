package day13_staticKeyword_PassByValue;

import java.util.Arrays;

public class C08_PassByValueCokluElement {

    public static void main(String[] args) {

        // verilen int bir array'in degerlerine bakmadan
        // uzunluk olarak ayni uzunlukta ama tum elementleri 1 olan yeni bir array olusturup
        // eski array'e bu yeni degeri atayan
        // ve array'in son halini yazdiran bir method olusturun

        int[] arr = {3,4,5};
        yeniArrayOlustur(arr); // method'da arr'nin son hali : [1, 1, 1]

        System.out.println("method call'dan sonra main method'daki arr : " + Arrays.toString(arr));
        // method call'dan sonra main method'daki arr : [3, 4, 5]

    }

    public static void yeniArrayOlustur(int[] arr){

        int[] yeniArr = new int[arr.length];

        for (int i = 0; i < yeniArr.length ; i++) {

            yeniArr[i] = 1;
        }

        arr = yeniArr;

        System.out.println("method'da arr'nin son hali : " + Arrays.toString(arr));
    }
}
