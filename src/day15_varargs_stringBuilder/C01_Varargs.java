package day15_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        toplam(3,4); // Iki sayinin toplami : 7
        toplam(3,4,5); // Uc sayinin toplami : 12

        carpim(); // 1
        carpim(2); // 2
        carpim(2,3); // 6
        carpim(2,3,4); // 24
        carpim(2,3,4,5,6,7); // 5040
        /*
            Bir method'a farkli sayida argumentler yollayabilmek istedigimizde
            method'da parametre olarak varargs kullaniriz

            java yollanan tum argumentleri bir array olarak kaydeder
         */

    }


    public static void toplam(int a, int b){
        System.out.println("Iki sayinin toplami : " + (a+b) );
    }

    public static void toplam(int a, int b, int c){
        System.out.println("Uc sayinin toplami : " + (a+b+c) );
    }

    public static void carpim(int... a){// int... sayi :  yolladiklari kadar int'in hepsini al
                                        // a : int degerler barindiran bir array olur
        // method verilen array'in tum elemanlarinin carpimi haline gelmis olur

        int carpim = 1;

        for ( int each: a
             ) {

            carpim *= each;
        }

        System.out.println("Tum elementlerin carpimi : " + carpim);

    }



}
