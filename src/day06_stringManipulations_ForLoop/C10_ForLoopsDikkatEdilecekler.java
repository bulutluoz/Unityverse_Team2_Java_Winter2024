package day06_stringManipulations_ForLoop;

public class C10_ForLoopsDikkatEdilecekler {

    public static void main(String[] args) {

        // 1- islem sonucunu for loop disinda yazdirmalisiniz
        //    loop body'sinde yazilirsa, her dongude tekrar tekrar sonucu yazdirir

        // 10 ile 20 arasindaki(sinirlar dahil) tum sayilari toplayin ve sonucu yazdirin

        int toplam = 0;

        for (int i = 10; i <=20 ; i++) {

            toplam += i;

        }

        System.out.println(toplam);


        // 2- Eger degisken bitis kosulundan uzaklasiyorsa
        //    loop teknik olarak SONSUZ LOOP olarak adlandirilir

        /*
        for (int i = 0; i <10 ; i--) {
            System.out.print(i + " ");
        }

         */

        // 3- Eger baslangic degeri bitis sartini true yapmazsa
        //    loop body'si hic devreye girmez
        //    BU DURUMDA : Kodumuz calismistir, for loop devreye girmistir
        //                 ancak i<1 false oldugundan for loop body'si DEVREYE GIRMEMISTIR

        for (int i = 10; i <1 ; i++) {
            System.out.println( i + " ");
        }

        System.out.println("3.loop calisip bitti");



    }
}
