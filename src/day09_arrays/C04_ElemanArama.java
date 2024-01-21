package day09_arrays;

public class C04_ElemanArama {

    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de
        //         istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,5,6,7,5,4,3,2,3,5,7,8,9,7,4,3,2,4,6,2,1,4};
        int arananSayi = 4;

        kullanimSayisiYazdir(arr,4); // Aradiginiz 4 sayisi array'de 4 kere kullanilmis
        kullanimSayisiYazdir(arr,3); // Aradiginiz 3 sayisi array'de 4 kere kullanilmis
        kullanimSayisiYazdir(arr,11); // Aradiginiz sayi array'de yok


    }

    public static void kullanimSayisiYazdir(int[] arr , int arananSayi){

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Aradiginiz sayi array'de yok");
        }else{
            System.out.println("Aradiginiz " + arananSayi + " sayisi array'de " + sayac +" kere kullanilmis");
        }
    }
}
