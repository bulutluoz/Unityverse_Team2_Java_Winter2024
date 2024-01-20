package day08_whileLoop_scope;

public class C01_WhileLoopVsForLoop {

    public static void main(String[] args) {

        // eger tekrar miktari veya baslangic/bitis degerleri veriliyorsa for loop tercih edilir
        // Eger tekrar miktari belli degilse,
        // veya bitme sarti ana degiskenin disinda baska bir variable'a bagli ise
        // while loop tercih ederiz

        // 1'den 20'ye kadar(dahil) olan sayilarin toplamini yazdirin

        int toplam= 0 ;

        for (int i = 1; i <=20 ; i++) {
            toplam += i;
        }

        System.out.println(toplam); // 210

        // while loop da baslangic degeri, devam sarti ve artim miktarini manuel yazmaliyiz

        int sayi=0;
        toplam = 0;

        while (sayi <= 20){

            toplam += sayi ;
            sayi++;
        }
        System.out.println(toplam); // 210






    }
}
