package day14_immutableClasses_dateTime;

import java.util.Arrays;

public class C01_PassByValueOzet {



    public static void main(String[] args) {

        /*
            pass By Value veya pass By reference programlama dillerinin verecegi bir karardir
            ve Java Pass By Value'yu secmistir.

            Pass By Value : Method'lar arasinda variable gonderimi yapmak istedigimizde
            variable'in kendisini degil, degerini (value) gonderme demektir.

            EGER method'lar arasinda gecis yapan variable
            array veya arrayList gibi birden fazla eleman barindiran bir obje ise
            Java method'da bu objeye yeni deger atanirsa
            method'da yapilan atama, method'da kalir

            ama eger objeye atama yapilmadan, sadece objenin icindeki elementlere
            atamalar yapilirsa, degisiklikler kalici olur.

         */
        int sayi = 10;

        System.out.println(ikiKatinaCikar(sayi)); // 20

        System.out.println("method call'dan sonra sayi : " + sayi);
        // method call'dan sonra sayi : 10

        int[] arr = {1,2,3};

        arrayeYeniDegerAta(arr);

        System.out.println("ilk method call'dan sonra arr : " + Arrays.toString(arr));
        // ilk method call'dan sonra arr : [1, 2, 3]

        arrayinElemanlariniDegistir(arr);

        System.out.println("ikinci method call'dan sonra arr : " + Arrays.toString(arr));

        // ikinci method call'dan sonra arr : [5, 8, 10]

    }


    public static int ikiKatinaCikar(int sayi){

        sayi = sayi*2;

        return sayi;
    }

    public static void arrayeYeniDegerAta(int[] arr){

        int[] arr2 = {5,6,7,8};

        arr = arr2;

        System.out.println("arraye deger ata methodunda arr : " + Arrays.toString(arr));
        // arraye deger ata methodunda arr : [5, 6, 7, 8]
    }

    public static void arrayinElemanlariniDegistir(int[] arr){

        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 10;

        System.out.println("eleman degistirme methodunda arr : " + Arrays.toString(arr));
        // eleman degistirme methodunda arr : [5, 8, 10]
    }

}
