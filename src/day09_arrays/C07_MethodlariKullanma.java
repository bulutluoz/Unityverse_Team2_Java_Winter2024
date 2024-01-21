package day09_arrays;

import java.util.Arrays;

public class C07_MethodlariKullanma {

    public static void main(String[] args) {

        int[] arr = {5,8,1};

        // arr'in tum elemanlarini 4 artirin

        arr = C02_ElemanlariArtirma.arrayinElemanlariniArtir(arr,4);

        System.out.println(Arrays.toString(arr)); // [9, 12, 5]

        // arr'nin pozitif elementlerinin toplamini yazdirin

        System.out.println("Pozitif elemanlar toplami :" + C03_ArrayElemanlariToplama.pozitifElemanlariTopla(arr));



    }
}
