package day09_arrays;

import java.util.Arrays;

public class C02_ElemanlariArtirma {

    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        //        bize donduren bir method olusturun.
        //        Eski array’i yeni haliyle kaydedin.


        int[] arr = {5,7,1,4,9};

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += 2;
        }

        System.out.println(Arrays.toString(arr)); // [7, 9, 3, 6, 11]


        // artis miktarini soyledigimizde o sayi kadar artiran bir method olusturalim

        int[] arr2 ={4,6,8};

        arr2 = arrayinElemanlariniArtir(arr2,3);

        System.out.println(Arrays.toString(arr2)); // [7, 9, 11]


        arr2 = arrayinElemanlariniArtir(arr2,5);

        System.out.println(Arrays.toString(arr2)); // [12, 14, 16]

    }

    public static  int[] arrayinElemanlariniArtir(int[] arr , int artisMiktari){

        for (int i = 0; i <arr.length ; i++) {

            arr[i] += artisMiktari;
        }

        return arr;
    }
}
