package day11_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C07_CumledekiHarfinKullanimSayisiniBulma {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //         harf case sensitive olmadan,
        //         cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz..."); // Ali topu at, at ali at

        String cumle = scanner.nextLine();

        System.out.println("Cumlede aramak istediginiz harfi girin"); // a
        String arananHarf = scanner.nextLine();


        String[] karakterler = cumle.split("");
        // [A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , a, l, i,  , a, t]

        int sayac = 0;

        for (String each : karakterler
             ) {

            if (each.equalsIgnoreCase(arananHarf)){
                sayac++;
            }

        }


        if (sayac == 0){
            System.out.println("harf cumlede kullanilmamis");
        }else{
            System.out.println(arananHarf + " harfi cumlede " + sayac + " kez kullanilmis");
        }

    }
}
