package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main() {
        List<String> mangas = new ArrayList<>(6);
        List<Integer> numbers = new ArrayList<>(6);
        mangas.add("Nanatsu Taisai");
        mangas.add("Demon's Slayer");
        mangas.add("Attack on Titan");
        mangas.add("Pokemon");
        mangas.add("Naruto");
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);


        for (String string : mangas) {
            System.out.println(string);
        }
        Collections.sort(mangas);
        System.out.println("-".repeat(25));
        for (String string : mangas) {
            System.out.println(string);
        }
        System.out.println("-".repeat(25));

        for (Integer number : numbers) {
            System.out.println(number);
        }

        Collections.sort(numbers);
        System.out.println("-".repeat(25));
        for (Integer number : numbers) {
            System.out.println(number);
        }


    }
}
