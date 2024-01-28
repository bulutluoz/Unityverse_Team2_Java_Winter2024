package day11_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_FibonacciDizisi {

    public static void main(String[] args) {

        //Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //        bize ilk n tane tane Fibonacci sayisini bir list olarak donduren
        //        bir method olusturun.
        //        Fibonacci Dizisi : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,


        System.out.println(ilkNtaneFibonacciSayisi(5));
        System.out.println(ilkNtaneFibonacciSayisi(10));
        System.out.println(ilkNtaneFibonacciSayisi(20));
        System.out.println(ilkNtaneFibonacciSayisi(30));

    }

    public static List<Integer> ilkNtaneFibonacciSayisi(int sayiAdedi){

        List<Integer> fibonacciSerisi = new ArrayList<>();


        if (sayiAdedi <= 0) {
            System.out.println("sayi adedi 0'dan buyuk olmadigindan bos liste olusturdum");
        } else if (sayiAdedi == 1) {
            fibonacciSerisi.add(0);
        } else if (sayiAdedi == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else{ // istenen sayi adedi 2'den fazla

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i <= sayiAdedi-1 ; i++) {

                fibonacciSerisi.add(fibonacciSerisi.get(i-2) + fibonacciSerisi.get(i-1));
            }


        }


        return fibonacciSerisi;
    }
}
