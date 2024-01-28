package day11_arrayLists_forEachLoop;

public class C06_ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {2,4,6,5,4,6,7,1,2,4,6,9,7,3,4,5,6};

        // tum elementleri yan yana arada bir bosluk ile yazdiralim

        // for-each loop'da 3 seyi yazmaliyiz
        //  1- hangi data turunde elemanlarla islem yapacagiz
        //  2- getirilen elemani, loop icerisinde kullanabilecegimiz variable ismi
        //  3- islem yapacagimiz elemanlar nereden gelecek?

        for (int each : arr
             ) {
            System.out.print(each + " ");
        } // 2 4 6 5 4 6 7 1 2 4 6 9 7 3 4 5 6
        System.out.println("");

        // verilen array'deki tum elemanlari toplayip, sonucu yazdirin

        int toplam = 0;

        for (int each: arr
             ) {
            toplam += each ;

        }

        System.out.println("Toplam : " + toplam);

        // verilen array'deki tek sayi adedini yazdirin

        int sayac = 0;

        for (int each : arr
             ) {

            if (each % 2 != 0){
                sayac++;
            }
        }

        System.out.println("Array'deki tek sayi adedi : " + sayac);
    }
}
