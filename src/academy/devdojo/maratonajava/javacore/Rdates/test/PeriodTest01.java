package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    static void main() {

        LocalDate now = LocalDate.now();
        LocalDate depois = LocalDate.now().plusWeeks(3);
        Period p1 = Period.between(now,depois);
        Period p2 = Period.of(3,1,3);
        Period p3 = Period.ofDays(123);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}
