package day10_arrays_arrayList;

public class C04_ArraydekiPozitifSayilariToplama {

    public static void main(String[] args) {

        // verilen 2 katli arrayde kac tane pozitif sayi oldugunu
        // ve bu pozitif sayilarin toplamini yazdirin

        int[][] arr = {{1,-2},{3,-5,6,3},{1,-4,7,8,-5}};

        int pozitifSayiAdedi = 0;
        int pozitifSayilarToplami = 0;

        for (int i = 0; i < arr.length ; i++) { // outer array'i kontrol eder
            for (int j = 0; j <arr[i].length ; j++) { // her bir inner array'deki elementleri

                if (arr[i][j] > 0){
                    pozitifSayilarToplami += arr[i][j];
                    pozitifSayiAdedi++;
                }

            }
        }

        System.out.println("Array'de " + pozitifSayiAdedi + " adet pozitif sayi var ve toplamlari : " +
                            pozitifSayilarToplami);

        // Array'de 7 adet pozitif sayi var ve toplamlari : 29
    }
}
