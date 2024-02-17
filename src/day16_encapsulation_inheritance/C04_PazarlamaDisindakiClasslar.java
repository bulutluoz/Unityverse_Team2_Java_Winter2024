package day16_encapsulation_inheritance;

public class C04_PazarlamaDisindakiClasslar {

    public static void main(String[] args) {

        C03_Pazarlama pazarlama = new C03_Pazarlama();
        /*
            access modifier ile konsolda yazdirma (read) ile
            variable'a deger atama (write) yetkileri
            birbirinden ayrilamaz

            Eger read ve write yetkilerini ayirmak isterseniz
            once access modifier ile erisimi kapatip
            yetki ayirmak istediginiz class uyelerini
            encapsule etmelisiniz

            Encapsule ettikten sonra
            istenen yetkiye uygun public method'lar olusturacagiz


         */

        // pazarlama.satisTutari = 50;
        // System.out.println(pazarlama.satisTutari); // 50

        // System.out.println(pazarlama.toplamSatisTutari); // 0
        // pazarlama.toplamSatisTutari = 400;


        System.out.println(pazarlama.getToplamSatisTutari()); // 0

        // pazarlama.getToplamSatisTutari() = 30; // Variable expected

        pazarlama.setSatisTutari(40);
        pazarlama.setSatisTutari(50);
        pazarlama.setSatisTutari(30);
        pazarlama.setSatisTutari(20);

        System.out.println(pazarlama.getToplamSatisTutari());// 140



    }
}
