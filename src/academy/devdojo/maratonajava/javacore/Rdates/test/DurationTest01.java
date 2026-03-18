package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.domain.Local;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    static void main() {

        LocalTime localTime = LocalTime.now();
        LocalTime localAdiantado = LocalTime.now().plusHours(10);
        Duration duration = Duration.between(localTime,localAdiantado);
        System.out.println(duration);
        Duration duracao = Duration.of(10, ChronoUnit.DAYS);
        System.out.println(duracao);


    }
}
