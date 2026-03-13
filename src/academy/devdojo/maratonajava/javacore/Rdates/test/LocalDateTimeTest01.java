package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    static void main() {

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDate localDate = LocalDate.of(2026,7,12);
        LocalTime localTime = LocalTime.of(12,19,43);

      LocalDateTime ldt2 = localDate.atTime(localTime);
        System.out.println(ldt2);
    }
}
