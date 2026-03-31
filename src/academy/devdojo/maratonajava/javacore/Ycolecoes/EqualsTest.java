package academy.devdojo.maratonajava.javacore.Ycolecoes;

public class EqualsTest {
    static void main() {
        Smartphone smartphone = new Smartphone("iPhone","sccp1910CdB");
        Smartphone smartphone2 = new Smartphone("iPhone","sccp1910CdB");
        System.out.println(smartphone.equals(smartphone2));
    }
}
