package day14_immutableClasses_dateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class C06_FarkliSaatleriKarsilastirma {

    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(20,45);
        LocalTime saat2 = LocalTime.of(15,25);

        System.out.println(saat1.isBefore(saat2)); // false
        System.out.println(saat1.isAfter(saat2)); // true

        System.out.println(saat2.until(saat1, ChronoUnit.MINUTES)); // 320
        System.out.println(saat2.until(saat1, ChronoUnit.SECONDS)); // 19200

        // bir islemin ne kadar surdugunu bulalim

        // baslangic ve bitis zamanlarini localTime olarak kaydedip


        LocalTime baslangic = LocalTime.now();
        System.out.println("Baslangic zamani : " + baslangic);

        for (int i = 0; i <100000 ; i++) {

            for (int j = 0; j <100000 ; j++) {
                for (int k = 0; k < 10; k++) {

                }
            }
        }

        LocalTime bitis = LocalTime.now();
        System.out.println("Bitis zamani : " + bitis);

        //    until() ile aradaki zamani bulabiliriz
        System.out.println(baslangic.until(bitis,ChronoUnit.SECONDS)); // 3

        // toSecondOfDay

        System.out.println(bitis.toSecondOfDay() - baslangic.toSecondOfDay()); // 3

        // tonanoOfDay
        System.out.println(bitis.toNanoOfDay() - baslangic.toNanoOfDay()); // 3243809000




    }
}
