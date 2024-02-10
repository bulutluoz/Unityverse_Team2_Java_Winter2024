package day14_immutableClasses_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C07_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2024-02-10

        LocalDate tarihJaponya = LocalDate.now(ZoneId.of("Japan"));
        LocalTime saatJaponya = LocalTime.now(ZoneId.of("Japan"));

        System.out.println(tarihJaponya); // 2024-02-11
        System.out.println(saatJaponya); // 03:09:10.050196

        System.out.println(tarih.getDayOfWeek()); // SATURDAY
        System.out.println(tarih.getDayOfYear()); // 41
        System.out.println(tarih.getMonth()); // FEBRUARY

        System.out.println(tarih.plusYears(3).plusMonths(7).plusDays(10));
        // 2027-09-20

        System.out.println(tarih.isLeapYear()); // true

        LocalDate eskiTarih = LocalDate.of(1940,1,1);
        System.out.println(eskiTarih.isLeapYear()); // true

        System.out.println(tarih.lengthOfYear()); // 366

        System.out.println(eskiTarih.datesUntil(tarih).count()); // iki tarih arasindaki gun sayisi




    }
}
