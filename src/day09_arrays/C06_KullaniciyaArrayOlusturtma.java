package day09_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //         array’i olusturan ve bize donduren bir method olusturun.

        int[] kullaniciArr = intArrayOlustur();
        System.out.println(Arrays.toString(kullaniciArr));
    }

    public static int[] intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olusturulacak array'in eleman sayisini giriniz...");
        int verilenLength = scanner.nextInt();

        int[] arr = new int[verilenLength];

        for (int i = 0; i <verilenLength ; i++) {

            System.out.println("Array'e eklemek icin " + i + ". indexdeki sayiyi giriniz");

            arr[i] = scanner.nextInt();
        }

        return arr;
    }

}
