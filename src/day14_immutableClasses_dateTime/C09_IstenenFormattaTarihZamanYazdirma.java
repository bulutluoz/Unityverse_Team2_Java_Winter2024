package day14_immutableClasses_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C09_IstenenFormattaTarihZamanYazdirma {

    public static void main(String[] args) {

        /*
        GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar

         */

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2024-02-10T19:29:02.513795

        // 24/Mayis/2024
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(ldt.format(format1)); // 10/February/2024

        // 24 May / 19:35
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("d MMM / HH:mm");
        System.out.println(ldt.format(format2)); //  10 Feb / 19:38

        // 11052024 / 07:35 PM

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("ddMMYYYY / hh:mm a");
        System.out.println(ldt.format(format3)); // 10022024 / 07:41 PM

        // dunyada belirlenmis olan formatlari kullanmak istersek

        DateTimeFormatter format4 = DateTimeFormatter.ISO_DATE;
        System.out.println(ldt.format(format4)); // 2024-02-10

    }
}
