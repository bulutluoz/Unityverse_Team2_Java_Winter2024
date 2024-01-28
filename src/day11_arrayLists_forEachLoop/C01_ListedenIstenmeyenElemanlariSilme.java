package day11_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ListedenIstenmeyenElemanlariSilme {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>();
        isimler.add("Ece");
        isimler.add("Eren");
        isimler.add("Tugce");
        isimler.add("Kaan");
        isimler.add("Gokturk");

        String istenmeyenHarf = "e";
        System.out.println(isimler); // [Ece, Eren, Tugce, Kaan, Gokturk]

        System.out.println(istenmeyenIsimleriTemizle(isimler, istenmeyenHarf));
        // [Kaan, Gokturk]

        System.out.println(istenmeyenIsimleriTemizle(isimler,"r"));
        // [Kaan]

        System.out.println(istenmeyenIsimleriTemizle(isimler,"a"));
        // []

    }

    public static List<String> istenmeyenIsimleriTemizle(List<String> isimler , String istenmeyenHarf){

        for (int i = 0; i < isimler.size() ; i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i)); // isim silindiginde indeksler kayacagi icin i-- yazdik
                i--;
            }
        }

        return isimler;
    }
}
