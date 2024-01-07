package day04_ifElseStatements;

public class C14_Ternary {

    public static void main(String[] args) {

        int sayi = -6;

        // verilen sayiyi kontrol edip
        // sayi pozitif ise degerini 2 katina cikarin
        // sayi pozitif degilse degerini 10 artirin

        if (sayi>0){

            sayi *= 2;
        }else {
            sayi +=10;
        }

        System.out.println("Sayinin yeni degeri : " + sayi);


        int sayi2 = -15;

        sayi2 = sayi2>0 ? sayi2*2 : sayi2+10 ;

        System.out.println("Sayi2'nin yeni degeri : " + sayi2);


    }
}
