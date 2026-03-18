package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    static void main() {
        LocalDate lc1 = LocalDate.now();


        lc1 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(lc1);

        lc1 = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(lc1);

        lc1 = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        System.out.println(lc1);

        lc1 = LocalDate.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println(lc1);

        lc1 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lc1);

    }

}
