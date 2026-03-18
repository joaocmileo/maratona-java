package academy.devdojo.maratonajava.javacore.Rdates.test;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = switch (dayOfWeek) {
            case THURSDAY -> 4;
            case FRIDAY -> 3;
            case SATURDAY -> 2;
            default -> 1;
        };
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}


public class TemporalAdjusterTest02 {
    static void main() {
        LocalDate now = LocalDate.now();

        now = now.withDayOfMonth(18);
        now = now.with(new ObterProximoDiaUtil());
        System.out.println(now.getDayOfWeek());

}}
