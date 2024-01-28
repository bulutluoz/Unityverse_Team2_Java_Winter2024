package day11_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_HastaneRunner {

    public static void main(String[] args) {

        C09_Hastane pers1 = new C09_Hastane();

        System.out.println(pers1.persIsmi); // belirtilmedi
        System.out.println(pers1.persAdres); // girilmedi
        System.out.println(pers1.persTel); // girilmedi

        pers1.persIsmi = "Ali";
        pers1.persAdres = "Sincan";
        pers1.persTel = "5343454545";

        System.out.println(pers1.persIsmi); // Ali
        System.out.println(pers1.persAdres); // Sincan
        System.out.println(pers1.persTel); // 5343454545

        C09_Hastane pers2 = new C09_Hastane();

        System.out.println(pers2.persIsmi); // belirtilmedi
        System.out.println(pers2.persAdres); // girilmedi
        System.out.println(pers2.persTel); // girilmedi

        Scanner scanner = new Scanner(System.in);
        List<String> liste = new ArrayList<>();



    }
}
