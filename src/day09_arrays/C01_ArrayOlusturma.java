package day09_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        int[] arr1 = new int[5]; // [0, 0, 0, 0, 0]

        String[] arr2 = new String[3]; // [null, null, null]

        String[] arr3 = {"Ali","Veli","Ayse","Canan"};

        int[] arr4 = {3, 5, 6, 7, 8};

        // Array’ler primitive data turundeki datalarin degerlerini,
        // non-primitive data turundeki datalarin ise referanslarini barindirirlar.

        // Array'le calisirken, ne ile islem yapmak istedigimize dikkat etmeliyiz

        // arr4'un 3. indeksindeki sayiyi yazdirin

        System.out.println(arr4[3]); // 7

        // arr3'un 2.indeksindeki ismi yazdirin

        System.out.println(arr3[2]); // Ayse

        // arr3'deki tum isimleri yazdirin

        for (int i = 0; i <= arr3.length-1 ; i++) { // i 0 dan son indekse kadar tum indeksleri getirecek

            System.out.print(arr3[i] + " ");

        } // Ali Veli Ayse Canan
        System.out.println("");

        // arr4'un tum elemanlarini yazdirin

        for (int i = 0; i <=arr4.length-1 ; i++) {

            System.out.print(arr4[i] + " ");
        } // 3 5 6 7 8

        System.out.println("");

        // EGER elemanlari degil de array'i bir array olarak yazdirmak istersek

        System.out.println(arr3); // [Ljava.lang.String;@3fb6a447
        // eger array'i direk yazdirmaya calisirsak, bize referansini yazdirir


        // Array'i array olarak yazdirmak icin Arrays class'indan yardim almaliyiz

        System.out.println(Arrays.toString(arr3)); // [Ali, Veli, Ayse, Canan]

        System.out.println(Arrays.toString(arr4)); // [3, 5, 6, 7, 8]

        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(arr2)); // [null, null, null]


        // Olusturulan bir array’e basta belirtilen index’den daha fazla element atanamaz
        // veya element sayisi azaltilamaz.

        // arr3'un 1.indeksindeki ismi Hasan yapalim

        arr3[1] = "Hasan";

        System.out.println(Arrays.toString(arr3)); // [Ali, Hasan, Ayse, Canan]

        // arr4'un 4.indeksindeki sayiyi 2 yapin

        arr4[4] = 2;

        System.out.println(Arrays.toString(arr4)); // [3, 5, 6, 7, 2]

        // arr4'un 5.indeksine 10 atayalim

        // arr4[5] = 10; // ArrayIndexOutOfBoundsException

        // arr4'un son elementini silin

        // array'deki method'lari kullanarak silme yapamadik


    }
}














