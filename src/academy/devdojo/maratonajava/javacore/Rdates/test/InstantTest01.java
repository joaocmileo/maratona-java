package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantTest01 {
    static void main() {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(Instant.ofEpochSecond(3600,999999999));
    }
}
