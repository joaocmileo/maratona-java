package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lula");
        nomes.add("Flavio Bolsonaro");
        nomes.add("Renan Santos");
        nomes.add("Romeu Zema");

        for (String nome: nomes){
            System.out.println(nome);
        }
        nomes.remove("Renan Santos");
        nomes.addFirst("Renan Santos");
        int interadorTest = 0;
        for (int i = 0; i < 4; i++) {
            nomes.add("Renan Santos".concat(Integer.toString(interadorTest)));
            interadorTest++;
        }

        System.out.println("-".repeat(10));
        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
