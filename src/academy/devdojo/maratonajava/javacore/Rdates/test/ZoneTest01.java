package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    static void main() {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        // System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneAuckland = ZoneId.of("Pacific/Auckland");

        System.out.println(localDateTime.atZone(zoneAuckland));

        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneAuckland);
        System.out.println(zonedDateTime);

    }
}
