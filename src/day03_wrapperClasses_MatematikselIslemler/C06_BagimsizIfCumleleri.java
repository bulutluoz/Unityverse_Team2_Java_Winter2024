package day03_wrapperClasses_MatematikselIslemler;

public class C06_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
            BAGIMSIZ if cumleleri
            adindan anlasilacagi gibi, kodun geriye kalanindan bagimsizdir
            if keyword'den sonra yazilan boolean sarta odaklanir

            boolean sart true ise if body calisir
            bolean sart false ise if body CALISMAZ

            kodumuzda bagimsiz if cumleleri varsa
            - hic bir if body calismayabilir
            - bazi if body'leri calisip, bazilari calismayabilir
            - veya tum if body'leri calisabilir
         */

        int a = 23;
        int b = 40;

        // Eger a b'den buyukse, "a daha buyuk" yazdirin

        if (a>b){
            System.out.println("a daha buyuk");
        }

        // Eger a cift bir sayi ise "a cift sayi" yazdirin

        if ( a % 2 == 0 ){
            System.out.println("a cift sayi");
        }


        // b tek sayi ise "b tek sayi" yazdirin

        if ( b % 2 != 0){
            System.out.println("b tek sayi");
        }



    }
}
