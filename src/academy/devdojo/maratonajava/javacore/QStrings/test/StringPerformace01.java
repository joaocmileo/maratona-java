package academy.devdojo.maratonajava.javacore.QStrings.test;

public class StringPerformace01 {
    static void main() {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println(fim-inicio+"ms");
        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println(fim-inicio+"ms");
        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println(fim-inicio+"ms");
    }
    public static void concatString(int vezes){
        String texto = " ";
        for (int i = 0; i < vezes; i++) {
            texto += i;
        }

    }
    public static void concatStringBuilder(int vezes){
        StringBuilder texto = new StringBuilder(" ");
        for (int i = 0; i < vezes; i++) {
           texto.append(i);
        }

    }
    public static void concatStringBuffer(int vezes){
        StringBuffer texto = new StringBuffer(" ");
        for (int i = 0; i < vezes; i++) {
            texto.append(i);
        }

    }
}
