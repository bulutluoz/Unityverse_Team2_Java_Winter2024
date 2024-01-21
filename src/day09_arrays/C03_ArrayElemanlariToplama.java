package day09_arrays;

public class C03_ArrayElemanlariToplama {

    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //        sonucu bize donduren bir method yaziniz.

        int[] arr = {2,5,6,4,3,-5,-8,4};

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){

                toplam += arr[i];
            }
        }

        System.out.println("Array'in elemanlari toplami : " + toplam);


        System.out.println(pozitifElemanlariTopla(arr)); // 24


    }

    public static int pozitifElemanlariTopla(int[] arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){

                toplam += arr[i];
            }
        }

        return toplam;
    }
}
