package day14_immutableClasses_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C08_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2024-02-10T19:19:20.637394


        LocalDate dogumTarihi = LocalDate.of(2004,3,17);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(dogumTarihi,bugun);

        System.out.println(period); // P19Y10M24D

        System.out.println(period.getYears()); // 19



    }
}
