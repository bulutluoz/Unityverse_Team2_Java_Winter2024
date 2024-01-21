package day09_arrays;

public class C05_EnUzunEnKisaKelime {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] isimler = {"Cem","Ergun","Vildan", "Ece","Ali","Eren","Kaan","Canan","Ibrahim"};

        enUzunEnKisayiyazdir(isimler);
    }

    public static void enUzunEnKisayiyazdir(String[] arr){

        String enuzunIsim = arr[0];
        String enKisaIsim = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > enuzunIsim.length()){
                enuzunIsim = arr[i];
            }


            if (arr[i].length() < enKisaIsim.length()){
                enKisaIsim = arr[i];
            }


        }

        System.out.println("En uzun isim : " + enuzunIsim);
        System.out.println("En kisa isim : " + enKisaIsim);
    }
}
