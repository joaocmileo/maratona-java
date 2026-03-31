package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest {
    static void main() {
        Smartphone smartphone = new Smartphone("iPhone","sccp1910CdB");
        Smartphone smartphone2 = new Smartphone("iPhone","sccp1910CdB");
        System.out.println(smartphone.equals(smartphone2));
    }
}
