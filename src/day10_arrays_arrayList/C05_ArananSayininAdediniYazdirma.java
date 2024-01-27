package day10_arrays_arrayList;

public class C05_ArananSayininAdediniYazdirma {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{3,5,6,3},{1,4,7,8,5,3}};
        int arananSayi = 5;

        // Verilen 2 katli bir array'de
        // istenen sayinin kac defa kullanildigini yazdiran bir method olusturun

        kullanimAdediyazdir(arr,5); // Aradiginiz 5, array' de 2 adet kullanilmis

        kullanimAdediyazdir(arr,3); // Aradiginiz 3, array' de 4 adet kullanilmis

        // array'deki tum elemanlarin ortalamasini yazdiran bir method olusturun

    }

    public static void kullanimAdediyazdir(int[][] arr , int arananSayi){

        int kullanimAdedi = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j] == arananSayi){
                    kullanimAdedi++;
                }
            }
        }

        System.out.println("Aradiginiz " + arananSayi + ", array' de " + kullanimAdedi + " adet kullanilmis");

    }

    public static void elemanlarinOrtalamasiniYazdir(int[][] arr){

        double ortalama = 0;
        int elemanSayisi = 0;
        double elemanlarinToplami = 0;


    }
}
