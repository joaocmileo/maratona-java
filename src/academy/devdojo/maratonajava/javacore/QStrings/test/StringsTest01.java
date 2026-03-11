package academy.devdojo.maratonajava.javacore.QStrings.test;

public class StringsTest01 {
    static void main() {
        String nome = "João Paulo";
        String nome2 = "João Paulo";
        String nome3 = new String("João Paulo");
        System.out.println(nome.equals(nome2));
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome3));
        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());
    }
}
