package day06_stringManipulations_ForLoop;

public class C14_NestedForLoop {

    public static void main(String[] args) {

        // loop kullanarak 1 2 3 4 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i + " ");
        }

        System.out.println("");

        // loop kullanarak 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + " ");
        }

        System.out.println("");

        // loop kullanarak 3 6 9 12 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
        }

        System.out.println("");

        // loop kullanarak 4 8 12 16 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + " ");
        }

        System.out.println("");


        /*
            1 2  3  4    1.satir
            2 4  6  8    2.satir
            3 6  9 12    3.satir
            4 8 12 16    4.satir

            4 satirimiz var
         */

        for (int i = 1; i <=4 ; i++) { // ilk loop satirlari kontrol edecek

            for (int j = 1; j <=4 ; j++) { // sutunlari kontrol edecek

                System.out.print(i*j + " ");
            }
            System.out.println("");
        }

    }
}
