package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;

public class LocalDateTest01 {
    static void main() {
        LocalDate date = LocalDate.now();
        LocalDate datePassado = LocalDate.of(2002,9,18);
        System.out.println(datePassado.getDayOfWeek());
    }
}
