package day06_stringManipulations_ForLoop;

public class C09_ForLoop {

    public static void main(String[] args) {

        // 1'den 50'ye kadar (50 dahil) tum sayilari yazdirin

        for (int i = 1; i <=50 ; i++) {

            System.out.print(i + " ");
        }

        System.out.println("");

        // 40'dan baslayip 200'e kadar 7'ser 7'ser artirarak sayilari yazdirin(sinirlar dahil)

        for (int i = 40; i <=200 ; i+=7 ) {

            System.out.print(i + " ");
        }

        System.out.println("");

        // 123 ile 378(sinirlar dahil) arasinda 7 ile bolunebilen sayilari yazdirin

        for (int i = 123; i <=378 ; i++) {

            if ( i % 7 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // 2 basamakli pozitif tamsayilardan, 8 ile blunebilenleri, buyukten kucuge dogru yazdirin

        for (int i = 99; i >=10 ; i--) {

            if ( i % 8 == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        // 43 ile 189 arasindaki(sinirlar dahil) cift sayilari toplayin

        int toplam = 0;

        for (int i = 43; i <=189 ; i++) {

            if ( i % 2 == 0){
                toplam += i;
            }
        }

        System.out.println(toplam);
    }
}
