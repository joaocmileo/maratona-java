package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    static void main() {
        LocalTime tempo = LocalTime.now();
        System.out.println(tempo);
        System.out.println(tempo.getHour());
        System.out.println(tempo.getMinute());
        System.out.println(tempo.toSecondOfDay());
        System.out.println(tempo.toString());
        System.out.println(tempo.toNanoOfDay());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);
    }
}
