package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    static void main() {
        LocalDateTime aniversario = LocalDateTime.of(-1, Month.SEPTEMBER, 24,7,0,0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario,now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println(ChronoUnit.DECADES.between(aniversario,now));
        System.out.println(ChronoUnit.YEARS.between(aniversario,now));
        System.out.println(ChronoUnit.ERAS.between(aniversario,now));
        System.out.println(ChronoUnit.CENTURIES.between(aniversario,now));
    }
}
