package academy.devdojo.maratonajava.javacore.QStrings.test;

public class StringBuilderTest01 {
    static void main() {
        StringBuilder sb = new StringBuilder("Tche tche");

        // sb.repeat("Lula",2);
        // sb.deleteCharAt(2);
        //sb.delete(1,5);
        //sb.insert(3,"teste");
        System.out.println(sb.hashCode());
        System.out.println(sb);
    }
}
